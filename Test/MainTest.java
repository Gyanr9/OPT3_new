import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest{
    @Test
    public void MCDCTest(){
        // A = GPU min 30 % of totaal bedrag
        // B = CPU en MB zelfde merk
        // C = totaal bedrag > budget
        // D : 1 = True  0 = "False"
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 500,"Intel",0);
        Motherboard mb2 = new Motherboard("Gigabyte B550", 500,"AMD",0);
        CPU cpu1 = new CPU("Intel I5 9600K",200, "Intel",3.7 ,0);
        CPU cpu2 = new CPU("Ryzen 5 3600",200, "AMD",4.2 ,0);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060",250 ,0);
        GPU gpu2 = new GPU("Evga Geforce RTX 2060",300 ,0);
        PSU psu1 = new PSU("Coolermaster 360x", 0, 50);
        // 0 1 0 = 0
        assertFalse(orderCheck.makeOrder(1500,mb1,cpu1,gpu1,psu1));
        // 1 0 0 = 0
        assertFalse(orderCheck.makeOrder(1500,mb1,cpu2, gpu1,psu1));
        // 1 1 0 = 1
        assertTrue(orderCheck.makeOrder(1500,mb1,cpu1, gpu2,psu1));
        // 1 1 1 = 0
        assertFalse(orderCheck.makeOrder(700,mb1,cpu1, gpu2,psu1));
    }
    /*
           EQK1 = prijs pc 0 t/m 500
           EQK2 = prijs pc 501 t/m 1000
           EQK3 = prijs vanaf 1001
            */
    @Test
    public void EQVTest1(){

        Motherboard mb1 = new Motherboard("Gigabyte Z390", 0,"Intel",0);
        CPU cpu1 = new CPU("Intel I5 9600K",0.6, "Intel",3.7 ,0);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 0.4,0);
        PSU psu1 = new PSU("Coolermaster 360x", 0, 0);
        Order order1 =  new Order(500,mb1,cpu1,gpu1,psu1);
        // 1 euro = 0% korting
        assertEquals(1.00,orderCheck.checkDiscount(order1),0.001);
    }

    @Test
    public void EQVTest2(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 100.0,"Intel",0);
        CPU cpu1 = new CPU("Intel I5 9600K",150.0, "Intel",3.7 ,0);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 150.0,0);
        PSU psu1 = new PSU("Coolermaster 360x", 100.0, 0);
        Order order1 =  new Order(500,mb1,cpu1,gpu1,psu1);
        // 100 + 150 + 150 + 100 = 500
        // 500 euro = 0% korting
        assertEquals(500.00,orderCheck.checkDiscount(order1),0.001);
    }
    @Test
    public void EQVTest3(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 100.0,"Intel",0);
        CPU cpu1 = new CPU("Intel I5 9600K",150.0, "Intel",3.7 ,0);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 151.0,0);
        PSU psu1 = new PSU("Coolermaster 360x", 100, 0);
        Order order1 =  new Order(500,mb1,cpu1,gpu1,psu1);
        // 100 + 150 + 151 + 100 = 501
        // 501 *0.9 = 450.9
        // 501 euro = 10% korting
        assertEquals(450.90,orderCheck.checkDiscount(order1),0.001);
    }

    @Test
    public void EQVTest4(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 150.0,"Intel",0);
        CPU cpu1 = new CPU("Intel I5 9600K",250, "Intel",3.7 ,0);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 350,0);
        PSU psu1 = new PSU("Coolermaster 360x", 250, 0);
        Order order1 = new Order(1100,mb1,cpu1,gpu1,psu1);
        // 150 + 250 + 350 + 250 = 1000
        // 1000 euro  = 10% korting
        assertEquals(900.00,orderCheck.checkDiscount(order1),0.001);
    }

    @Test
    public void EQVTest5(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 150.0,"Intel",0);
        CPU cpu1 = new CPU("Intel I5 9600K",250, "Intel",3.7 ,0);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 351,0);
        PSU psu1 = new PSU("Coolermaster 360x", 250, 0);
        Order order1 = new Order(1100,mb1,cpu1,gpu1,psu1);
        // 150 + 250 + 351 + 250 = 1001
        // 1001 euro = 15% korting
        assertEquals(850.85,orderCheck.checkDiscount(order1),0.001);
    }
    @Test
    public void EQVTest6(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 150.0,"Intel",0);
        CPU cpu1 = new CPU("Intel I5 9600K",250, "Intel",3.7 ,0);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 352,0);
        PSU psu1 = new PSU("Coolermaster 360x", 250, 0);
        Order order1 = new Order(1100,mb1,cpu1,gpu1,psu1);
        // 150 + 250 + 352 + 250 = 1001
        // 1002 euro = 15 % korting
        assertEquals(851.70,orderCheck.checkDiscount(order1),0.001);
    }
    /*
    *Parameter 1 hoeveelheidkorting : 0%, 10%, 15%
    *Parameter 2 chipset type CPU & MB : AMD, Intel
    *Parameter 3 Budget groot genoeg : Waar, niet waar
    *Parameter 4 PSU genoeg watt voor andere componenten : Waar, niet waar
    *
    * Make order method geeft true terug betekent een geaccepteerde order.
    *
    * */
    @Test
    public void PWTest1(){
        Motherboard mb1 = new Motherboard("Gigabyte B550", 100.0,"AMD",50);
        CPU cpu1 = new CPU("AMD Ryzen 5 3600",150.0, "AMD",4.2 ,50);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 150.0,50);
        PSU psu1 = new PSU("Coolermaster 360x", 100.0, 200);
        // 0% korting AMD Waar Waar
        assertTrue(orderCheck.makeOrder(600,mb1,cpu1,gpu1,psu1));
    }

    @Test
    public void PWTest2(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 100.0,"Intel",50);
        CPU cpu1 = new CPU("Intel I5 9600K",150.0, "Intel",3.7 ,50);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 150.0,50);
        PSU psu1 = new PSU("Coolermaster 360x", 100.0, 100);
        // 100 + 150 + 150 + 100 = 500 totalprice : budget 400
        // 100 W PSU : 150 andere componenten
        // 0% korting Intel Niet Waar Niet Waar
        assertFalse(orderCheck.makeOrder(400,mb1,cpu1,gpu1,psu1));
    }

    @Test
    public void PWTest3(){
        Motherboard mb1 = new Motherboard("Gigabyte B550", 100.0,"AMD",50);
        CPU cpu1 = new CPU("AMD Ryzen 5 3600",150.0, "AMD",4.2 ,50);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 151.0,50);
        PSU psu1 = new PSU("Coolermaster 360x", 100.0, 200);
        // 100 + 150 + 151 + 100 = 501 totalprice : budget 400
        // 200 W PSU : 150 andere componenten
        // 10% korting AMD Niet Waar Waar
        assertFalse(orderCheck.makeOrder(400,mb1,cpu1,gpu1,psu1));
    }

    @Test
    public void PWTest4(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 100.0,"Intel",50);
        CPU cpu1 = new CPU("Intel I5 9600K",150.0, "Intel",3.7 ,50);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 151.0,50);
        PSU psu1 = new PSU("Coolermaster 360x", 100, 100);
        // 100 + 150 + 151 + 100 = 501 totalprice : budget 600
        // 100 W PSU : 150 andere componenten
        // 10% korting Intel Waar Niet Waar
        assertFalse(orderCheck.makeOrder(600,mb1,cpu1,gpu1,psu1));
    }

    @Test
    public void PWTest5(){
        Motherboard mb1 = new Motherboard("Gigabyte B550", 150.0,"AMD",50);
        CPU cpu1 = new CPU("AMD Ryzen 5 3600",250, "AMD",3.7 ,50);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 351,50);
        PSU psu1 = new PSU("Coolermaster 360x", 250, 100);
        // 250 + 150 + 351 + 250 = 1001 totalprice : budget 1100
        // 100 W PSU : 150 andere componenten
        // 15% korting AMD Waar  Niet Waar
        assertFalse(orderCheck.makeOrder(1100,mb1,cpu1,gpu1,psu1));
    }

    @Test
    public void PWTest6(){
        Motherboard mb1 = new Motherboard("Gigabyte Z390", 150.0,"Intel",50);
        CPU cpu1 = new CPU("Intel I5 9600K",250, "Intel",3.7 ,50);
        GPU gpu1 = new GPU("Evga Geforce RTX 2060", 351,50);
        PSU psu1 = new PSU("Coolermaster 360x", 250, 200);
        // 250 + 150 + 351 + 250 = 1001 totalprice : budget 900
        // 200 W PSU : 150 andere componenten
        // 15% korting Intel Niet Waar Waar
        assertFalse(orderCheck.makeOrder(900,mb1,cpu1,gpu1,psu1));
    }




}