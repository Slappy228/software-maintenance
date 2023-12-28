public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу Студент
        Student student = new Student("John Doe");
        System.out.println("Student : " + student.getName());
        // Створення адаптера для класу Студент
        DistanceStudent distanceStudent = new DistanceStudentAdapter(student);
        System.out.println("Distance student full name: " + distanceStudent.getFullName());
    }
}
