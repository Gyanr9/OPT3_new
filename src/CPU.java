public class CPU implements Parts {
    private String itemName;
    private double price;
    private String merk;
    private double boostclock;
    private int wattage;




    public CPU(String name, double price, String merk, double boostclock, int wattage ){
        this.itemName = name;
        this.price = price;
        this.merk = merk;
        this.boostclock = boostclock;
        this.wattage =  wattage;


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

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getBoostclock() {
        return boostclock;
    }

    public void setBoostclock(int boostclock) {
        this.boostclock = boostclock;
    }
    @Override
    public String toString() {
        return "CPU{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", merk='" + merk + '\'' +
                ", boostclock=" + boostclock +
                ", wattage=" + wattage +
                '}';
    }
}
