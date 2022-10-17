public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Benner Boris Borisovich", 5, 35000);
        employees[1] = new Employee("Van Helsing Maksim", 2, 21000);
        employees[2] = new Employee("Kravinov Aleksey Alekseevich", 3, 45550);
        employees[3] = new Employee("Razin Stepan Stepanovich", 2, 80000);
        employees[4] = new Employee("Razov Stepan Andreevich", 2, 80000);
        employees[5] = new Employee("Prekrasnaya Elena Borisovna", 1, 40000);
        employees[6] = new Employee("Nepravdivaya Margarita Simonian", 4, 33000);
        employees[7] = new Employee("Bezrukov Stanislav Valerievich", 1, 33000);
        employees[8] = new Employee("Lapochkina Mariya Evgenievna", 3, 25000);
        employees[9] = new Employee("Agutin Leonid Fedorovich", 5, 30000);






        /*для проверки*/
        printAllEmployeesInfo();
        getMinSalary();
        getMaxSalary();
        getAvgSalary();
        printSum();
        printEmployeesNames();
    }
    /*список со всеми сотрудниками со всеми данными в консоль toString()*/
    public static void printAllEmployeesInfo() {
        for (int i = 0; i < employees.length; i++){
                System.out.println(employees[i].toString());
        }
    }
    /*сумма зп*/
    public static void printSum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        System.out.println("Cумма зп " + sum);
    }

    /*поиск сотр с миним зп*/
    public static int getMinSalary() {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зп " + min);
        return min;
    }

    /*поиск сотр с максим зп*/
    public static int getMaxSalary() {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зп " + max);
        return max;
    }

    /*среднее знач зп*/
    public static int getSumSalary(){
        int sum = 0;
        for (int i = 0; i < employees.length; i++){
            if(employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }
    public static void getAvgSalary() {
        System.out.println("среднее значение зарплат " + getSumSalary() / employees.length);
    }

    /*фио всех сотр в консоль*/
    public static void printEmployeesNames() {
        for (int i = 0; i < employees.length; i++){
                System.out.println(employees[i].getName());

        }
    }
}

