public class Main {
    public static void main(String[] args) {


        // ЗАДАЧИ

        // Задача 1

        String firstName = " Sveta ";
        String middleName = " Skyprovich ";
        String lastName = " Chibrikova ";
        String fullName = firstName + middleName + lastName;

        System.out.println("Ф. И. О. сотрудника —" + fullName);

        // Задача 2

//        Либо String fullName1 = firstName + middleName + lastName; и менять содержание выше.
        String fullName1 = " Ivanov " + " Ivan " + " Ivanovich "; // <--- либо здесь менять содержание строки здесь.
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1.toUpperCase());

        // 3 Задача

        String fullName2 = "Иванов " + " Семён " + " Ёжикович ";
        fullName2 = fullName2.replace("ё", "е");
        fullName2 = fullName2.replace("Ё", "Е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);


    }
}