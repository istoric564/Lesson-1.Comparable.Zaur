import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Bob", "Baxter", 12345);
        Employee emp2 = new Employee(112, "Doh", "Ivanov", 30000);
        Employee emp3 = new Employee(23, "Cat", "Lory", 45000);
//        Arrays.sort(new Employee [] {emp1,emp2,emp3});
//        System.out.println();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before: " + list);
        System.out.println("iD: " + list);
        System.out.println("Name: " + list);
        list.sort(new nameComparator());
        System.out.println("Salary: " + list);
        list.sort(new salaryComparator());
        System.out.println("After: " + list);
    }
}

class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        Естественный порядок
        if (this.id.equals(anotherEmp.id)) {
            return 1;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 0;
        }

// Если этот айди больше - результат положительный, меньше - отрицательный, иначе они равны
//        return this.id - anotherEmp.id;

//        Большее редкий способ
//        return this.id.compareTo(anotherEmp.id);

//        return this.name.compareTo(anotherEmp.name);
    }

}

//class idComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if (emp1.id == (emp2.id)) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//}
class nameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
      return emp1.name.compareTo(emp2.name);
    }
}
class salaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary -emp2.salary;
    }
}