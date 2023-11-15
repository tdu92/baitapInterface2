package src;

public class Manager extends Employee implements Promotable {


    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return this.salary * 3 ;
    }

    public double promote(double increaseSalary) {
        return this.salary*1.5;
    }
}
