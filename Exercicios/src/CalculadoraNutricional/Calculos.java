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
    public static double Tmb(double peso, double idade, double altura, double genero) {
        if (genero == 1) {
            var taxa = 66.5 + (13.75*peso) + (5.003 * altura) - (6.75*idade);
            return taxa;
        } else if (genero == 2) {
            var taxa = 655.1 + (9.563*peso) + (1.850 * altura) - (4.676 * idade);
            return taxa;
        } else {
            System.out.println("você não escolheu");
            return 0;
        }
    }
}
