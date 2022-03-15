public class User {
    private String name;
    private int balance;
    private String[] shares;

    public User(String name) {
        this.name = name;
        this.balance = 0;
    }

    public User(String name, int bal, String[] shares) {
        this.name = name;
        this.balance = bal;
        this.shares = shares;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public String[] getShares() {
        return this.shares;
    }
}
