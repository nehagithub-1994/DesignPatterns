package prototype;

import java.util.List;

public class Operate {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.loadData();

        //Now we want employees again so we will use clone method to get them

        Employees employees1 = (Employees) employees.clone();
        List<String> list1 = employees1.getEmployees();
        list1.add("Nachiket");

        Employees employees2 = (Employees) employees.clone();
        List<String> list2 = employees2.getEmployees();
        list2.remove("Neha");

        System.out.println(employees.getEmployees());
        System.out.println(list1);
        System.out.println(list2);

    }
}
