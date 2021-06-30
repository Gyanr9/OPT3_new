public class Singleton {
    private static Singleton firstinstance = null;

    private Singleton(){}

    public static Singleton getInstance(){

        if(firstinstance ==  null){
            firstinstance = new Singleton();
        }
        return firstinstance;
    }

}
