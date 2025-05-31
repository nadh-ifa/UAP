package PabrikDonat.uap.mains;

import java.util.Scanner;
import PabrikDonat.uap.models.Torus;
import PabrikDonat.uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Nadhifa Fitriyah Wadiaturabbi"); 
        System.out.println("245150707111064"); 
        System.out.println("=============================================");
        
        // Torus
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        
        Torus torus = new Torus();
        
        System.out.print("Isikan Radius : ");
        double majorRadius = input.nextDouble();
        torus.setMajorRadius(majorRadius);
        
        System.out.print("Isikan radius : ");
        double minorRadius = input.nextDouble();
        torus.setMinorRadius(minorRadius);
        
        System.out.println("=============================================");
        torus.printInfo();
        
        // Sphere
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        
        Sphere sphere = new Sphere();
        
        System.out.print("Isikan radius : ");
        double sphereRadius = input.nextDouble();
        sphere.setRadius(sphereRadius);
        
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");
        
        input.close();
    }
}
