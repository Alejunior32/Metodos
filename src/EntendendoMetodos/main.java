package EntendendoMetodos;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /*Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
        Sempre 2 valores devem ser passados.
        */
        double numero1 ,numero2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do numero1 e do numero2:");
        numero1=teclado.nextDouble();
        numero2=teclado.nextDouble();


        Metodos.calcularSoma(numero1,numero2);
        Metodos.calcularSubtração(numero1,numero2);
        Metodos.calcularDivisão(numero1,numero2);
        Metodos.calcularMultiplicação(numero1,numero2);


        /*
         Calcular o valor final de um empréstimo, a partir do valor solicitado. Taxas e
         parcelas influenciam.Defina arbitrariamente as faixas que influenciam nos valores.

        */
        System.out.println();
        System.out.println("Digite o valor do Emprestimo:");
        float valorEmprestimo= teclado.nextFloat() ;
        System.out.println("Digite a quantidade de parcelas do emprestimo:");
        int parcelas= teclado.nextInt();
        System.out.println("Digite a taxa de juros(%):");
        float taxaJuros = teclado.nextFloat() ;

        Metodos.calcularEmprestimo(valorEmprestimo,parcelas,taxaJuros);

        /*
        A partir da hora do dia, informe a mensagem adequada:Bom dia,Boa tarde e Boa noite
        */
        System.out.println();
        System.out.println("Digite a hora");
        int hora=teclado.nextInt();
        System.out.print(":");
        int minutos= teclado.nextInt();
        Metodos.mesagem(hora,minutos);


    }
}
