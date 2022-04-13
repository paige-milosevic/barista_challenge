

import java.util.ArrayList;

public class TestOrders {
    
    public static void main(String[] args) {
        
        Item item1 = new Item("mocha", 5.99);
        Item item2 = new Item("latte", 4.99);
        Item item3 = new Item("drip coffee", 2.00);
        Item item4 = new Item("capuccino", 3.50);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // item1.itemDetail();
        // order1.orderDetails();

        // ArrayList<Object> order11Items = new ArrayList<Object>();
        // order11Items.add(item1);
        

        // order1.addItem(order11Items);

        // order1.orderReady();
        // order1.orderDetails();

        order1.addItem(item1);
        order1.addItem(item2);
        // order1.setReady(true);
        order1.orderDetails();
        



        
    }

}