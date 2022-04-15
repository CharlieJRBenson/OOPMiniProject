import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.io.Serializable;

public class Share implements Asset, Serializable {
    private float price = 100;
    private float quantity = 0;
    private String name;

    public Share(String name) {
        this.name = name;
    }

    public void buy(float quant) {
        this.quantity += quant;
    }

    public void sell(float quant) {
        this.quantity -= quant;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    public void setPrice(float val) {
        this.price = val;
    }

    @Override
    public float getQuantity() {
        return this.quantity;
    }

    @Override
    public float getTotal() {
        return getPrice() * getQuantity();
    }

    public String getAPIResp() {
        // calls api
        try {
            return getDaily(this.name);
        } catch (Exception e) {
            System.out.println(e);
            return ("Failed API Request");
        }
    }

    public void update() {
        setPrice(this.price * getRand());
    }

    // gets random percentage change
    public static float getRand() {
        // gets random number of 0 - 2
        Random rand = new Random();
        int sign = (rand.nextInt(2));
        // gets percentage change eg 50/1000 = 0.05
        float pcChange = (float) rand.nextInt(99) / 1000;

        // if number is 1 then price goes down
        if (sign == 0) {
            return (1 - pcChange);
        } else {
            return (1 + pcChange);
        }

    }

    public static String getDaily(String symbol) throws IOException, InterruptedException {
        // calls to REST API with url containing symbol
        // calls get private key method
        String url = String.format(
                "https://alpha-vantage.p.rapidapi.com/query?function=TIME_SERIES_DAILY&symbol=%s&outputsize=compact&datatype=json",
                symbol);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("x-rapidapi-host", "alpha-vantage.p.rapidapi.com")
                .header("x-rapidapi-key", getPrivKey())
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request,
                HttpResponse.BodyHandlers.ofString());
        return (response.body());

    }

    private static String getPrivKey() throws IOException {
        // gets private key from file (for github safety)
        String fileName = "PRIVATE_KEY.txt";
        Path path = Paths.get(fileName);
        return new String(Files.readAllBytes(path));
    }

}
