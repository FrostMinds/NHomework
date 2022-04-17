public class Work {
    private static Employee[] employees = new Employee[10];

    private static void printEmployee(Employee employee) {
        System.out.println(employee);
    }


    public static void main (String[] args) {
        addEmployee(new Employee("Фримен Гордон Петрович", 1, 30_000));
        addEmployee(new Employee("Валентайн Джилл Олеговна ", 4, 55_000));
        addEmployee(new Employee("Белик Нико Романович", 2, 17_000));
        addEmployee(new Employee("Лоусон Миранда Даниловна", 1, 110_000));
        addEmployee(new Employee("Вейк Алан Сергеевич", 5, 49_000));
        addEmployee(new Employee("Кацураги Ким Игнатьевич", 2, 22_000));
        addEmployee(new Employee("Бёрнвуд Диана Максимовна", 3, 90_000));
        addEmployee(new Employee("Плискин Снейк Николаевич", 3, 46_000));
        addEmployee(new Employee("Фридман Алеса Евгеньевна", 2, 23_000));
        addEmployee(new Employee("Владимир Лем Дмитриевич", 5, 105_000));

        int salarySum = getSalarySum();
        System.out.println("Сумма затрат на зарплаты: " + salarySum);

        String maxSalaryName = getMaxSalary().employeeName;
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryName);

        String minSalaryName = getMinSalary().employeeName;
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryName);

        float averageSalary = getAverageSalary();
        System.out.println("Средняя зарплата:" + averageSalary);


        for (Employee employee : employees) {
            if (employee != null) {
                printEmployee(employee);
            }
        }
        System.out.println();


    }

    private static boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (Work.employees[i] == null) {
                Work.employees[i] = newEmployee;
                return true;

            }

        }
        return false;
    }

    private static int getSalarySum() {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();

        }
        return salarySum;
    }

    private static Employee getMaxSalary() {
        float maxSalary = 0;
        Employee maxSalaryName = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryName = employees[i];
            }
        }
        return maxSalaryName;
    }

    private static Employee getMinSalary() {
        float minSalary = employees[0].getSalary();
        Employee minSalaryName = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minSalaryName = employees[i];
            }

        }
        return minSalaryName;
    }

    private static float getAverageSalary() {
        float salarySum = getSalarySum();
        float averageSalary = salarySum / employees.length;
        return averageSalary;

    }
}
