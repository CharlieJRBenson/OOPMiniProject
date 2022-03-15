import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        String[] arr = { "KO", "APL", "TSLA" };
        User c = new User("charkise", 15, arr);
        System.out.println(c.getName());
        System.out.println(c.getBalance());
        System.out.println(Arrays.toString(c.getShares()));

    }
}