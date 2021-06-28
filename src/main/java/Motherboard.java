public class Motherboard implements Parts {
    private String itemName;
    private double price;
    private String merk;
    private int wattage;




    public Motherboard(String name, double price, String merk, int wattage){
        this.itemName = name;
        this.price = price;
        this.merk = merk;
        this.wattage = wattage;

    }
    public String getItemName() {
        return itemName;
    }


    public void setItemName(String name) {
        this.itemName = name;
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

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", merk='" + merk + '\'' +
                '}';
    }
}
