package driver;

import java.util.Scanner;

import model.Anggrek;
import model.Mawar;
import model.Shape;
import model.ShapeType;
import model.Melati;

/*12S22017_Lenna Febriana */

public class TumbuhanDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Anggrek anggrek = new Anggrek("Purple");
        Melati melati = new Melati("White");
        Mawar mawar = new Mawar("Red");

        System.out.println("Pilih jenis Tumbuhan (0: Anggrek, 1: Melati, 2: Mawar): ");
        int choice = scanner.nextInt();
        ShapeType shapeType = null;

        switch (choice) {
            case 0:
                shapeType = ShapeType.ANGGREK;
                break;
            case 1:
                shapeType = ShapeType.MELATI;
                break;
            case 2:
                shapeType = ShapeType.MAWAR;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

       

        if (shapeType == ShapeType.ANGGREK) {
            System.out.println("warna bunga: " + jenis(anggrek));
        } else if (shapeType == ShapeType.MELATI) {
            System.out.println("warna bunga: " + jenis(melati));
        } else if (shapeType == ShapeType.MAWAR) {
            System.out.println("warna bunga: " + jenis(mawar));
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    private static String jenis(Shape shape) {
        return shape.jenis();
    }
}
