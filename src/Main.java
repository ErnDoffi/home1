public class Main {
    public static void main(String[] args) {
        Student h1 = new Student(20, "Иван", "Кузмич");
        Student h2 = new Student(h1);
        h2.setName("Рома");
        h2.age = 21;
        h2.surname = "Пупкин";
        Student h3 = new Student(h2);
        h3.setName("Aнтон");
        h3.age = 22;
        h3.surname = "Черниген";
        Teacher teacher = new Teacher(h1, h2, h3);
        teacher.students[0].Informationst();
        teacher.students[1].Informationst();
        teacher.students[2].Informationst();
        Teacher f1 = new Teacher(40, "Артём", "Дорохов");
        Teacher f2 = new Teacher(f1);
        f2.age = 41;
        f2.name = "Соуп";
        f2.surname = "Прайс";
        Teacher f3 = new Teacher(f2);
        f3.age = 42;
        f3.name = "Глеб";
        f3.surname = "Калашников";
        Teacher Teacher = new Teacher(f1, f2, f3);
        System.out.println("Information about teachers: " + f1.name + " " + f1.age + " " + "years old" + " " + f1.surname);
        System.out.println("Information about teachers: " + f2.name + " " + f2.age + " " + "years old" + " " + f2.surname);
        System.out.println("Information about teachers: " + f3.name + " " + f3.age + " " + "years old" + " " + f3.surname);
    }
}
