public class App {
    public static void main(String[] args) {
        setup();
    }

    public static void setup() {
        Account charlie = createUser("Charlie");
        Fund fundsmith = createFund("FundSmith");

        charlie.deposit(100);
        fundsmith.deposit(1000);

        buyShare(fundsmith, "TSLA", 250);
        buyShare(fundsmith, "APPL", 200);
        buyFund(charlie, fundsmith, 30);

        System.out.println("Fundsmiths assets " + fundsmith.getAssets().toString());
        System.out.println("Charlie assets " + charlie.getAssets().toString());

        System.out.println("Fundsmith Balance £" + fundsmith.getBal());
        System.out.println("Charlie Balance £" + charlie.getBal());

        System.out.println("Fundsmith Price £" + fundsmith.getPrice());
        System.out.println("Fundsmith shares owned by Charlie " + fundsmith.getTotal());

    }

    public static Fund createFund(String name) {
        return new Fund(name);
    }

    public static User createUser(String name) {
        return new User(name);
    }

    // adds Share to accounts assets
    public static void buyShare(Account acc, String name, float total) {
        // checks if share with name = name exists in accounts assets
        Asset sh = acc.getAssetByName(name);
        if (sh != null) {
            // throws error if already owned (by name)
            acc.buy(sh, total);
            System.out.println(name + " position increased by £" + total);
        } else {
            // creates new share with name
            sh = new Share(name);
            acc.buy(sh, total);
            System.out.println(name + " : £" + total + " new share purchased by " + acc.getName());
        }
    }

    public static void buyFund(Account acc, Fund fund, float total) {
        if (acc.getAssets().contains(fund))
            return;

        acc.buy(fund, total);
    }

    // removes Share from accounts assets
    public static boolean sellShare(Account acc, String name, float total) {
        // checks if share with name = name exists in accounts assets
        Asset sh = acc.getAssetByName(name);
        if (sh != null) {
            if (!acc.sell(sh, total)) {
                return false;
            }

            System.out.println(name + " position decreased by £" + total);
            return true;

        } else {
            // throws error if not owned
            System.out.println("Asset not owned");
            return false;
        }
    }

}
