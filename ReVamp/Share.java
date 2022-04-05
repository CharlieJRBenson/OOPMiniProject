public class Share implements Asset {
    private float price = 123;
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
        // TODO Auto-generated method stub
        // TO CONNECT TO API
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

}
