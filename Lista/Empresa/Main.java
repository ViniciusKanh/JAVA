
/*

Monte o programa de acordo com o diagrama abaixo. Cadastre uma empresa depois apresente o seguinte menu para o usuário:
1) Cadastrar um funcionário
2) Imprimir todos os funcionários (nome e código)
3) Apresentar o total da folha de pagamento
4) Consultar dados de um funcionário (pelo nome)
5) Sair
Obs1: criar métodos para cada operação;
Obs2: na listagem de todos os funcionários, apresentar os dados da empresa.
   

*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Empresa a = new Empresa();
		Funcionario b = new Funcionario();
		Funcionario aux = null;
		int opc = 1, x;

		a.setRazaoSocial("Vinicius S/A");

		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
		System.out.println("█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█");
		System.out.println("█░░║║║╠─║─║─║║║║║╠─░░█");
		System.out.println("█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█");
		System.out.println("█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█ \n\n");

		System.out.println("██╗░░░██╗██╗███╗░░██╗██╗░█████╗░██╗██╗░░░██╗░██████╗  ░██████╗░░░░██╗░█████╗░");
		System.out.println("██║░░░██║██║████╗░██║██║██╔══██╗██║██║░░░██║██╔════╝  ██╔════╝░░░██╔╝██╔══██╗");
		System.out.println(" ██╗░██╔╝██║██╔██╗██║██║██║░░╚═╝██║██║░░░██║╚█████╗░  ╚█████╗░░░██╔╝░███████║");
		System.out.println("░╚████╔╝░██║██║╚████║██║██║░░██╗██║██║░░░██║░╚═══██╗  ░╚═══██╗░██╔╝░░██╔══██║");
		System.out.println("░░╚██╔╝░░██║██║░╚███║██║╚█████╔╝██║╚██████╔╝██████╔╝  ██████╔╝██╔╝░░░██║░░██║");

		while (opc != 6) {

			System.out.println("\n****************************************************\n\n");

			System.out.println("		SISTEMA DE RECURSOS HUMANO: \n\n");

			System.out.println("		1 - Cadastrar um funcionárioe\n");

			System.out.println("		2 - Imprimir todos os funcionários (nome e código)\n");

			System.out.println("		3 - Apresentar o total da folha de pagamento\n");

			System.out.println("		4 - Consultar dados de um funcionário (pelo nome)\n");

			System.out.println("		5 - Sair\n");

			System.out.println("\n****************************************************\n\n");

			System.out.println("		\nDigite a opção: ");
			opc = ent.nextInt();

			switch (opc) {

			case 1:
				System.out.println("Funcao Escolhida: Cadastrar um funcionárioe\n\n");
				aux = new Funcionario();
				try {
					System.out.println("CODIGO (SOMENTE NUMEROS) ");
					aux.setCodigo(ent.nextInt());
					break;
				} catch (InputMismatchException erro1) {
					System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
					ent.nextLine();
				}
				ent.nextLine();
				System.out.println("NOME:\n");
				aux.setNome(ent.nextLine());
				System.out.println("SALARIO EM R$:\n");
				aux.setSalario(ent.nextDouble());
				a.add(aux);
				break;

			case 2:

				System.out.println("Funcao Escolhida: Imprimir todos os funcionários (nome e código)\n\n");

				System.out.println("LISTA DE FUNCIONARIOS\n");

				System.out.println(a.Relatorio());

				break;

			case 3:

				System.out.println("Funcao Escolhida: Apresentar o total da folha de pagamento\n\n");
				a.FolhaPagamento();

				break;

			case 4:
				System.out.println("Funcao Escolhida: Consultar dados de um funcionário (pelo nome)\n\n");

				ent.nextLine();
				System.out.println("NOME do Funcionario:\n");
				aux.setNome(ent.nextLine());
				a.procurarNome(a.ListaFun, aux.getNome());
				break;

			case 5:

				System.out.println("Saindo...");

			}

		}

	}
}