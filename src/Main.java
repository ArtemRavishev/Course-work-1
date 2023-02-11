import java.util.Random;

public class Main {


    private static final Employee[] EMPLOYEES = new Employee[10];


    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Романова ", "Полина ", "Денисовна", 58471, 1);
        EMPLOYEES[1] = new Employee("Куприянов ", "Тимофей ", "Артёмович", 71103, 3);
        EMPLOYEES[2] = new Employee("Горбунова ", "Арина ", "Семёновна", 87535, 4);
        EMPLOYEES[3] = new Employee("Кузнецов ", "Кирилл ", "Максимович", 67421, 5);
        EMPLOYEES[4] = new Employee("Дементьева ", "Дарья ", "Андреевна", 110211, 3);
        EMPLOYEES[5] = new Employee("Кузьмина ", "Диана ", "Юрьевна", 68231, 3);
        EMPLOYEES[6] = new Employee("Воробьев ", "Матвей ", "Иванович", 70531, 1);
        EMPLOYEES[7] = new Employee("Сергеева ", "Василиса ", "Матвеевна", 98321, 5);
        EMPLOYEES[8] = new Employee("Титова ", "Дарина ", "Михайловна", 100123, 2);
        EMPLOYEES[9] = new Employee("Максимов ", "Михаил ", "Егорович", 110011, 2);
        printFullInfo();
        System.out.println("Сумма ЗП всех сотрудников " + totalSalaries() + " рублей");
        System.out.println("Минимальная ЗП сотрудника  " + minimumWageWorker() + " рублей");
        System.out.println("Максимальная ЗП сотрудника  " + maximumWageWorker() + " рублей");
        System.out.println("Средняя ЗП сотудника  " + averageSalary() + " рублей");
        printFullNameInfo();
    }

    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }

    }

    private static int totalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minimumWageWorker() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < min) {
            min = emp.getSalary();
            employee = emp;
            }
        }
        return employee;
    }

    private static Employee maximumWageWorker() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() > max) {
            max = emp.getSalary();
            employee = emp;
            }
        }
        return employee;
    }

    private static double averageSalary () {
        return totalSalaries() / (double) EMPLOYEES.length;
    }

    private static void printFullNameInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getSurname() + employee.getName() + employee.getMiddleName());
        }
    }
}


