import java.util.Random;

public  class Student extends Person implements Comparable<Student> {

    private int skills = new Random().nextInt(999); // качества студента (скилы)


    Student (String name, String surname){
     super(name, surname);
    }

//возможность оценивать студентов
    public void addSkills (int value){
        skills+=value;
    }


//переопределяем метод для сортировки студентов в группе по их скилу
    @Override
    public int compareTo(Student anotherStudent) {
        if (this.getCardId() == anotherStudent.getCardId()){
            return  0;
        } else if (this.skills > anotherStudent.skills){
            return -1;
        } else {
            return  1;
        }
    }


//переопределяем метод для вывода информации о студенте в строке
    @Override
    public String toString() {
        return ("Name: " + getName() + "\n" +
                "Surname: " + getSurname() +"\n"+
                "PassportId: " + getCardId() + "\n"+
                "Skills: " + this.skills + "\n");
    }

//наличие студента на паре
    public boolean inClass() {
        return new Random().nextBoolean();
    }



}
