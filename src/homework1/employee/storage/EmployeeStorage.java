package homework1.employee.storage;

import homework1.employee.Employee;
import homework1.employee.PositionLevel;

public class EmployeeStorage {
    Employee[] employees = new Employee[10];
    int size = 0;


    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;

    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;

    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }
    }

    public void searchEmployeeByCompanyName(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().toLowerCase().contains(companyName.toLowerCase())) {
                System.out.println(employees[i]);
            }

        }
    }

    public void searchEmployeeByEmployeeId(String id) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                System.out.println(employees[i]);
            }else {
                System.out.println(" employee with "+ id + " doesn't exist");
            }
        }

    }
//    public void searchEmployeeByPositionLevel(String positionlLevel){
//        for (int i = 0; i < size; i++) {
//
//
//
//
//        }
//    }

}



