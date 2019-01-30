import java.util.InputMismatchException;
import java.util.Scanner;


public class University {
    public static void main(String[] args) {
        Group group = new Group(inputStr("Введите название группы")); // создаем группу
        int groupSize = inputInt("Сколько студентов вы хотите добавить?");

        for (int i = 1; i <= groupSize; i++) {
            group.addStudent(new Student(inputStr("Введите имя студента №" + i ), inputStr("Введите фамилию студента№" + i)));
        }

        group.election(); // метод проведения выборов среди студентов группы

        Professor professor = new Professor("Петр", "Деканенко"); // создаем обьект профессора

        professor.checkStudents(group); // запускаем метод переклички в группе



    }


    public static String inputStr (String str){
        System.out.println(str + ": ");
        Scanner in = new Scanner(System.in);
    return in.nextLine();
    }


    public static int inputInt (String str){
        System.out.println(str + ": ");
        Scanner in = new Scanner(System.in);
        try {
            return in.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("Вы ввели не цифру");
            System.exit(0);

        }
        return  0;
    }



}
