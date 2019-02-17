import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private int gradeYear;
    private String StudentID;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Конструктор: Предложить пользователю ввести имя студента и год
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        this.name = in.nextLine();

        System.out.println("Введите фамилию студента: ");
        this.surname = in.nextLine();

        System.out.println("1 - Первокурсник\n2 - Второкурсник\n3 - Третьекурсник\n4 - Четверокурсник\nВведите курс студента: ");
        this.gradeYear = in.nextInt();

        setStudentID();


        if (gradeYear >= 5)
            System.out.println("Данные введены непрпвильно");

    }


    // Сгенирировать ID
    private void setStudentID() {
        // Уровень образования + ID
        id++;
        this.StudentID = gradeYear + "" + id;
    }

    // Записать курс
    public void enroll() {
        // Получение внутри цикла, пользовтель нажмет 0
        do {
            System.out.print("Введите предмет, чтобы зарегистрировться (Й чтобы выйти): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Й")) {
                course = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                System.out.println("ПАУЗА!");
                break;
            }
        } while (1 != 0);
    }

    // Посмотреть баланс
    public void viewBalance() {
        System.out.println("Ваш баланс: руб." + tuitionBalance);
    }

    // Оплатить обучение
    public void payTuition() {
        viewBalance();
        System.out.print("Введите ваш платеж: руб.");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Спасибо за ваш платеж в размере руб." + payment);
        viewBalance();
    }

    // Показать статус
    public String ToString() {
        return "Name: " + name + " " + surname +
                "\nУровень образования: " + gradeYear +
                "\nID студента: " + StudentID +
                "\nКурсы зачислены:" + courses +
                "\nBalance: руб." + tuitionBalance;
    }
}
