package mcm.edu.ph.villaflores_multicalculator;

import java.lang.Math;
public class Formulas {

    double x;
    double y;

    public static double coneAreaFormula(double radius,double height){
        return (Math.PI*radius)*(radius + Math.sqrt((height*height) + (radius*radius)));
    }

    public static double coneVolumeFormula(double radius,double height){
        return (Math.PI * (radius*radius*radius) * (height/3));
    }

    public static double cuboidAreaFormula(double edge){
        return (6 * (edge*edge));
    }

    public static double cuboidVolumeFormula(double edge){
        return (edge * edge * edge);
    }

    public static double cylinderAreaFormula(double radius,double height){
        return ((2*Math.PI*radius*height) + (2*Math.PI*(radius*radius)));
    }

    public static double cylinderVolumeFormula(double radius,double height){
        return (Math.PI * (radius*radius) * height);
    }

    public static double octahedronAreaFormula(double edge){
        return (2 * Math.sqrt(3) * (edge*edge));
    }

    public static double octahedronVolumeFormula(double edge){
        return ((Math.sqrt(2)/3) * (edge*edge*edge));
    }

    public static double sphereAreaFormula(double radius){
        return (4 * Math.PI * (radius*radius));
    }

    public static double sphereVolumeFormula(double radius){
        return ((4/3) * Math.PI * (radius*radius*radius));
    }
}
