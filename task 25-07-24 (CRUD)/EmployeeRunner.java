class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        int length = employee.getArrayLength();
        System.out.println("======== Creation ========");
        System.out.println("The Array is created of length: " + length);

        System.out.println("======== Insertion ========");
        employee.insertEmployeeNames("John");
        employee.insertEmployeeNames("Jane");
        employee.insertEmployeeNames("Jim");
        employee.insertEmployeeNames("Jill");

        System.out.println("======== Reading ========");
        employee.readEmployeeNames();

        System.out.println("======== Updating ========");
        employee.updateEmployeeName("Jim", "Jack");
        employee.readEmployeeNames();

        System.out.println("======== Deleting ========");
        employee.deleteEmployeeName("Jack");
        employee.readEmployeeNames();

        System.out.println("======== Searching ========");
        String search = employee.searchEmployeeName("Jane");
        System.out.println("Result: " + search);
    }
}
