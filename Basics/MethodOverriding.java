class Point2D {
    int x;
    int y;
    
    Point2D(int a, int b) {
        x = a;
        y = b;
    }
    
    void display() {
        System.out.println(x + " " + y);
    }
}

class Point3D extends Point2D {
    int z;
    
    Point3D(int a, int b, int c) {
        super(a, b); // Call the constructor of the superclass (Point2D)
        z = c;
    }
    
    @Override
    void display() {
        System.out.println(x + " " + y + " " + z);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        point3D.display(); // This will print: 1 2 3
    }
}
