package com.softserve.academy.homework08.practicaltask.two;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String colorStr, String typeStr)
            throws ColorException, TypeException, IllegalArgumentException {

        this.size = size;

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

