package com.beyond.practiceoop.practice04;

public class Circle extends Point{
    private int radius;

    public Circle() {}

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println();
        double r1 = Math.PI * radius * radius;
        double r2 = Math.PI * radius * 2;

        System.out.printf("면적: %.1f\n둘레: %.1f\n", r1, r2);
    }
}
