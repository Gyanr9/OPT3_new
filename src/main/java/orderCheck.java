public class orderCheck {
    // Deze methode checkt of de order voldoet aan alle condities.
    public static boolean makeOrder(int budget, Motherboard Mb, CPU cpu, GPU gpu, PSU psu) {
        Order order = new Order(budget, Mb, cpu, gpu, psu);
        return (checkMerk(order)) && (!checkBudget(order)) && (checkGPUPrice(order) &&(checkWattage(order)));
    }

    public static boolean checkBudget(Order order) {
        return order.getTotalPrice() > order.getBudget();
    }
    // Deze methode kijkt of het moederbord en de CPU van dezelfde chipset zijn.
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
}
