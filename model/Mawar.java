package model;

public class Mawar implements Shape {
    private String color;

    public Mawar(String color) {
        this.color = color;
    }

    @Override
    public String jenis() {
        return  "Putih";
    }
}
