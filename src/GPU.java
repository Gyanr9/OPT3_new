public class GPU implements Parts{
    private String itemName;
    private int price;



    public GPU(String name, int price ){
        this.itemName = name;
        this.price = price;


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

    @Override
    public String toString() {
        return "GPU{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }
}
