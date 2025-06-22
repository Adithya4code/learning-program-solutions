public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Alice", "Developer", 60000));
        manager.addEmployee(new Employee(102, "Bob", "Manager", 80000));
        manager.addEmployee(new Employee(103, "Charlie", "Tester", 50000));

        System.out.println("\nAll Employees:");
        manager.displayAll();

        System.out.println("\nSearching for Employee with ID 102:");
        Employee e = manager.searchEmployee(102);
        System.out.println(e != null ? e : "Not found");

        System.out.println("\nDeleting Employee with ID 102:");
        boolean deleted = manager.deleteEmployee(102);
        System.out.println(deleted ? "Employee deleted." : "Employee not found.");

        System.out.println("\nAll Employees after deletion:");
        manager.displayAll();
    }
}
