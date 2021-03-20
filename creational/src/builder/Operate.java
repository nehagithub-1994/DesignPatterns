package builder;

public class Operate {

    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder(1).setSummary("summary").build();
    }
}
