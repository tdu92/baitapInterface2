import src.Employee;
import src.Manager;

public class app {
    public static void main(String[] args){
        Manager Jane = new Manager("M001", "Jane", 2000.0);
        Manager Camel = new Manager("M002", "Camel", 100.0);

        System.out.println("Jane Bonus:" + Jane.calculateBonus());
        System.out.println("Jane promote:" + Jane.promote());
    }
}
