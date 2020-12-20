/******************************************************************************

Criar uma classe que conteraL dois meLtodos com o mesmo nome
. O primeiro teraL somente um paraLmetro e retornaraL o valor do paraLmetro elevado ao quadra
do. O segundo meLtodo deveraL ter dois paraLmetros: o primeiro seraL o nuLmero que seraL elevado ao segundo paraL
metro. Criar um objeto e o usuaLrio deveraL digitar o valores de entrada
. Apresente o valor de retorno dos dois meLtodos criados.
*******************************************************************************/
import java.util.Scanner;


public class Main
{

  public static void main (String args[])
  {

    Scanner ent = new Scanner (System.in);
    Classe a = new Classe ();

    int opc;

      System.out.println (" ---------Digite um valor---------\n");
      a.numero = ent.nextFloat ();

      System.out.println (" ---------Oque deseja fazer com ele---------\n");
      System.out.println (" - 01 - Elevar ao Quadrado\n");
      System.out.println (" - 02 - Elevar ao numero que eu escolher\n");
      opc = ent.nextInt ();
    if (opc == 1)
      {

	a.quadrado (a.numero);

      }

    if (opc == 2)
      {
	System.out.
	  println
	  (" ---------Digite o valor que deseja elevar seu numero ---------\n");
	a.numero2 = ent.nextFloat ();

	a.quadrado (a.numero, a.numero2);

      }




  }
}
