package br.com.teste.Lenscope;

import java.util.Scanner;

public class FazerOculos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Float esfericoOE, esfericoOD, cilindricoOE, cilindricoOD;

        mensagemInicial();

        System.out.println("Digite o grau esférico do OlHO ESQUERDO: ");
        esfericoOE =Float.parseFloat(scan.nextLine());
        validarEsferico(esfericoOE);

        System.out.println("Digite o grau esférico do OLHO DIREITO: ");
        esfericoOD = Float.parseFloat(scan.nextLine());
        validarEsferico(esfericoOD);

        System.out.println("Digite o grau cilíndrico OLHO ESQUERDO: ");
        cilindricoOE = Float.parseFloat(scan.nextLine());
        validarCilindrico(cilindricoOE);

        System.out.println("Digite o grau cilíndrico OLHO ESQUERDO: ");
        cilindricoOD = Float.parseFloat(scan.nextLine());
        validarCilindrico(cilindricoOD);

        System.out.println("Grau Esférico OLHO ESQUERDO: " + esfericoOE
                + " Grau esférico OLHO DIREITO: " + esfericoOD);
        System.out.println("Grau CILÍNDRICO OLHO ESQUERDO: " + cilindricoOE
                + " Grau CILÍNDRICO OLHO DIREITO: " + cilindricoOD);


        if(esfericoOE > -3 || esfericoOD > -3 || esfericoOE > -10 || esfericoOD > -10){
            if(cilindricoOE > -2F  || cilindricoOD > -2F){
                System.out.println("Sua lente será PRIME!");
            }
        }else if (esfericoOE > -3 || esfericoOD > -3 || esfericoOE < -10 || esfericoOD < -10){
            if(cilindricoOE < -2F  || cilindricoOD < -2F) {
                System.out.println("Sua lente será VISION!");
            }
        }
        mensagemFinal();
    }



    public static void mensagemInicial(){
        System.out.println("**************************");
        System.out.println("Faça sua lente conosco!");
        System.out.println("**************************");
    }

    public static void validarEsferico(float esfericoOE){
        while(esfericoOE > 0F || esfericoOE < -15F) {
            System.out.println("Valor inválido; Insira um valor válido, por favor:");
            Scanner scan = new Scanner(System.in);
            esfericoOE = Float.parseFloat(scan.nextLine());
        }
    }

    public static void validarCilindrico(float cilindricoOE){
        while (cilindricoOE < -6F){
            System.out.println("Valor inválido; Insira um valor válido, por favor:");
            Scanner scan = new Scanner(System.in);
            cilindricoOE = Float.parseFloat(scan.nextLine());

        }
    }

    public static void mensagemFinal(){
        System.out.println("**************************");
        System.out.println("Obrigada por sua visita!");
        System.out.println("**************************");
    }

}
