
public class Fund extends Account implements Asset {
    // a fund is both an account that holds a variety of shares
    // and an asset (it's own share) of which a user can buy and sell

    private float price;
    private float quantity = 0;

    public Fund(String name) {
        super(name);
    }

    @Override
    public float getPrice() {
        this.price = 0;
        // share price is the combination of all shares "total"
        for (Asset share : this.assets) {
            this.price += share.getTotal();
        }
        return this.price;
    }

    @Override
    public float getQuantity() {
        // quantity of self(fund) shares owned
        return this.quantity;
    }

    // made boolean as it returns false if cant sell more
    // (flagging that it can be removed)
    @Override
    public void sell(float quant) {
        this.quantity -= quant;
    }

    @Override
    public void buy(float quant) {
        this.quantity += quant;
    }

    @Override
    public float getTotal() {
        return getPrice() * getQuantity();
    }

    @Override
    public String getAPIResp() {
        return ("No Historic Data for Fund Type");
    }

    public void update() {
        // calls to update its own shares
        for (Asset ass : assets) {
            if (ass != this) {
                ass.update();
            }

        }
    }
}
