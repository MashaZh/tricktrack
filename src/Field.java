/**
 * Created by Masha on 03.04.2016.
 */
public class Field {

    public char[][] field;

    public Field(int fieldSize) { //  рисуем поле

        this.field = new char[fieldSize][fieldSize];

        for (int i=0; i< this.field.length; i++){
            for (int j=0; j<this.field.length; j++) {
                this.field[i][j] = '*';
                System.out.print(this.field[i][j]);
            }
            System.out.println();
        }
    }

    public boolean checkField() { //Проверяем, есть ли еще пустые ячейки в нашем поле

        for (int i=0; i< this.field.length; i++){
            for (int j=0; j<this.field.length; j++) {
                if (this.field[i][j] == '*') return true;
            }
        }
        return false;
    }

    public boolean checkPoint(int x, int y) { //проверяем, не занята ли указанная ячейка
        if (this.field[x][y] == '*') {
            return true;
        } else {
            System.out.println("Простите, такой ход уже был. Укажите другую клетку!");
            return false;
        }
    }


    public void setPoint(int x, int y, char symbol) { //установка переданного символа в поле
        this.field[x][y] = symbol;
    }

    public void drawField() { //перерисовываем поле с поставленными крестиками и ноликами.
        for (int i=0; i< this.field.length; i++){
            for (int j=0; j<this.field.length; j++) {
                System.out.print(this.field[i][j]);
            }
            System.out.println();
        }
    }

}
