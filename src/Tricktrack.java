/**
 * Created by Masha on 21.02.2016.
 */
public class Tricktrack {

    public static Field field;
    public int fieldSize = 3;

     public void game()

    {
        Player player = new Player();
        player.getname(); //спросили имя игрока

        System.out.println("\nНаше поле:\n");

        field = new Field(fieldSize); //нарисовали поле

        Point point = new Point();

        while (field.checkField()== true){ //собственно игра

            System.out.println("Укажите координаты");
            point.getpoint(fieldSize);
            field.setPoint(point.coordX,point.coordY,'X');
            field.drawField();

            if (field.checkField()== true) {
                System.out.println("Ход компьютера");
                point.getpoint_comp(fieldSize);
                field.setPoint(point.coordX,point.coordY,'0');
                field.drawField();
            }
            else System.out.println("Конец игры");
        }
    }

}
//ывапорфвп
