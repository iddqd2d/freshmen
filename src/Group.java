import java.util.Iterator;
import java.util.TreeSet;

public class Group  {
    private String name;
    private TreeSet <Student> studentSet = new TreeSet<>();
    private Iterator iterator;


    Group (String name){
        this.name = name;
        System.out.println();
    }

//метод добавления студента в группу
    public void addStudent (Student student){
        studentSet.add(student);

    }
//метод вывода старосты
    public void election() {
        System.out.println("Выбран старостой:\n" + studentSet.first());

    }

//метод проверки наличия студента на основе итератора
    public boolean hasNextStudent() {
        if (iterator == null) iterator = studentSet.iterator();
        return  iterator.hasNext();

    }

//метод возвращает следущего студента
    public Student nextStudent() {
        Student student = (Student) iterator.next();
        return student;
    }

//метод вывода количества студентов
    public int size (){
        return studentSet.size();
    }
}
