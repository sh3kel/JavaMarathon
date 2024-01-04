package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;
    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    public String getName() {
        return name;
    }
    public String getLesson() {
        return lesson;
    }

    public void evaluate(Student student) {
        //Генерируем рандомное число в интервале от [0;4), прибавляем к нему 2.
        Random rand = new Random();
        int x = 2 + rand.nextInt(4);
        //Строковая переменная grad - оценка студента
        String grad = null;
        //Присваиваем переменной grad значение соответствующее сгенерированному числу.
        switch(x) {
            case 2:
                grad = "неудовлетворительно";
                break;
            case 3:
                grad = "удовлетворительно";
                break;
            case 4:
                grad = "хорошо";
                break;
            case 5:
                grad = "отлично";
                break;
        }
        //Выводим в консоль информацию, в данном случае имя студента получаем с помощью геттера.
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету "
                            + lesson + " на оценку " + grad);
    }
}
