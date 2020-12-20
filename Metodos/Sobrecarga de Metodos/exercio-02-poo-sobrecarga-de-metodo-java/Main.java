/******************************************************************************

Criar uma classe que conteraL os seguintes meLtodos:
double calcularMedia(double nota1, double nota2)
double calcularMedia(double nota1, double nota2, int peso1, int peso2)
Obs: O primeiro iraL calcular a meLdia aritmeLtica e o segundo iraL calcular a meLdia ponderada.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Classe a = new Classe ();
    Scanner teclado = new Scanner (System.in);

int opc;
      System.out.println ("-------- Bom Dia ------------------------\n");
      System.out.println ("-------- Oque vc deseja Fazer -----------\n");
      System.out.println ("-------- Escolha abaixo -----------------\n");
      System.out.println ("1) Media Aritimetica \n");
      System.out.println ("2) Media ponderada  \n");
      opc = teclado.nextInt();

    if (opc == 1)
      {

	System.out.println ("##################################\n");

	System.out.println ("       MEDIA ARITMETICA  \n");

	System.out.println ("##################################\n");
	
	System.out.println ("Digite a primeira nota");
	a.nota1 = teclado.nextDouble ();
	System.out.println ("Digite a segunda nota");
	a.nota2 = teclado.nextDouble ();




	a.calcularMedia (a.nota1, a.nota2);

      }
      
      if (opc ==2 ){
          
    System.out.println ("##################################\n");

	System.out.println ("       MEDIA Ponderada  \n");

	System.out.println ("##################################\n");
	
	System.out.println ("Digite a primeira nota");
	a.nota1 = teclado.nextDouble ();
	System.out.println ("Digite a segunda nota");
	a.nota2 = teclado.nextDouble ();
    System.out.println ("Digite o peso 1");
	a.peso1 = teclado.nextInt ();
	System.out.println ("Digite o peso 2");
	a.peso2 = teclado.nextInt ();

          
          
    a.calcularMedia (a.nota1, a.nota2, a.peso1, a.peso2);
    
      }
  }
}
