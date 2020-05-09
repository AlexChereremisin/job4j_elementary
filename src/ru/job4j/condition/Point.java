package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public static void main(String[] args) {
        double result = new Point(0, 0).distance(new Point(2, 0));
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = new Point(1, 0).distance(new Point(2, 0));
        System.out.println("result (1, 0) to (2, 0) " + result);
        result = new Point(6, 0).distance(new Point(2, 0));
        System.out.println("result (6, 0) to (2, 0) " + result);
        result = new Point(0, 2).distance(new Point(2, 0));
        System.out.println("result (0, 2) to (2, 0) " + result);
        result = new Point(2, 0).distance(new Point(2, 0));
        System.out.println("result (2, 0) to (2, 0) " + result);
    }
}
