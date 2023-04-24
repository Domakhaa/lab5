package Classes;

public class Coordinates {

    public Coordinates(Integer x, float y) {
        setX(x);
        setY(y);
    }
    private Integer x; //������������ �������� ����: 320, ���� �� ����� ���� null
    private float y; //������������ �������� ����: 357

    public void setX(Integer x) {
        if (x == null || x > 320) {
            System.out.println("������");
        }
        this.x = x;
    }

    public void setY(float y) {
        if (y > 357) {
            System.out.println("������");
        }
        this.y = y;
    }
}
