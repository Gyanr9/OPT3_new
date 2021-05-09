public class Main {


    public static String makeOrder(int budget , Motherboard Mb,CPU cpu, GPU gpu ){
        Order order = new Order(budget,Mb, cpu, gpu);
        if (checkMerk(budget,Mb,cpu,gpu) && !checkBudget(budget,Mb,cpu,gpu) ){
            return order.toString();
        }
        else {
            return "Order kan niet geplaatst worden";
        }

    }

    public static boolean checkBudget(int budget , Motherboard Mb,CPU cpu, GPU gpu ){
        Order order = new Order(budget,Mb, cpu, gpu);
        return order.TotalPrice() > order.getBudget();
    }

    public static  boolean checkMerk(int budget , Motherboard Mb,CPU cpu, GPU gpu){
        Order order = new Order(budget,Mb, cpu, gpu);
        return cpu.getMerk().equals(Mb.getMerk());
    }
    public static void main(String[] args) {
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 100,"Intel");
        Motherboard mb2 = new Motherboard("Gigabyte B550", 100,"AMD");
        CPU cpu1 = new CPU("Intel I5 9600K",200, "Intel",3.7 );
        CPU cpu2 = new CPU("Ryzen 5 3600",200, "AMD",4.2 );
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 300);
        System.out.println(makeOrder(1000,mb2,cpu2, gpu1));
        System.out.println(makeOrder(1000,mb1,cpu1, gpu1));

    }
}

