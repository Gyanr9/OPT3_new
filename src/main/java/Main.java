import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    private static Login login;
    private static final DecimalFormat df = new DecimalFormat("###.##");
    private static Object PreBuilt_LowEnd;

    // Door deze methode onstaat er een command line menu voor het maken van een eigen order.
    public static void insertOrder(Customer customer){
        CPU finalCPU = null;
        Motherboard finalMB = null;
        GPU finalGPU = null;
        PSU finalPSU = null;

        ArrayList<Parts> parts =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Wilt u een vooraf samengestelde PC bestellen type 1 <======> Wilt u zelf een PC samenstellen type 2");
        switch(sc.nextInt()){
            case 1:
                System.out.println("Voor een low-end pc voor onder de 1000 euro type 1");
                System.out.println("Voor een high-end pc voor onder de 2500 euro type 2");
                switch (sc.nextInt()){
                    case 1:
                        createPreBuilt.makeOrderLow(customer);
                        break;
                    case 2:
                        createPreBuilt.makeOrderHigh(customer);
                        break;
                }
                menu(customer);
            case 2:
                System.out.println("Wat het is het budget dat u in gedachte heeft?");
                int budget = sc.nextInt();
                System.out.println("Welke CPU wilt u voor uw built?");
                System.out.println("Type 1 voor Intel I5 9600k <======> Type 2 voor AMD 5 3600");
                switch(sc.nextInt()){
                    case 1:
                        CPU cpu1 = new CPU("Intel I5 9600K",250, "Intel",3.7 ,75);
                        finalCPU = cpu1;
                        break;
                    case 2:
                        CPU cpu2 = new CPU("AMD Ryzen 5 3600",150.0, "AMD",4.2 ,75);
                        finalCPU = cpu2;
                        break;
                }
                System.out.println("Welke Motherboard wilt u voor uw built?");
                System.out.println("Type 1 voor Gigabyte Z390 (Intel motherboard) <======> Type 2 voor Gigabyte B550 (AMD Motherboard)");
                switch(sc.nextInt()){
                    case 1:
                        Motherboard mb1 = new Motherboard("Gigabyte Z390", 150.0,"Intel",0);
                        finalMB = mb1;
                        break;
                    case 2:
                        Motherboard mb2 = new Motherboard("Gigabyte B550", 100.0,"AMD",50);
                        finalMB = mb2;
                        break;
                }
                System.out.println("Welke GPU wilt u voor uw built?");
                System.out.println("Type 1 voor Evga Geforce RTX 2060 <======> Type 2 voor AMD Radeon 5600");
                switch(sc.nextInt()){
                    case 1:
                        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 352,150);
                        finalGPU = gpu1;
                        break;
                    case 2:
                        GPU gpu2 = new GPU("AMD Radeon 5600", 400,200);
                        finalGPU = gpu2;
                        break;
                }
                System.out.println("Welke Power supply wilt u voor uw built?");
                System.out.println("Type 1 voor Coolermaster MWE Gold 650<======> Type 2 voor Corsair 750");
                switch(sc.nextInt()){
                    case 1:
                        PSU psu1 = new PSU("Coolermaster MWE Gold 650", 100, 650);
                        finalPSU = psu1;
                        break;
                    case 2:
                        PSU psu2 = new PSU("Corsair 750", 100,750);
                        finalPSU = psu2;
                        break;
                }
                System.out.println("");
                System.out.println("================================");
                System.out.println("Uw order word verwerkt!");
                System.out.println("");

                if (orderCheck.makeOrder(budget, finalMB, finalCPU, finalGPU, finalPSU)){
                    customer.addOrder(new Order(budget, finalMB, finalCPU, finalGPU, finalPSU));
                    System.out.println("Het totaal bedrag van de order komt uit op : " + df.format(orderCheck.checkDiscount(new Order(budget, finalMB, finalCPU, finalGPU, finalPSU)))+ " euro");
                    System.out.println("");
                    menu(customer);
                }
                else{
                    System.out.println("Er zit een fout in uw order, probeer het opnieuw.");
                    System.out.println("");
                    insertOrder(customer);
                }
        }
    }
    // Deze method zorgt voor een commandline menu waar u alle opties die mogelijk zijn kunt uitvoeren.
    public static void menu (Customer customer){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welkom bij de computerbouw webshop");
        System.out.println("Beste "+ customer.getName());
        System.out.println("Voor het maken van een order type 1");
        System.out.println("Voor het bekijken van uw voorgaande orders type 2");
        System.out.println("Voor het bekijken van uw gegevens type 3");
        System.out.println("Voor het stoppen van het bezoeken van de website type 4");
        switch(sc.nextInt()){
            case 1:
                insertOrder(customer);
                System.out.println("================================");
                break;
            case 2:
                System.out.println("Hieronder ziet u uw orders:");
                System.out.println(customer.getOrders().toString());
                menu(customer);
                break;
            case 3:
                System.out.println(customer.toString());
                menu(customer);
                break;
            case 4:
                System.out.println("Wij wensen u nog een fijne dag!");
                break;
        }
    }

    public static void main(String[] args) {
        // Om in te loggen gebruikt u 1 van de users die dan gekoppelt wordt aan de customer die wordt meegegeven met de menu method.
        // username Kees1 , wachtwoord: wachtwoord1
        Customer c1 = new Customer("Kees","Teststraat 22","2821 DV","Den Haag");
        menu(c1);

    }
}

