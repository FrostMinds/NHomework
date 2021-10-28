public class Homework_06 {

    public static void main(String[] args) {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        String titleName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + titleName);

        String fix = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " +  fix);

        String fullName1 = "Иванов Семён Семёнович";
        String e = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + e);




    }
}

