public class GPU implements Parts{
    private String itemName;
    private double price;
    private int wattage;



    public GPU(String name, double price, int wattage ){
        this.itemName = name;
        this.price = price;
        this.wattage = wattage;


    }
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String name) {
        this.itemName = itemName;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getWattage() {
        return this.wattage;
    }

    @Override
    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }
}
