package ETS.UT4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UT4_RefactorizaciónModular {
    public static void main(String[] args) {
        float base, areaTriangulo, alturaPrisma, areaLateral,areaTotal;
        System.out.println("Introduce la base del triángulo: ");
        base = inputFloat();
        areaTriangulo = areaBase(base,alturaTriangulo(base));
        System.out.println("Introduce ahora la altura del prisma: ");
        alturaPrisma = inputFloat();
        areaLateral = areaLateral(perimetro(base), alturaPrisma);
        areaTotal = areaTotal(areaTriangulo,areaLateral);
        System.out.println("El área de la base es: "+areaTriangulo+
                "\nEl del lateral es: "+areaLateral+
                "\nSiendo por lo tanto el área total: "+areaTotal);
    }
    private static float inputFloat() {
        Scanner escaner = new Scanner(System.in);
        boolean repetir = true;
        float dato = 0;
        do {
            try {
                dato = escaner.nextFloat();
                repetir = false;
            } catch (InputMismatchException e) {
                System.err.println("Dato inválido, introduzca números");
                escaner.next();
            }
        } while (repetir);
        return dato;
    }
    public static float alturaTriangulo (float baseTriangulo) {
        float altura = (float) (Math.sqrt(3)*baseTriangulo/2);
        return altura;
    }
    public static float areaBase (float baseTriangulo, float alturaTriangulo) {
        float areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
        return areaTriangulo;
    }
    public static float perimetro (float baseTriangulo) {
        float perimetro = 3*baseTriangulo;
        return perimetro;
    }
    public static float areaLateral (float perimetro, float alturaPrisma) {
        return perimetro*alturaPrisma;
    }
    public static float areaTotal (float areaBase, float areaLateral) {
        return ((2*areaBase)+areaLateral);
    }

}
