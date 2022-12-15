
public class Main {
    static Employee[] employers = new Employee[10];
    public static void fullEmployersInfo() {   // Общая инф=ия о сотруднике
        System.out.println("Полный список сотрудников");
        for (Employee a : employers) {
            if (a != null) ;
            System.out.println(a);
        }
    }
    public static void infoOnlyFIO() {          // Только ФИО
        System.out.println("ФИО сотрудников");
        for (Employee a : employers) {
            if (a != null) ;
            System.out.println(a.getName());
        }
    }
    public static int totalSalary() {      // Общая ЗП
        int sumSalary = 0;
        for (int i = 0; i < employers.length; i++) {
            if (employers[i] != null) {
                sumSalary += employers[i].getSalary();
            }
        }
        return sumSalary;
    }
    public static Employee maxSalary() {
        Employee max = employers[0];
           for (Employee employers : employers) {
            if (employers.getSalary() > max.getSalary()) {
                max = employers;
            }
        } return max;
    }
    public static Employee minSalary() {
        Employee min = employers[0];
        for (Employee employers : employers) {
            if (employers.getSalary() < min.getSalary()) {
                min = employers;

            }
        } return min;
    }
    public static void averageSalary( ) {                 // Средняя ЗП
        int averageSalary;
        averageSalary =  totalSalary()/employers.length ;
        System.out.println("Средняя зарплата : " + averageSalary);
    }
    public static void main (String[] args){
           //      employers[0] = new Employee("Иванов Иван Иванович", 1, 100);
           //      employers[1] = new Employee("Петров Петр Петрович", 2, 150);
           //     employers[2] = new Employee("Ли Ван Клифф", 3, 400);


        fullEmployersInfo();
        System.out.println("Общая сумма зарплат: " +  totalSalary());
        System.out.println("Максимальная зарплата: " + maxSalary());
        System.out.println("Минимальная зарплата: " + minSalary());
        minSalary();
        averageSalary();
        infoOnlyFIO();
    }
}




