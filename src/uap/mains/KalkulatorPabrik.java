package uap.mains;

import uap.models.Torus;
import uap.models.Sphere;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Valentinus Delvin Wicaksono");
        System.out.println("245150700111016");
        System.out.println("=============================================");

        Torus torus = new Torus();
        System.out.println(torus.getName());
        System.out.println("=============================================");
        System.out.print("Isikan Radius    : ");
        double majorRadius = input.nextDouble();
        System.out.print("Isikan radius    : ");
        double minorRadius = input.nextDouble();
        torus = new Torus(majorRadius, minorRadius);

        System.out.println("=============================================");
        torus.printInfo(); // printInfo diisikan dengan volume, luas permukaan, dan massa [cite: 7]
        System.out.println("Massa dalam kg   : " + torus.gramToKilogram());
        System.out.printf("Biaya kirim      : Rp %.0f%n", torus.calculateCost()); // biaya kirim ditulis dalam format rupiah [cite: 7]
        System.out.println("=============================================");

        // Sphere Calculation (Donat tanpa lubang) [cite: 12]
        Sphere sphere = new Sphere();
        System.out.println(sphere.getName());
        System.out.println("=============================================");
        System.out.print("Isikan radius    : "); // Isikan radius (input pengguna, isi dengan 21) [cite: 12]
        double radius = input.nextDouble();
        sphere = new Sphere(radius); // Create new Sphere object with user input

        System.out.println("=============================================");
        sphere.printInfo(); // printInfo diisikan dengan volume, luas permukaan, dan massa [cite: 7]
        System.out.println("Massa dalam kg   : " + sphere.gramToKilogram());
        System.out.printf("Biaya kirim      : Rp %.0f%n", sphere.calculateCost()); // biaya kirim ditulis dalam format rupiah [cite: 7]
        System.out.println("=============================================");

        input.close();
    }
}
