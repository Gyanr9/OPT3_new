import java.util.ArrayList;

public class Customer {

    private Login login;

    private String name;
    private String address;
    private String zipcode;
    private String city;
    private ArrayList<Order> orders = new ArrayList<>();

    public Customer (String name, String address, String zipcode, String city) {

        login = Login.getInstance();

        if (login.isAuthenticated ()) {
            this.name = name;
            this.address = address;
            this.zipcode = zipcode;
            this.city = city;
        }
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {

        if (login.isAuthenticated ()) {
            return String.format ("%s%n%s%n%s  %s%n", name, address, zipcode, city);
        }

        return "";
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}