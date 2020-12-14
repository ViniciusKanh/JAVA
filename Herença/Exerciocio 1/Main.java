/******************************************************************************

Cadastrar um carro e um aviaLo conforme o diagrama de classes abaixo.
UsuaLrio deveraL digitar os valores e apresentar os valores cadastrados no final:

*******************************************************************************/
import java.util.Scanner;

public class Main
{
  

  
  public static void main (String[]args)
  {

    Scanner teclado = new Scanner (System.in);

    Carro carro = new Carro ();
    Aviao aviao = new Aviao();

    int opc;

      System.out.println ("Oque vc deseja comprar:");
      System.out.println ("1 - Carro:");
      System.out.println ("2 - Aviao:");

      opc = teclado.nextInt ();

    if (opc == 1)
      {

	System.out.println ("Digite Qual Carro vc deseja comprar");
	teclado.nextLine();
	carro.setdescricao(teclado.nextLine ());
	System.out.println ("Digite A capacidade do carro");
	carro.setcapacidade(teclado.nextInt ());
	System.out.println ("Digite A Quilometragem do carro");
	carro.setquilometragem (teclado.nextDouble ());
	
		System.out.println ("Entao seu carro sera: "+ carro.getdescricao());
		System.out.println ("Com a capacidade de : "+ carro.getcapacidade()+" Pessoas");
		System.out.println ("Com a Quilometragem : "+ carro.getquilometragem()+" KM/H");

      }

    if (opc == 2)
      {
	System.out.println ("Digite Qual Aviao vc deseja comprar");
	teclado.nextLine();
	aviao.setdescricao(teclado.nextLine ());
	System.out.println ("Digite A capacidade do Aviao");
	aviao.setcapacidade(teclado.nextInt ());
	System.out.println ("Digite A Hora do Aviao");
	aviao.sethoras (teclado.nextInt ());
	
		System.out.println ("Entao seu Aviao sera: "+ aviao.getdescricao());
		System.out.println ("Com a capacidade de : "+ aviao.getcapacidade()+" Pessoas");
		System.out.println ("E tera : "+ aviao.gethoras()+" Horas");


      }


  }

}
