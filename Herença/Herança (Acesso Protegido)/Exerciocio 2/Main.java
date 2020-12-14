/******************************************************************************

Cadastrar um Empregado e um Gerente, usando as seguintes classes:
O método CalculaSalario() deve retornar o salário, sendo que o salário do gerente é o salario + gratificação.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  
	  Scanner ent = new Scanner (System.in);
	  Gerente a = new Gerente();
	  
	  //ent.nextLine();
		System.out.println("Digite o Nome do Gerente");
		a.setNome(ent.nextLine());
		System.out.println("Digite o Salario do Gerente");
		a.salarioFixo=ent.nextDouble();		
		System.out.println("Digite a Gartificacao");
		a.setGratificacao(ent.nextDouble());		
		
		a.ImprimeDados();
		a.CalculaSalario(a.salarioFixo, a.getGratificacao());
	}
}
