import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int toadEyesCount = 0;          //Жабьи глаза
        // int ghoulTearsCount = 0;        //Слезы вурдалака
        // int ravenBonesCount = 0;        //Кости ворона
        // int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        String youCanBoilInfo = "Вы можете сварить: ";
        boolean enoughForElixir = false;

        System.out.println(
                "\nРецепты Эликсиров:\n" +
                        "1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости\n" +
                        "2. 2 кости ворона + 4 пельменя - Эликсир стойкости\n" +
                        "3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности\n" +
                        "4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир\n");

        //todo дописать логику программы сюда

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество жабьих глаз: ");
        int enterToadEyesCount = scanner.nextInt();

        System.out.print("Введите количество слёз вурдалака: ");
        int enterGhoulTearsCount = scanner.nextInt();

        System.out.print("Введите количество костей ворона: ");
        int enterRavenBonesCount = scanner.nextInt();

        System.out.print("Введите количество пельменей: ");
        int enterDumplingsCount = scanner.nextInt();

        System.out.println();

        // *********************************************************

        if (enterToadEyesCount >= 3 && enterRavenBonesCount >= 1) {
            System.out.println(youCanBoilInfo + "Эликсир зоркости");
            enoughForElixir = true;
        }

        if (enterRavenBonesCount >= 2 && enterDumplingsCount >= 4) {
            System.out.println(youCanBoilInfo + "Эликсир стойкости");
            enoughForElixir = true;
        }

        if (enterGhoulTearsCount >= 7 && enterDumplingsCount >= 1 && enterToadEyesCount >= 2) {
            System.out.println(youCanBoilInfo + "Эликсир скрытности");
            enoughForElixir = true;
        }

        if (enterGhoulTearsCount >= 5 && enterDumplingsCount >= 10 && enterToadEyesCount >= 4 && enterRavenBonesCount >= 3) {
            System.out.println(youCanBoilInfo + "Запретный эликсир");
            enoughForElixir = true;
        }

        if (!enoughForElixir) {
            System.out.println("Вам не хватает ни на один эликсир... Очень жаль :( ");
        }

    }
}
