package Honework_09;

public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author georgeOrwell = new Author("George", "Orwell");

        Book misery = new Book(stephenKing, "Misery", 1987);
        Book nineteen_Eighty_Four = new Book(georgeOrwell, "Nineteen Eighty-Four", 1949);

        System.out.println(misery);
        System.out.println(nineteen_Eighty_Four);

    }
}
