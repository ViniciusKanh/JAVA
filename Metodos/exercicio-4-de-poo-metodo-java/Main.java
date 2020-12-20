

/******************************************************************************

FaC'a um mC)todo que recebe, por parC"metro, um vetor A[5] de inteiros e substitui todos os valores negativos de A por zero. 
O vetor A deve retornar alterado. Imprima o vetor no final. 
Criar os mC)todos entrada de dados, impressC#o de dados e substituiC'C#o de dados em uma classe separada.
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Main
{

  public static void main (String[]args)
  {
    Scanner ler = new Scanner (System.in);
    int[] vet = new int[5];
    int i;



      System.out.println ("entre com os valores do vetor");
      Classes.entrada (vet, ler);


      System.out.println ("Impressao");

      Classes.imprime (vet);

      System.out.println ("Valor negativos alterado para 0");
      Classes.substituicao (vet);


  }

}
