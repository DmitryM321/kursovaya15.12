public class Employee {
    private int id;   // переменная id
    private String name;
    private int department;
    private int salary;
    static int counter;

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void SetDepartment(int department) {
        this.department = department;
    }
    public void SetSalary(int salary) {
        this.salary = salary;
    }
    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = (int) salary;
        id = ++counter;
    }
    @Override
    public String toString() {
        return "ID " + id + " ФИО: " + name + " Отдел " + department + " Зарплата: " + salary;
    }
}
