/******************************************************************************

Crie uma classe Conta que iraL manipular contas de um banco. Siga as especificacL'oLes que estaLo no slide seguinte:
 Apresente o seguinte menu : o5 Realizar depoLsito
o5 Realizar saque
o5 Mostrar saldo
o5 Mostrar informacL'oLes do titular o5 Sair  
Exemplo: Caso o usuaLrio escolha a opcL'aLo de realizar depoLsito, o mesmo deve digitar o valor que ele quer depositar.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner ent = new Scanner (System.in);
    Conta a = new Conta ();

    int opc,valor;

      System.out.println ("#################");
      System.out.println ("REALIZAR CADASTRO");
      System.out.println ("#################");
      System.out.println ("Digite seu nome");
      a.setnome (ent.nextLine ());
      System.out.println ("Digite o tipo de conta");
      a.settconta1 (ent.nextLine ());
      System.out.println ("Digite o seu Saldo");
      a.setsaldo (ent.nextDouble ());
      System.out.println ("######################################");
      System.out.println ("Escolha uma das Operacoes abaixo \n");
      System.out.println ("######################################");
      System.out.println ("1. Realizar Deposito");
      System.out.println ("2. Realizar Saques");
      System.out.println ("3. Mostrar Saldo");
      System.out.println ("4. Mostrar informacoes do titular");
      opc = ent.nextInt ();
    switch (opc)
      {
      case 1:
    System.out.println ("Digite o valor a depositar");   
    valor=ent.nextInt();
	a.deposito (valor);
	System.out.println (" Saldo:"+a.getsaldo());
	break;
	case 2:
    System.out.println ("Digite o valor a sacar");   
    valor=ent.nextInt();
	a.sacar (valor);
	System.out.println (" Saldo:"+a.getsaldo());
	break;
	case 3:
	System.out.println ("Seu saldo atual e: "+a.getsaldo());
	break;
	case 4:a.mostratitular(a.getnome(),a.gettconta1(),a.getsaldo());
	break;
	default:System.out.println ("Opcao invC!lido");
      }


  }
}
