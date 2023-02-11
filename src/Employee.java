public class Employee {

    private static int count = 1;

    private final int id;
    private final String name;
    private final String surname;
    private final String middleName;
    private int salary;
    private int department;





    public  Employee (String surname, String name, String middleName, int salary, int department) {

        this.name = name;
        this.surname = surname;
        this.middleName=middleName;
        this.salary = salary;
        this.department = department;
        this.id = count++;

    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format(
                "id: %d, Фамилия: %s, Имя: %s, Отчество: %s, ЗП: %d , № отдела: %d",
                id,
                surname,
                name,
                middleName,
                salary,
                department
        );
    }
}
