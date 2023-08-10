public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee ("Иванов Иван Иванович", 2,45000);
        employees[1] = new Employee ("Семенов Семен Семенович", 3,46000);
        employees[2] = new Employee ("Сергеев Сергей Сергеевич", 1,47000);
        employees[3] = new Employee ("Юрьев Юрий Юрьевич", 4,48000);
        employees[4] = new Employee ("Поликарпов Поликарп Поликарпович ", 4,49000);
        employees[5] = new Employee ("Степанов Степан Степанович", 3,50000);
        employees[6] = new Employee ("Лактионов Локоть Локтевич", 5,51000);
        employees[7] = new Employee ("Федотов Федот Федотович", 4,69000);
        employees[8] = new Employee ("Дмитров Дмитрий Дмитриевич", 3,72000);
        employees[9] = new Employee ("Иванов Иван Иванович", 1,30000);

        printAll(3);
        System.out.println(salarySum(3));
        System.out.println("Сотрудник получающий наименьшую зарплату " + findMin(3));
        System.out.println("Сотрудник получающий наибольшую зарплату " + findMax(3));
        System.out.println("Среднее значение заплаты " + getAverage(3));
        printFullName(3);
        raiseSalary(50, 3);

        System.out.println(" ");
        printAllWithSalaryLess(40000);
        printAllWithSalaryMore(50000);



    }
    public static void printAll(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printAll(int department){
        for (Employee employee : employees) {
            if (employee.getDepartment() == department){
                System.out.println(employee);
            }
        }
    }
    public static double salarySum(){
        double salary = 0.0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }

    public static double salarySum(int department){
        double salary = 0.0;
        for (Employee employee : employees) {
            if(employee.getDepartment() == department) {
                salary += employee.getSalary();
            }
        }
        return salary;
    }
    public static Employee findMin(){
        Employee minEmployy = null;
        for (Employee employee : employees) {
            if(minEmployy == null || employee.getSalary() < minEmployy.getSalary()){
                minEmployy = employee;
            }
        }
        return minEmployy;
    }

    public static Employee findMin(int department){
        Employee minEmployy = null;
        for (Employee employee : employees) {
            if(employee.getDepartment() != department){
                continue;
            }
            if(minEmployy == null || employee.getSalary() < minEmployy.getSalary()){
                minEmployy = employee;
            }
        }
        return minEmployy;
    }

    public static Employee findMax(){
        Employee maxEmloyy = null;
        for (Employee employee : employees) {
            if(maxEmloyy == null || employee.getSalary() > maxEmloyy.getSalary()){
                maxEmloyy = employee;
            }
        }
        return maxEmloyy;
    }
    public static Employee findMax(int department){
        Employee maxEmloyy = null;
        for (Employee employee : employees) {
            if(employee.getDepartment() != department){
                continue;
            }
            if(maxEmloyy == null || employee.getSalary() > maxEmloyy.getSalary()){
                maxEmloyy = employee;
            }
        }
        return maxEmloyy;
    }
    public static double getAverage(){
        return salarySum(3) / employees.length;
    }
    public static double getAverage(int department){
        double sum = 0.0;
        int quantity = 0;
        for (Employee employee : employees) {
            if(employee.getDepartment() != department){
                continue;
            }
            sum += employee.getSalary();
            quantity++;
        }
        return sum / quantity;
    }
    public static void printFullName(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
    public static void printFullName(int department){
        for (Employee employee : employees) {
            if(employee.getDepartment() != department){
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }
    public static void raiseSalary(int percent){
        double koef = 1 + percent / 100.0;
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * koef);
        }
    }
    public static void raiseSalary(int percent, int department){
        double koef = 1 + percent / 100.0;
        for (Employee employee : employees) {
            if(employee.getDepartment() != department){
                continue;
            }
            employee.setSalary(employee.getSalary() * koef);
        }
    }

    public static void printAllWithSalaryLess(double salary){
        for (Employee employee : employees) {
            if(employee.getSalary() < salary){
                System.out.println(employee);
            }
        }
    }
    public static void printAllWithSalaryMore(double salary){
        for (Employee employee : employees) {
            if(employee.getSalary() > salary){
                System.out.println(employee);
            }
        }
    }
}