public class Motherboard implements Parts {
    private String itemName;
    private int price;
    private String merk;




    public Motherboard(String name, int price, String merk ){
        this.itemName = name;
        this.price = price;
        this.merk = merk;

    }
    public String getItemName() {
        return itemName;
    }


    public void setItemName(String name) {
        this.itemName = name;
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

    @Override
    public String toString() {
        return "Motherboard{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", merk='" + merk + '\'' +
                '}';
    }
}
