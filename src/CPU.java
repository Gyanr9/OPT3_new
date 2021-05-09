public class CPU implements Parts {
    private String itemName;
    private int price;
    private String merk;
    private double boostclock;



    public CPU(String name, int price, String merk, double boostclock ){
        this.itemName = name;
        this.price = price;
        this.merk = merk;
        this.boostclock = boostclock;

    }
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String name) {
        this.itemName = itemName;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
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
                '}';
    }
}
