public class User {

    private String Username;
    private String password;
    private boolean isAuthenticated;

    public User(String Username, String password) {
        this.Username = Username;
        this.password = password;
        isAuthenticated = false;
    }

    public String getUserName () {

        return Username;
    }

    public boolean isPasswordCorrect (String password) {
        if(this.password.equals (password)){
            isAuthenticated = true;
            return true;
        }
        return false;
    }

    public boolean isAuthenticated(){
        return this.isAuthenticated;
    }
}