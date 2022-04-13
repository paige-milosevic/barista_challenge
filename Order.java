import java.util.ArrayList;

public class Order {

    // Class Attributes

    private String name;
    private double total;
    private boolean ready = false;
    private ArrayList<Item> items = new ArrayList<Item>();

    //Static Member

    // Constructor

    public Order() {
        this.name = "Guest";

    }

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, boolean ready) {
        this.name = name;
        this.ready = ready;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }



    // Static Method



    // Class Methods

    public double getOrderTotal() {
        for (Item i : this.items) {
            this.total += i.getPrice();
        }
        return this.total;

        // for (int i = 0; i < items.size(); i++) {
        //     System.out.println(items[i]);
        // } 
    }


    public String getStatusMessage() {

        if (this.ready == false) {
            return "Thank you for waiting. Your order will be ready soon";
        }
        else {
            return "Your order is ready";
        }
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void orderReady() {
        this.ready = true;
    }

    public void orderDetails() {

        System.out.printf("Customer Name: %s \n", name);

        System.out.println(getStatusMessage());
        

        for (Item i : this.items) {
            System.out.printf("%s - $%.2f", i.getName(), i.getPrice());
            System.out.println();

        }

        System.out.printf("Order Total: $%.2f\n", getOrderTotal());
        


    }

}