class Area {
    int length;
    int breadth;

    int area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Area r1 = new Area();
        Area r2 = new Area();

        r1.length = 10;
        r1.breadth = 5;

        r2.length = 8;
        r2.breadth = 6;

        System.out.println("Area of r1 = " + r1.area());
        System.out.println("Area of r2 = " + r2.area());
    }
}
