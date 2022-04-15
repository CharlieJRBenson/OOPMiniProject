
public interface Asset {
    public String getName();

    public float getPrice();

    public float getQuantity();

    public float getTotal();

    public void buy(float quant);

    public void sell(float quant);

    public String getAPIResp();

    public void update();
}
