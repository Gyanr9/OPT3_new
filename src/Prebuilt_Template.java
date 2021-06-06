public abstract class Prebuilt_Template {
    public final void buildComputer(){
        MBandCPUCheck();
        getParts();
    }
    public abstract void MBandCPUCheck();
    public abstract void getParts();
    public abstract void getInfo();
    public abstract void getPrice();

}
