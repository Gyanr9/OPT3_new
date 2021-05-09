public class PSU implements Parts{
    private String itemName;
    private int price;
    private int wattage;




    public PSU(String name, int price, String merk, int wattage ){
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


    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
