package model;

public class Melati implements Shape {
    private String color;

    public Melati(String color) {
        this.color = color;
    }

    @Override
    public String jenis() {
        return "Ungu";
    }
}

