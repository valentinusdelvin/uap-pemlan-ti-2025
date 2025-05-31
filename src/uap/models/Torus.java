package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, MassCalculable, MassConverter, ShippingCostCalculator, PiRequired {
    private double majorRadius;
    private double minorRadius;

    public Torus() { // + Torus() [cite: 10]
        super();
        this.name = "Donat dengan lubang"; // Name for Torus [cite: 12]
    }

    public Torus(double majorRadius, double minorRadius) {
        this();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return (2 * (PI*PI) * majorRadius * minorRadius * minorRadius);
    }

    @Override
    public double getSurfaceArea() {
        return (4 * PI * PI * majorRadius * minorRadius);
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
