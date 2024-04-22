import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        // Tạo danh sách chứa nhân viên
        List<Employee> employeeList = new ArrayList<>();

        // Khởi tạo 10 nhân viên
        initializeEmployees(employeeList);

        // Hiển thị danh sách 10 nhân viên ra màn hình console
        displayEmployeeList(employeeList);

        // Nhập thông tin của nhân viên mới từ người dùng
        Employee newEmployee = createNewEmployee();

        // Thêm nhân viên mới vào danh sách
        employeeList.add(newEmployee);

        // Hiển thị danh sách sau khi thêm nhân viên mới
        System.out.println("Danh sách nhân viên sau khi thêm:");
        displayEmployeeList(employeeList);

        // Nhập ID của nhân viên cần xóa từ người dùng
        int employeeIdToDelete = getEmployeeIdToDelete();

        // Xóa nhân viên theo ID
        boolean isDeleted = deleteEmployee(employeeList, employeeIdToDelete);

        // Hiển thị danh sách sau khi xóa nhân viên
        if (isDeleted) {
            System.out.println("Danh sách nhân viên sau khi xóa:");
            displayEmployeeList(employeeList);
        } else {
            System.out.println("Không tìm thấy nhân viên có ID " + employeeIdToDelete);
        }
    }

    private static void initializeEmployees(List<Employee> employeeList) {
        Employee employee1 = new Employee(1, "Nguyễn Văn A", 26, "Sở 1", "Mã số 1", 1000);
        employeeList.add(employee1);

        Employee employee2 = new Employee(2, "Nguyễn Văn B", 26, "Sở 2", "Mã số 2", 1000);
        employeeList.add(employee2);

        Employee employee3 = new Employee(3, "Nguyễn Văn C", 26, "Sở 3", "Mã số 3", 1000);
        employeeList.add(employee3);

        Employee employee4 = new Employee(4, "Nguyễn Văn D", 26, "Sở 4", "Mã số 4", 1000);
        employeeList.add(employee4);

        Employee employee5 = new Employee(5, "Nguyễn Văn E", 26, "Sở 5", "Mã số 5", 1000);
        employeeList.add(employee5);

        Employee employee6 = new Employee(6, "Nguyễn Văn F", 26, "Sở 6", "Mã số 6", 1000);
        employeeList.add(employee6);

        Employee employee7 = new Employee(7, "Nguyễn Văn G", 26, "Sở 7", "Mã số 7", 1000);
        employeeList.add(employee7);

        Employee employee8 = new Employee(8, "Nguyễn Văn H", 26, "Sở 8", "Mã số 8", 1000);
        employeeList.add(employee8);

        Employee employee9 = new Employee(9, "Nguyễn Văn A", 26, "Sở 9", "Mã số 9", 1000);
        employeeList.add(employee9);

        Employee employee10 = new Employee(10, "Nguyễn Văn A", 26, "Sở 10", "Mã số 10", 1000);
        employeeList.add(employee10);

    }

    private static void displayEmployeeList(List<Employee> employeeList) {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    private static Employee createNewEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên mới:");

        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.print("Tên: ");
        String name = scanner.next();

        System.out.print("Tuổi: ");
        int age = scanner.nextInt();

        System.out.print("Phòng ban: ");
        String department = scanner.next();

        System.out.print("Mã: ");
        String code = scanner.next();

        System.out.print("Mức lương: ");
        double salaryRate = scanner.nextDouble();

        return new Employee(id, name, age, department, code, salaryRate);
    }

    private static int getEmployeeIdToDelete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ID của nhân viên cần xóa:");
        return scanner.nextInt();
    }

    private static boolean deleteEmployee(List<Employee> employeeList, int employeeId) {
        for (Employee employee : employeeList) {
            if (employee.getId() == employeeId) {
                employeeList.remove(employee);
                return true;
            }
        }
        return false;
    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Tuổi: " + age + ", Phòng ban: " + department +
                ", Mã: " + code + ", Mức lương: " + salaryRate;
    }
}