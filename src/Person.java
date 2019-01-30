public abstract class Person {
    private String name, surname; // фамилия объекта
    private int cardId;


     Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.cardId = this.hashCode();
    }

    public int getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
