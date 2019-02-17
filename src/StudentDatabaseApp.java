import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Спросить сколько новых студентов мы хотим добавить
        System.out.print("Введите количество новых студентов для зачисления: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Создать n номер для новых студентов
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].ToString());
        }
    }
}
