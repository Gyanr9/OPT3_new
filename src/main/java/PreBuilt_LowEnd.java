public class PreBuilt_LowEnd extends Prebuilt_Template {
    @Override
    public void MBandCPUCheck() {
        System.out.println("Omdat dit een low end built is zijn de motherboard en cpu op een amd chipset");
    }

    @Override
    public void getParts() {
        System.out.println("Low end parts");
    }


    @Override
    public void getInfo() {
        System.out.println("Dit is een goedkope built maar de meeste games zijn te spelen op dit model.");
    }

    @Override
    public void getPrice() {
        System.out.println("Low end built kost 1000 euro");
    }
}
