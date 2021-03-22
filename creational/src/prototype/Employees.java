package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private final List<String> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void loadData() {

        employees.add("Neha");
        employees.add("Alex");
        employees.add("Maria");

    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<String>();
        this.getEmployees().forEach(s -> {
            temp.add(s);
        });
        return new Employees(temp);
    }
}
