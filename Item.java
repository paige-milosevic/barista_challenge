

public class Item {
    

    // Class Attributes
    private String name; 
    private double price;

    // Constructor

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Class Methods

    public void itemDetail() {
        System.out.printf("Item: %s\t Price: %.2f\n", this.name, this.price);
    }



}