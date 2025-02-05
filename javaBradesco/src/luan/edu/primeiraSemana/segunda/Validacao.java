package luan.edu.primeiraSemana.segunda;

import java.util.Scanner;

public class Validacao {
    public static void main (String [] args) {

        Scanner ler = new Scanner(System.in);
        double nota1, nota2;

        System.out.print("Digite sua primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota2 = ler.nextDouble();

        double mediaFinal = (nota1 + nota2) / 2;

        System.out.println(" Sua media final foi: " + mediaFinal);

        if (mediaFinal>=6){
            System.out.println("Parabens, APROVADO!");
        }
        else if (mediaFinal>=4) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.print("REPROVADO BURRO");
        }
    }
}
