import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String phone;
    private String address;
    private double salary;

    public void printSalary() {
        System.out.println("SALARY=" + salary);
    }

    public Employee(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("NAME=" + name);
        System.out.println("AGE=" + age);
        System.out.println("PHONE=" + phone);
        System.out.println("ADDRESS=" + address);
        System.out.println("SALARY=" + salary);
    }
}

class Manager extends Employee {
    private String specialization;
    private String department;

    public Manager(String name, int age, String phone, String address, double salary, String specialization, String department) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    public void displayManager() {
        displayEmployee();
        System.out.println("SPECIALIZATION=" + specialization);
        System.out.println("DEPARTMENT=" + department);
    }
}

class Officer extends Employee {
    private String specialization;
    private String department;

    public Officer(String name, int age, String phone, String address, double salary, String specialization, String department) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    public void displayOfficer() {
        displayEmployee();
        System.out.println("SPECIALIZATION=" + specialization);
        System.out.println("DEPARTMENT=" + department);
    }
}

public class inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER MANAGER DETAILS");
        Manager manager = createManager(sc);

        System.out.println("ENTER OFFICER DETAILS");
        Officer officer = createOfficer(sc);

        // Close the Scanner object
        sc.close();
    }

    private static Manager createManager(Scanner sc) {
        return createEmployee(sc, Manager.class);
    }

    private static Officer createOfficer(Scanner sc) {
        return createEmployee(sc, Officer.class);
    }

    private static <T extends Employee> T createEmployee(Scanner sc, Class<T> employeeClass) {
        System.out.println("NAME:");
        String name = sc.nextLine();
        System.out.println("AGE:");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("PHONE NUMBER:");
        String phone = sc.nextLine();
        System.out.println("ADDRESS:");
        String addr = sc.nextLine();
        System.out.println("SALARY:");
        double salary = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        System.out.println("SPECIALIZATION:");
        String spec = sc.nextLine();
        System.out.println("DEPARTMENT:");
        String dept = sc.nextLine();

        try {
            T employee = employeeClass.getDeclaredConstructor(String.class, int.class, String.class, String.class, double.class, String.class, String.class)
                    .newInstance(name, age, phone, addr, salary, spec, dept);
            if (employee instanceof Manager) {
                ((Manager) employee).displayManager();
            } else if (employee instanceof Officer) {
                ((Officer) employee).displayOfficer();
            }
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
