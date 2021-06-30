public class PSU implements Parts{
    private String itemName;
    private double price;
    private int wattage;




    public PSU(String name, double price, int wattage ){
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

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "PSU{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", wattage=" + wattage +
                '}';
    }
}
