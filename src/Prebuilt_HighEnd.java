public class Prebuilt_HighEnd extends Prebuilt_Template {
    @Override
    public void MBandCPUCheck() {
        System.out.println("Omdat dit een high end built is zijn de motherboard en cpu op een intel chipset");
    }

    @Override
    public void getParts() {
        System.out.println("High end parts zijn enz...");
    }


    @Override
    public void getInfo() {
        System.out.println("Dit is een duur model waar je alle game die je maar wilt spelen op de hoogste graphics kan spelen.");
    }

    @Override
    public void getPrice() {
        System.out.println("Low end built kost 2500 euro.");
    }

}
