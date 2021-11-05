package Homework8;

public class Homework_08 {
    public static void main(String[] args) {
        Book misery = new Book("Misery", "Stephen King", 1987);
        Book nineteen_Eighty_Four = new Book("Nineteen Eighty-Four", "George Orwell", 1949);

        Author stephenKing = new Author("Stephen", "King");
        Author georgeOrwell = new Author("George", "Orwell");

        misery.setPublishYear(1978);
        System.out.println("misery.getPublishYear() = " + misery.getPublishYear());


    }
}
