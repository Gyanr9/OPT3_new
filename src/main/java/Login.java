import java.util.ArrayList;

public class Login {
    private static Login singleton;
    private ArrayList<User> users;

    private Login (){
        users =  new ArrayList<>();
        users.add(new User("user1", "ok1"));
    }
    public static Login getInstance(){
        if(singleton == null){
            singleton = new Login();
        }
        return singleton;
    }

    public boolean isAuthenticated(){return true;}
}
