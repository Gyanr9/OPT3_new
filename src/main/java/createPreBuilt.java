public class createPreBuilt {
    public static void makeOrderLow(Customer customer){
        Motherboard mblow = new Motherboard("Gigabyte Z390", 150.0,"Intel",75);
        CPU cpulow = new CPU("Intel I5 9600K",150, "Intel",3.7 ,100);
        GPU gpulow = new GPU("Evga Geforce RTX 2060", 352,250);
        PSU psulow = new PSU("Coolermaster MWE 650", 80, 650);
        customer.addOrder(new Order(1000, mblow, cpulow, gpulow,psulow));
    }

    public static void makeOrderHigh(Customer customer){
        Motherboard mbhigh = new Motherboard("Gigabyte x570", 200,"AMD",100);
        CPU cpuhigh = new CPU("AMD Ryzen 9 5900x",1000, "AMD",3.7 ,100);
        GPU gpuhigh = new GPU("Geforce RTX 3070", 899,300);
        PSU psuhigh = new PSU("Corsair 750 ", 100, 750);
        customer.addOrder(new Order(2500, mbhigh, cpuhigh, gpuhigh,psuhigh));
    }
}
