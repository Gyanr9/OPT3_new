import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest{

    @Test
    public void MCDCTest(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 500,"Intel");
        Motherboard mb2 = new Motherboard("Gigabyte B550", 500,"AMD");
        CPU cpu1 = new CPU("Intel I5 9600K",500, "Intel",3.7 );
        CPU cpu2 = new CPU("Ryzen 5 3600",500, "AMD",4.2 );
        GPU gpu1 = new GPU("Evga Geforce RTX 2060",450 );
        ;

        // 0 1 0
        assertEquals(Main.makeOrder(1500,mb1,cpu1, gpu1), "Order kan niet geplaatst worden");
        // 1 0 0
        assertEquals(Main.makeOrder(1500,mb1,cpu1, gpu1), "Order kan niet geplaatst worden");
        // 1 1 0

        //1 1 1
    }


}