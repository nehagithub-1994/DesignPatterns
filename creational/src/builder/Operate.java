package builder;

public class Operate {

    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder(1).setSummary("summary is completed").build();
        System.out.println(employee.getSummary());
    }
}
