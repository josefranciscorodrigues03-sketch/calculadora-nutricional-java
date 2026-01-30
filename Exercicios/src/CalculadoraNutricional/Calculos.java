package CalculadoraNutricional;
import java.util.Scanner;
public class Calculos {
    public static double Imc(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static double AguaMin(double peso) {
        var agua = peso*35;
        return agua;
    }
    public static double Tmb(double peso, int idade, int altura, double genero, int escolha) {
        double taxa;
        if (genero == 1) {
            taxa = 66.5 + (13.75*peso) + (5.003 * altura) - (6.75*idade);
        } else if (genero == 2) {
            taxa = 655.1 + (9.563*peso) + (1.850 * altura) - (4.676 * idade);
        } else {
            System.out.println("você não escolheu");
            return 0;
        }
        switch (escolha) {
            case 1:
                return taxa*1.2;
            case 2:
                return taxa*1.37;
            case 3:
                return taxa*1.55;
            case 4:
                return taxa*1.72;
            case 5:
                return taxa*1.9;
            default:
                System.out.println("Invalido");
                return 0;
        }
    }
}

