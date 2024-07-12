package homeWork_42_Transaction;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
@ date 12.07.2024
@ author Alla Novytska

Task 1 Легкий
Дан список сотрудников (Employee)
с полями name, department, salary.
Используя Stream API, сгруппируйте сотрудников по отделам

Task 3 Продвинутый
Опционально
Дан список Employee.
Вычислите среднюю зарплату сотрудников в каждом отделе
и найдите отдел с максимальной средней зарплатой.
 */
public class Task_1_3_A {
    public static void main(String[] args) {
       task3();
    }
    private static void task3(){
        List<EmployeeA> employees = new ArrayList<>(List.of(
                new EmployeeA( "Mary",3500, 50, "developer", "IT"),
                new EmployeeA( "Miki",3000, 35, "manager", "Management"),
                new EmployeeA( "Tom",2500, 28, "manager", "Management"),
                new EmployeeA( "Tim",2700, 29, "manager", "Management"),
                new EmployeeA( "Moris",5500, 56, "chef-manager", "Management"),
                new EmployeeA( "Sonia",3900, 48, "manager", "Management"),
                new EmployeeA( "Jon",2300, 22, "developer", "IT"),
                new EmployeeA( "Jina",3200, 50, "developer", "IT"),
                new EmployeeA( "Serge",8500, 44, "chef-developer", "IT"),
                new EmployeeA( "Lisa",3500, 50, "developer", "IT"),
                new EmployeeA( "Lusia",3000, 61, "chef-cleaner", "Cleaning"),
                new EmployeeA( "Olivia",1300, 19, "cleaner", "Cleaning")

                ));
        // Расчет средней зарплаты по отделу
        Map<String,Double> mapDoubleSalary = employees.stream()
                .collect(Collectors.groupingBy(EmployeeA::getDepartment,
                        Collectors.averagingDouble(EmployeeA::getSalary)));
        System.out.println(("Средняя зарплата по отделам: " + mapDoubleSalary ));

        IntSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingInt(EmployeeA::getSalary));

        System.out.println("max: " + statistics.getMax());

       /*
        Task 1 Легкий
        Дан список сотрудников (Employee) с полями name, department, salary.
        Используя Stream API, сгруппируйте сотрудников по отделам
        */
        // Группировка зарплат по отделу
        Map<String, List<Integer>> map2 = employees.stream()
                .collect(Collectors.groupingBy(EmployeeA::getDepartment,
                        Collectors.mapping(EmployeeA::getSalary, Collectors.toList())));
        System.out.println("Список зарплат по отделу: " + map2);

        //Сгруппировать сотрудников по отделам, имя, зарплата, должность
        Map<String, List<EmployeeA>> map = employees.stream()
                .collect(Collectors.groupingBy(EmployeeA::getDepartment));

        System.out.println(map);


        // Группировка сотрудников по отделам
        Map<String, List<EmployeeA>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(EmployeeA::getDepartment));

        // Вывод сгруппированных сотрудников по отделам
        employeesByDepartment.forEach((department, empList) -> {
            System.out.println("Отдел: " + department);
            empList.forEach(emp -> System.out.println("  " + emp.getName()));
        });


        // Поиск отдела с максимальной средней зарплатой
        String maxAvgSalaryDept = mapDoubleSalary.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Отдел с максимальной зарплатой -  \"Не найдено\"");
        System.out.println("Отдел с максимальной средней зарплатой: " + maxAvgSalaryDept);
    }
}
