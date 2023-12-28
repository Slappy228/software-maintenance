public class DistanceStudentAdapter implements DistanceStudent { //Клас-адаптер, який адаптує клас Студент до інтерфейсу СтудентЗаочник
    private Student student;
    public DistanceStudentAdapter(Student student) {
        this.student = student;
    }
    @Override
    public String getFullName() {
        return student.getName();
    }
}