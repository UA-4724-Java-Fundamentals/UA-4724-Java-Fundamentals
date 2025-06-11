package com.softserve.academy.homework03;

public class Block {
    private int width, length, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Block(int[] numbers) {
        this.width = numbers[0];
        this.length = numbers[1];
        this.height = numbers[2];
    }

    public int getVolume() {
        return this.height * this.length * this.width;
    }

    public int getSurfaceArea() {
        return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
    }
}
