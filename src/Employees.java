public class Employees {

    static Employee[] Employees = new Employee[10];

    public static void main(String []args) {
        Employees[0] = new Employee("Benner Boris Borisovich", 5, 35000);
        Employees[1] = new Employee("Van Helsing Maksim", 2, 21000);
        Employees[2] = new Employee("Kravinov Aleksey Alekseevich", 3, 45550);
        Employees[3] = new Employee("Razin Stepan Stepanovich", 2, 80000);
        Employees[4] = new Employee("Terentieva Aleksandra Grigorievna ", 1, 16300);
        Employees[5] = new Employee("Prekrasnaya Elena Borisovna", 1, 40000);
        Employees[6] = new Employee("Nepravdivaya Margarita Simonian", 4, 33000);
        Employees[7] = new Employee("Bezrukov Stanislav Valerievich", 1, 33000);
        Employees[8] = new Employee("Lapochkina Mariya Evgenievna", 3, 25000);
        Employees[9] = new Employee("Agutin Leonid Fedorovich", 5, 30000);


        /*для проверки*/

        getAllEmpoyeesInfo();
        getSum();
        getMinSalary();
        getMaxSalary();
        getAvgSalary();
        getEmployeesNames();
    }

    /*список со всеми сотрудниками со всеми данными в консоль toString()*/
    public static void getAllEmpoyeesInfo() {
        for (int i = 0; i < Employees.length; i++){
            System.out.println(Employees[i].toString());
        }
    }

    /*сумма зп*/
    public static int getSum() {
        int sum = 0;
        for (int i = 0; i < Employees.length; i++){
            sum = sum + Employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - "+ sum + " рублей");
        return sum;
    }

    /*поиск сотр с миним зп*/
    public static int getMinSalary() {
        int min = Employees[0].getSalary();
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i].getSalary() < min) {
                min = Employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + min  + " рублей");
        return min;
    }

    /*поиск сотр с максим зп*/
    public static int getMaxSalary() {
        int max = Employees[0].getSalary();
        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i].getSalary() > max) {
                max = Employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + max + " рублей");
        return max;
    }

    /*среднее знач зп*/
    public static int getAvgSalary() {
        System.out.println("Среднее значение зарплат составляет - " + getSum()/Employees.length + " рублей");
        return getSum()/Employees.length;
    }

    /*фио всех сотр в консоль*/
    public static void getEmployeesNames() {
        for (int i = 0; i < Employees.length; i++){
            System.out.println(Employees[i].getName());
        }
    }

}
