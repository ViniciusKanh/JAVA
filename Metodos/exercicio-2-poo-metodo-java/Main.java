/******************************************************************************

Criar um programa que possa entrar com três números e, para cada um,
imprimir o dobro. Usar uma função que retorne valor.
Esta função deverá ser criada em uma classe à parte.
*******************************************************************************/


import java.util.Scanner;


public class Main
{

  public static void main (String args[])
  {
    Scanner ent = new Scanner (System.in);
    
    Soma a = new Soma();
    
    int A,B,C,resultado;
    
    System.out.println("Digite tres valores: \n");
    A = ent.nextInt();
    B = ent.nextInt();
    C = ent.nextInt();
    
    //resultado = a.valora(A);
    System.out.println("O dobro de a e :"+ a.valora(A));
    System.out.println("O dobro de a e :"+ a.valorb(B));
    System.out.println("O dobro de a e :"+ a.valorc(C));


  }
}
