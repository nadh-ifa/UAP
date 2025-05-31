package PabrikDonat.uap.models;

import PabrikDonat.uap.bases.Shape;
import PabrikDonat.uap.interfaces.MassCalculable;
import PabrikDonat.uap.interfaces.MassConverter;
import PabrikDonat.uap.interfaces.PiRequired;
import PabrikDonat.uap.interfaces.ShippingCostCalculator;
import PabrikDonat.uap.interfaces.ThreeDimensional;

public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, ShippingCostCalculator, MassConverter {
    private double majorRadius;
    private double minorRadius;
    
    public Torus() {
        super("Donat dengan lubang");
    }
    
    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }
    
    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }
    
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }
    
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }
    
    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }
    
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }
    
    @Override
    public double calculateCost() {
        double massInKg = gramToKilogram();
        int roundedKg = (int) Math.ceil(massInKg);
        return roundedKg * PRICE_PER_KG;
    }
    
    @Override
    public void printInfo() {
        System.out.printf("Volume : %.2f cm³%n", getVolume());
        System.out.printf("Luas permukaan : %.2f cm²%n", getSurfaceArea());
        System.out.printf("Massa : %.2f gram%n", getMass());
        System.out.printf("Massa dalam kg : %.3f kg%n", gramToKilogram());
        System.out.printf("Biaya kirim : Rp%.0f%n", calculateCost());
    }
}
