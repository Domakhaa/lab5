package Classes;

public class Coordinates {

    public Coordinates(Integer x, float y) {
        setX(x);
        setY(y);
    }
    private Integer x; //Максимальное значение поля: 320, Поле не может быть null
    private float y; //Максимальное значение поля: 357

    public void setX(Integer x) {
        if (x == null || x > 320) {
            System.out.println("ОШИБКА");
        }
        this.x = x;
    }

    public void setY(float y) {
        if (y > 357) {
            System.out.println("ОШИБКА");
        }
        this.y = y;
    }
}
