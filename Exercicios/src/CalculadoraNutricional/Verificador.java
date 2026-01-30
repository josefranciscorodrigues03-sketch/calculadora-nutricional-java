package CalculadoraNutricional;

public class Verificador {

    public boolean peso(double peso) {
        if (peso <= 0) {
            System.out.println("peso invalido");
            return false;
        }
        return true;
    }

    public boolean altura(double altura) {
        if (altura <= 0) {
            System.out.println("altura invalida");
            return false;
        }
        return true;
    }

    public boolean alturaCm(int altura) {
        if (altura <= 0) {
            System.out.println("altura invalida");
            return false;
        }
        return true;
    }

    public boolean idade(int idade) {
        if (idade <= 0) {
            return false;
        }
        return true;
    }
}
