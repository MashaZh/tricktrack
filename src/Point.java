
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Masha on 07.03.2016.
 */

public class Point {

    public int coordX;
    public int coordY;

    public void getpoint(int fieldSize) {//берем коодинаты точки у игрока

        do{
        System.out.println("По вертикали:");
        coordX = getcoord(fieldSize);
        System.out.println("По горизонтали:");
        coordY = getcoord(fieldSize);
        } while (Tricktrack.field.checkPoint(coordX,coordY)==false);

    }


    public int getcoord(int fieldSize) {//узнаем координату

        int coord = 0;
        while (coord < 1 || coord > fieldSize ) {
            Scanner scannerX = new Scanner(System.in);
            try {
                coord = scannerX.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Нужна ЦИФРА!!");
            }
            if (coord < 1 || coord > fieldSize)
                System.out.println("Не верное значение!!! Необходимо указать цифру от 1 до " + fieldSize + "!! Попробуйте еще раз!");
        }
        return coord - 1;

    }

    public void getpoint_comp(int fieldSize){//ходит компьютер, случайный выбор точки
        do {
            coordX = getcoord_comp(fieldSize);
            coordY = getcoord_comp(fieldSize);
        }while (Tricktrack.field.checkPoint(coordX,coordY)==false);
    }

    public int getcoord_comp(int fieldSize){
            Random random = new Random();
            return random.nextInt(fieldSize);
    }

}
