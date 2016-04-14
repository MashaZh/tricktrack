import java.util.Scanner;

/**
 * Created by Masha on 07.03.2016.
 */
public class Player {

    public static void getname(){

        System.out.println("Укажите имя игрока");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        System.out.println("Приветствую Вас, " + playerName + "!");

    }


}
