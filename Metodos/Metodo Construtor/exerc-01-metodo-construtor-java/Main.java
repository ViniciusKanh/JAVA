/****************************************************************************************************************

1) Crie uma classe chamada Gerente para definir os objetos que representarão os gerentes do banco.
Defina dois métodos de aumento salarial nessa classe (usar a sobrecarga de métodos)
.O primeiro deve aumentar o salário com uma taxa fixa de 10%. O segundo deve aumentar o salário com uma taxa variável
. Construir também o método construtor para receber o salário inicial.

******************************************************************************************************************/

import java.util.Scanner;

public class Main
{
 public static void main (String []args){
     
         
        Gerente ger = new Gerente();
         
        System.out.println ("Salario atual: " + ger.salario + "\n");
         
        System.out.println("O gerente: " + ger.nome + " recebera um aumento de salario em 10% \n");
         
        ger.aumentarSalario();
        System.out.println("Salario atual: " + ger.salario);
         
                System.out.println("\n O gerente: " + ger.nome + " recebera um aumento de salario em 20% \n");
                 
        ger.aumentarSalarioVariavel(0.2);
        System.out.println("Salario atual: " + ger.salario);
    }
}