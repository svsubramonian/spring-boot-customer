package com.example.demo.model;

public class Widget {
    private String color = null;
    private int height;
    private int width;

    public Widget(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
