package Homework8;

public class Homework_08 {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author georgeOrwell = new Author("George", "Orwell");

        Book misery = new Book(stephenKing, "Misery", 1987);
        Book nineteen_Eighty_Four = new Book(georgeOrwell, "Nineteen Eighty-Four", 1949);



        misery.setPublishYear(1978);
        System.out.println("misery.getPublishYear() = " + misery.getPublishYear());


    }
}
