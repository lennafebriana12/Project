package model;

public class Anggrek implements Shape {
    private String color;

    public Anggrek(String color) {
        this.color = color;
    }

    @Override
    public String jenis() {
        return "Red";
    }
}
