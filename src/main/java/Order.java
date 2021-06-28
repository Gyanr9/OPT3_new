public class Order {
    private static Long uniqueOrderNr = 0L;
    private final long orderNr;
    private int budget;
    private Motherboard MBorder;
    private CPU CPUorder;
    private GPU GPUorder;
    private PSU PSUorder;
    private double totalPrice;
    private int totalWattage;

    public Order (int budget, Motherboard MBorder, CPU CPUorder, GPU GPUorder, PSU PSUorder){
        this.orderNr = uniqueOrderNr++;
        this.budget = budget;
        this.MBorder= MBorder;
        this.CPUorder = CPUorder;
        this.GPUorder = GPUorder;
        this.PSUorder = PSUorder;
    }
    public int getBudget() {
        return budget;
    }

     public CPU getCPUorder() {
        return CPUorder;
    }

    public Motherboard getMBorder(){
        return MBorder;
    }
    public void setMBorder(Motherboard MBorder) {
        this.MBorder = MBorder;
    }

    public void setCPUorder(CPU CPUorder) {
        this.CPUorder = CPUorder;
    }
    GPU getGPUorder() {
        return GPUorder;
    }

    public void setGPUorder(GPU GPUorder) {
        this.GPUorder = GPUorder;
    }

    public PSU getPSUorder() {
        return PSUorder;
    }
    public void setPSUorder(PSU PSUorder) {
        this.PSUorder = PSUorder;
    }
    public double getTotalPrice(){
        this.totalPrice = MBorder.getPrice() + CPUorder.getPrice() + GPUorder.getPrice() + PSUorder.getPrice();
        return totalPrice;
    }

    public void setTotalPrice(double price){
        this.totalPrice = price;
    }

    public long getOrderNr() {
        return orderNr;
    }

    public int getTotalWattage(){
        this.totalWattage = MBorder.getWattage() + CPUorder.getWattage() + GPUorder.getWattage();
        return totalWattage;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNr=" + orderNr +
                ", budget=" + budget +
                ", MBorder=" + MBorder +
                ", CPUorder=" + CPUorder +
                ", GPUorder=" + GPUorder +
                ", PSUorder=" + PSUorder +
                '}';
    }


}
