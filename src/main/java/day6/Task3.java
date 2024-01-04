package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Мария Сергеевна Куприна", "Английский язык");
        Student student = new Student("Павел Астафьев");
        teacher.evaluate(student);
    }
}
