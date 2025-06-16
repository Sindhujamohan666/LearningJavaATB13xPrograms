package ex_09_If_Condition;

public class Task_triangle_Switch {
    public static void main(String[] args) {
        //Triangle Classifier:Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine if the triangle
        // is equilateral (all sides are equal), isosceles (exactly two sides are equal),
        //or scalene (no sides are equal). Use an if-else statement to classify the triangle.
        int side1 = 5;
        int side2 = 5;
        int side3 = 9;
        if (side1 == side2 &&side2 == side3 && side3 == side1) {
            System.out.println("Equilateral triangle");
        }
        else if (side1 == side2||(side2 == side3) || side3 == side1) {
            System.out.println("Isosceles triangle");

        }
        else {
            System.out.println("Scalene triangle");
        }


    }
}


