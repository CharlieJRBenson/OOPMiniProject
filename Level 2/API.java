import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {

        public static void main(String[] args) throws IOException, InterruptedException {
                System.out.println(today("TSLA"));

        }

        public static String today(String symbol) throws IOException, InterruptedException {
                String url = String.format(
                                "https://alpha-vantage.p.rapidapi.com/query?interval=5min&function=TIME_SERIES_INTRADAY&symbol=%s&outputsize=compact&datatype=json",
                                symbol);
                HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .header("x-rapidapi-host", "alpha-vantage.p.rapidapi.com")
                                .header("x-rapidapi-key", "c73796f4f3msha6ba434c292e69ap1f5bf3jsn13f4cf831326")
                                .method("GET", HttpRequest.BodyPublishers.noBody())
                                .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request,
                                HttpResponse.BodyHandlers.ofString());
                return (response.body());
        }

        public static String daily(String symbol) throws IOException, InterruptedException {
                String url = String.format(
                                "https://alpha-vantage.p.rapidapi.com/query?function=TIME_SERIES_DAILY&symbol=%s&outputsize=compact&datatype=json",
                                symbol);
                HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .header("x-rapidapi-host", "alpha-vantage.p.rapidapi.com")
                                .header("x-rapidapi-key", "c73796f4f3msha6ba434c292e69ap1f5bf3jsn13f4cf831326")
                                .method("GET", HttpRequest.BodyPublishers.noBody())
                                .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request,
                                HttpResponse.BodyHandlers.ofString());
                return (response.body());
        }

        public static String weekly(String symbol) throws IOException, InterruptedException {
                String url = String.format(
                                "https://alpha-vantage.p.rapidapi.com/query?function=TIME_SERIES_MONTHLY&symbol=%s&outputsize=compact&datatype=json",
                                symbol);
                HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .header("x-rapidapi-host", "alpha-vantage.p.rapidapi.com")
                                .header("x-rapidapi-key", "c73796f4f3msha6ba434c292e69ap1f5bf3jsn13f4cf831326")
                                .method("GET", HttpRequest.BodyPublishers.noBody())
                                .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request,
                                HttpResponse.BodyHandlers.ofString());
                return (response.body());
        }

        public static String yearly(String symbol) throws IOException, InterruptedException {
                String url = String.format(
                                "https://alpha-vantage.p.rapidapi.com/query?function=TIME_SERIES_YEARLY&symbol=%s&outputsize=compact&datatype=json",
                                symbol);
                HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .header("x-rapidapi-host", "alpha-vantage.p.rapidapi.com")
                                .header("x-rapidapi-key", "c73796f4f3msha6ba434c292e69ap1f5bf3jsn13f4cf831326")
                                .method("GET", HttpRequest.BodyPublishers.noBody())
                                .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request,
                                HttpResponse.BodyHandlers.ofString());
                return (response.body());
        }

}
