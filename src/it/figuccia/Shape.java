package it.figuccia;

public class Shape {
    String shapeName;
    int numberOfEdges;

    // Empty
    public Shape() {
        System.out.println("Creating a Undefined object: ");
        shapeName = "Undefined";
    }

    //Circle
    public Shape(Double radius) {
        System.out.println("Creating a Circle object with radius " + radius + ":");
        shapeName = "Circle";
    }

    //Square
    public Shape(int edges, double edgeLength) {
        System.out.println("Creating a Square object with " + edges + " edges and edge length " + edgeLength + ":");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    //Rectangle
    public Shape(int edges, double e1, double e2) {
        System.out.println("Creating a Rectangle object with " + edges + " edges and edges length " + e1 + " and " + e2 + ":");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    //Triangle
    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Creating a Triangle object with " + edges + " edges and edges length " + e1 + ", " + e2 + " and " + e3 + ":");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

    // method that returns shape details
    public String getShapeDetails() {
        return "Shape name: " + shapeName + ", Number of edges: " + numberOfEdges;
    }
}
