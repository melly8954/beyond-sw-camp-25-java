package com.beyond.practiceoop.practice04;

public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println();
        int r1 = width * height;
        int r2 = 2 * (width + height);

        System.out.printf("면적: %d\n둘레: %d\n", r1, r2);
    }
}
