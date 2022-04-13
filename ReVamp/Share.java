import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Share implements Asset {
    private float price = 100;
    private float quantity = 0;
    private String name;
    private boolean requested = false;

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
        // checks if api call has already been made
        // if (!requested) {
        // try {
        // getDaily(this.name);

        // } catch (Exception e) {
        // System.out.println("Failed API Request");
        // }
        // }

        return this.price;

    }

    @Override
    public float getQuantity() {
        return this.quantity;
    }

    @Override
    public float getTotal() {
        return getPrice() * getQuantity();
    }

    // public static String getDaily(String symbol) throws IOException,
    // InterruptedException {
    // String url = String.format(
    // "https://alpha-vantage.p.rapidapi.com/query?function=TIME_SERIES_DAILY&symbol=%s&outputsize=compact&datatype=json",
    // symbol);
    // HttpRequest request = HttpRequest.newBuilder()
    // .uri(URI.create(url))
    // .header("x-rapidapi-host", "alpha-vantage.p.rapidapi.com")
    // .header("x-rapidapi-key", PRIVATE_KEY)
    // .method("GET", HttpRequest.BodyPublishers.noBody())
    // .build();
    // HttpResponse<String> response = HttpClient.newHttpClient().send(request,
    // HttpResponse.BodyHandlers.ofString());
    // return (response.body());

    // }

}
