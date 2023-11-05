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
        String fullName1 = " Ivanov " + " Ivan " + " Ivanovich "; // <--- либо здесь менять содержание строки 
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1.toUpperCase());

        // 3 Задача

        String fullName2 = "Иванов " + " Семён " + " Ёжикович ";
        fullName2 = fullName2.replace("ё", "е");
        fullName2 = fullName2.replace("Ё", "Е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);

        // 2 Часть задач

        // 1 Задача




        isLeapYear(1323113);
        isLeapYear(942313);
        isLeapYear(682987913);
        isLeapYear(1872904513);

        printAppVersion(745, 1);

        var days = calculateDeliveryTime(37);
        if (days == -1) {
            System.out.println("Доставки нет!");
        } else {
            System.out.println("Количество дней: " + days);
        }


    }
    private static void isLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    private static void printAppVersion(int deviceYear, int clientOS) {
        if (deviceYear < 2015 && clientOS ==0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    private static int calculateDeliveryTime(int distance) {
        if (distance > 100) {
            return  -1;

        } else {
            int days = 1;
            if (distance> 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
            return days;
        }
    }
}
