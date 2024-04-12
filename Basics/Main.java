class Parent {
    // Declaring a final method
    final void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    // This will cause a compilation error because you cannot override a final method
    // @Override
    // void display() {
    //     System.out.println("This is the child class");
    // }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Output: This is the parent class

        // Trying to override the final method in the subclass will result in a compilation error
        // Child child = new Child();
        // child.display();
    }
}

