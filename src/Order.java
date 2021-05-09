public class Order {
    private static Long uniqueOrderNr = 0L;
    private final long orderNr;
    private int budget;
    private Motherboard MBorder;
    private CPU CPUorder;
    private GPU GPUorder;




    public Order (int budget, Motherboard MBorder, CPU CPUorder, GPU GPUorder){
        this.orderNr = uniqueOrderNr++;
        this.budget = budget;
        this.MBorder= MBorder;
        this.CPUorder = CPUorder;
        this.GPUorder = GPUorder;
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
    public int TotalPrice(){
        return MBorder.getPrice() + CPUorder.getPrice() + GPUorder.getPrice();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNr=" + orderNr +
                ", budget=" + budget +
                ", MBorder=" + MBorder +
                ", CPUorder=" + CPUorder +
                ", GPUorder=" + GPUorder +
                '}';
    }

    public long getOrderNr() {
        return orderNr;
    }
}
