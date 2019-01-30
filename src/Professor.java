import java.util.Iterator;

public class Professor extends Person{

    Professor(String name, String surname) {
        super(name, surname);
    }


    public void checkStudents (Group group){
    int present = 0; // счетчик присутствующих студентов

    while (group.hasNextStudent()){ // вызываем метод проверки существования студента (итератором)
        Student student = group.nextStudent(); // получаем экземпляр студента
        System.out.print(student.getName() +" "+student.getSurname() +" ("+student.getCardId()+") ");
        if (student.inClass()){
            System.out.println("присутствует на паре");
            present++;
        }else{
            System.out.println("отсутствует на паре");}
    }

        System.out.printf("На уроке присутствует студентов: %d из %d", present, group.size());



    }





}
