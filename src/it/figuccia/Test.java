package it.figuccia;

public class Test {
    public static void main(String[] args) {
        // creating five different shapes using different invocations
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(3.5);
        Shape shape3 = new Shape(4, 2.5);
        Shape shape4 = new Shape(4, 3.5, 4.5);
        Shape shape5 = new Shape(3, 2.5, 3.5, 4.5);

        // get details to dedicate variables
        String shape1Details = shape1.getShapeDetails();
        String shape2Details = shape2.getShapeDetails();
        String shape3Details = shape3.getShapeDetails();
        String shape4Details = shape4.getShapeDetails();
        String shape5Details = shape5.getShapeDetails();

        // printing shape details
        System.out.println(shape1Details);
        System.out.println(shape2Details);
        System.out.println(shape3Details);
        System.out.println(shape4Details);
        System.out.println(shape5Details);
    }
}