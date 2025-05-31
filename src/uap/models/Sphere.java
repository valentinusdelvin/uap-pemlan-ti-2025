package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, MassCalculable, MassConverter, ShippingCostCalculator, PiRequired {
    private double radius;

    public Sphere() {
        super();
        this.name = "Donat tanpa lubang";
    }

    public Sphere(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return getSurfaceArea() * DENSITY * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas Permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
    }
}
