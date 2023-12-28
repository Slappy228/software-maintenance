import java.util.*;

public class Enterprise {
    private List<Department> departments;

    public Enterprise() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public Department findDepartmentByName(String name) {
        for (Department department : departments) {
            if (department.getDepartmentName().equals(name)) {
                return department;
            }
        }
        return null;
    }
}
