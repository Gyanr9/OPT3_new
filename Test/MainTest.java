import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest{

    @Test
    public void MCDCTest(){
        // A = GPU min 30 % of totaal bedrag
        // B = CPU en MB zelfde merk
        // C = totaal bedrag > budget
        // D : 1 = True  0 = "False"
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 500,"Intel");
        Motherboard mb2 = new Motherboard("Gigabyte B550", 500,"AMD");
        CPU cpu1 = new CPU("Intel I5 9600K",200, "Intel",3.7 );
        CPU cpu2 = new CPU("Ryzen 5 3600",200, "AMD",4.2 );
        GPU gpu1 = new GPU("Evga Geforce RTX 2060",250 );
        GPU gpu2 = new GPU("Evga Geforce RTX 2060",300 );
        // 0 1 0 = 0
        assertFalse(Main.makeOrder(1500,mb1,cpu1,gpu1));
        // 1 0 0 = 0
        assertFalse(Main.makeOrder(1500,mb1,cpu2, gpu1));
        // 1 1 0 = 1
        assertTrue(Main.makeOrder(1500,mb1,cpu1, gpu2));
        // 1 1 1 = 0
        assertFalse(Main.makeOrder(700,mb1,cpu1, gpu2));
    }
/*
    @Test
    public void checkBudget() {

    }

    @Test
    public void checkMerk() {
    }

    @Test
    public void checkGPUPrice() {
    }

    @Test
*/
}