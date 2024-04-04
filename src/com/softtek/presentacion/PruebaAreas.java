package com.softtek.presentacion;
import com.softtek.modelo.Areas;
public class PruebaAreas {
    public static void main(String[] args) {
        double areaCirculo = Areas.areaCirculo(5);
        System.out.println("El área del círculo es: " + areaCirculo);

        double areaRectangulo = Areas.areaRectangulo(10, 4);
        System.out.println("El área del rectángulo es: " + areaRectangulo);
    }
}
