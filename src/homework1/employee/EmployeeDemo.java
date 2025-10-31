package homework1.employee;

import homework1.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.printAllEmployee();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    System.out.println("please input id");
                    String id = scanner.nextLine();
                    employeeStorage.searchEmployeeByEmployeeId(id);
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    System.out.println(" Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(companyName);
                    break;
                default:
                    System.out.println("Wrong command !!!  Please try again!!!");

            }
        }
    }

    private static void addEmployee() {
        System.out.println("Please input employee's name ");
        String name = scanner.nextLine();
        System.out.println("Please input employee's surname ");
        String surname = scanner.nextLine();
        System.out.println("Please input employee's ID");
        String employeeId = scanner.nextLine();
        System.out.println("Please input employee's salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input company name ");
        String companyName = scanner.nextLine();
        System.out.println("please input position ");
        String position = scanner.nextLine();

        Employee employee = new Employee(name, surname, employeeId, salary, companyName, position);
        employeeStorage.addEmployee(employee);
        System.out.println("Employee added successfully");


    }
}
