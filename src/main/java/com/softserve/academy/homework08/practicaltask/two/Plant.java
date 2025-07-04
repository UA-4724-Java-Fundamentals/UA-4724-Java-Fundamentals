package com.softserve.academy.homework08.practicaltask.two;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String colorStr, String typeStr)
            throws ColorException, TypeException, IllegalArgumentException {

        this.size = checkSize(size);

        this.color = parseColor(colorStr);
        this.type = parseType(typeStr);
    }

    private Color parseColor(String str) throws ColorException {
        try {
            return Color.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Invalid color: " + str);
        }
    }

    private int checkSize(int size) throws IllegalArgumentException {
        if (size < 1 || size > 100) {
            throw new IllegalArgumentException("Size must be between 1 and 100");
        }
        return size;
    }

    private Type parseType(String str) throws TypeException {
        try {
            return Type.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Invalid type: " + str);
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

