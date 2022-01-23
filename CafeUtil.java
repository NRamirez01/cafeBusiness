import java.util.ArrayList;
import java.util.Arrays;

class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        int i = 0;
        while(i <= 10){
            sum += i;
            i++;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(double price : prices){
            sum += price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        int index = 0;
        for(String menuItem : menuItems){
            System.out.printf("%s %s \n", index, menuItem);
            index +=1;
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("\nHello, %s! \n\nThere are %s people in front of you! \n", userName, customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}