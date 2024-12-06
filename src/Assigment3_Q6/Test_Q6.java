package Assigment3_Q6;
import java.util.ArrayList;

public class Test_Q6 {
    public void test ()
    {
        GroceryList groceryList = new GroceryList();

        GroceryItemOrder item1 = new GroceryItemOrder("Cookies", 2.30);
        item1.setQuantity(4);
        groceryList.add(item1);

        GroceryItemOrder item2 = new GroceryItemOrder("Milk", 1.50);
        item2.setQuantity(2);
        groceryList.add(item2);

        System.out.println("Total Cost: " + groceryList.getTotalCost());
    }
}
