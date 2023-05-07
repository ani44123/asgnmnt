// XYZ company previously used a register to store employee contact details..

import java.util.*;
class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    public Employee(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return name + ", " + address + ", " + phoneNumber + ", " + email;
    }
}

public class qs_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            String address = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            String email = scanner.next();
            Employee employee = new Employee(name, address, phoneNumber, email);
            employees.add(employee);
        }
        String searchName = scanner.next();
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(searchName)) {
                System.out.println(employee);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nEmployee with name " + searchName + " not found.");
}
}
}