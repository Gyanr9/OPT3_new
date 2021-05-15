public class Main {


    public static boolean makeOrder(int budget, Motherboard Mb, CPU cpu, GPU gpu, PSU psu) {
        Order order = new Order(budget, Mb, cpu, gpu, psu);
        return (checkMerk(order)) && (!checkBudget(order)) && (checkGPUPrice(order) &&(checkWattage(order)));
    }

    public static boolean checkBudget(Order order) {
        return order.getTotalPrice() > order.getBudget();
    }

    public static boolean checkMerk(Order order) {
        return order.getCPUorder().getMerk().equals(order.getMBorder().getMerk());
    }

    // Deze method checkt of de GPU 30% van de het totaal bedrag is.
    public static boolean checkGPUPrice(Order order) {
        return order.getGPUorder().getPrice() >= order.getTotalPrice() * 0.3;
    }

    // Deze method kijkt of de PSU genoeg wattage heeft voor de componenten. Geeft true door als psu genoeg wattage.
    public static boolean checkWattage(Order order){
        return order.getPSUorder().getWattage() > order.getTotalWattage();
    }

    public static double checkDiscount(Order order) {
        if (order.getTotalPrice() <= 500) {
            return order.getTotalPrice();
        } else if (order.getTotalPrice() > 500 && order.getTotalPrice() <= 1000) {
            return order.getTotalPrice() * 0.9;
        } else if (order.getTotalPrice() > 1000) {
            return order.getTotalPrice() * 0.85;
        }
        else {
            return 0.0;
        }
    }


    public static void main(String[] args) {
       /* Motherboard mb1 = new Motherboard("Gigabyte Z390", 500,"Intel");
        Motherboard mb2 = new Motherboard("Gigabyte B550", 500,"AMD");
        CPU cpu1 = new CPU("Intel I5 9600K",200, "Intel",3.7 );
        CPU cpu2 = new CPU("Ryzen 5 3600",200, "AMD",4.2 );
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 300);
       System.out.println(checkGPUPrice(new Order(500,mb2,cpu2, gpu1)));
*/
    }
}

