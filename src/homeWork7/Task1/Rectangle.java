package homeWork7.Task1;

public class Rectangle extends Figure {
   private int sideA;
   private int sideB;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public double square() {
        return sideA*sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
