public class RAM implements Parts {
    private String itemName;
    private double price;
    private int size;
    private int wattage;




    public RAM(String name, double price, int size, int wattage) {
        this.itemName = name;
        this.price = price;
        this.wattage = wattage;
        this.size = size;
    }

    @Override
    public String getItemName() {
        return this.itemName;
    }

    @Override
    public void setItemName(String name) {

        this.itemName = itemName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getWattage() {
        return this.wattage;
    }
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}