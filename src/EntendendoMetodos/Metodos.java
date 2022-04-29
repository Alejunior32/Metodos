package EntendendoMetodos;

import java.text.DecimalFormat;

public class Metodos {
        public static void calcularSoma(double valor1, double valor2){
        System.out.println("A soma entre os números "+valor1 +" e " +valor2+" é: "+ (valor1+valor2));
    }
    public static void calcularSubtração(double valor1, double valor2){
        System.out.println("A Subtração entre os números "+valor1 +" e " +valor2+" é: "+ (valor1-valor2));
    }
    public static void calcularDivisão(double valor1, double valor2){
        System.out.println("A divisão dos números "+valor1 +" e " +valor2+" é: "+ (valor1/valor2));
    }
    public static void calcularMultiplicação(double valor1, double valor2){
        System.out.println("A multiplicação dos números "+valor1 +" e " +valor2+" é: "+ (valor1*valor2));
    }

    static DecimalFormat decimal=new DecimalFormat("#.##");
    public static void calcularEmprestimo(float valorEmprestimo,int parcelas,float taxaJuros){
        double valorFinal= ((valorEmprestimo)+valorEmprestimo*(taxaJuros/100)*parcelas);
        System.out.println("O valor final do emprestimo, pago em "+parcelas+" parcelas de R$ "+decimal.format((valorEmprestimo/parcelas))+"+"
                +taxaJuros+"%(a.m), sera de R$ "+decimal.format(valorFinal)+ " ou "+parcelas+"x de R$ "+decimal.format((valorFinal/parcelas)));
    }

    public static void mesagem(int hora, int minutos){
        if(hora >= 6 && hora <= 12 && minutos >=0 && minutos<=60){
            mesagemBomDia();
        } else if (hora >= 13 && hora <= 18 && minutos >=0 && minutos<=60) {
            mesagemBoaTarde();
        }
        else if (hora >= 19 && hora <=5 && minutos >=0 && minutos<=60) {
            mesagemBoaNoite();
        } else {
            System.out.println("Horário inválido");
        }
    }
    public static void mesagemBomDia(){
        System.out.println("Bom dia!");
    }
    public static void mesagemBoaNoite(){
        System.out.println("Boa noite!");
    }
    public static void mesagemBoaTarde(){
        System.out.println("Boa tarde!");
    }
}
