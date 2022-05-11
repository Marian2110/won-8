package com.accenture.day3.homework.ex6;

public enum PaperSize {
    A4(244, 124),
    A3(21122, 12321),
    A2(111, 321);

    private final int length;
    private final int width;

    PaperSize(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
