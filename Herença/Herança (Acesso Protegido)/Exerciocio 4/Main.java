/******************************************************************************

4. Elabore uma classe ContaBancaria, com os seguintes membros:
 Atributo String cliente;
 Atributo int num_conta;
 Atributo float saldo;
 Método sacar (o saldo não pode ficar negativo);
 Método depositar
Agora acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupanca e ContaEspecial, as seguintes características a mais:
 Classe ContaPoupanca
 Atributo int diaDeRendimento
 Classe ContaPoupanca
 Atributo int diaDeRendimento
 Método calcularNovoSaldo, recebe a taxa de rendimento da poupança e atualiza o saldo
 Classe ContaEspecial
 Atributo float limite
 Redefinição do método sacar, permitindo saldo negativo até o valor do limite.
Após a implementação das classes acima, você deverá implementar uma classe ContasJava, contendo o método main. Nesta classe, você deverá implementar:
 Incluir dados relativos a(s) conta(s) de um cliente;  Depois, apresentar as seguintes opções no menu:
 Sacar um determinado valor da(s) sua(s) conta(s);
 Depositar um determinado valor na(s) sua(s) conta(s);
 Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança;
 Mostrar os dados da(s) conta(s) de um cliente.
*******************************************************************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int opc, i = 0,taxa;
		float saque, desposito;
		Scanner ent = new Scanner(System.in);
		ContaPoupanca b = new ContaPoupanca();
		ContaEspecial a = new ContaEspecial();
		
		System.out.println("Escolha uma Opcao :\n 1- Conta Popança;\n 2- Conta Especial.\n");
		opc = ent.nextInt();
		switch (opc) {
		case 1:
			i = 0;
		
			ent.nextLine();
			System.out.println("Digite o nome do cliente:");
			b.setCliente(ent.nextLine());
			System.out.println("Digite o número da conta do Cliente:");
			b.setNum_conta(ent.nextInt());
			System.out.println("Digite o dia de rendimento do Cliente:");
			b.setDiaDeRedimento(ent.nextInt());
			b.setSaldo(0);
			while(i != 5) {
				System.out.println("Escolha uma opcao :\n 1- Sacar;\n 2- Depositar;\n 3- Mostar saldo Atualizado ;\n 4- Mostar os dados;\n5- Sair.");
				i = ent.nextInt();
				switch (i) {
				case 1:
					System.out.println("Digite o valor que deseja sacar:");
					saque = ent.nextFloat();
					System.out.println(b.sacar(saque));
					break;
				case 2:
					System.out.println("Digite o valor que deseja depositar:");
					desposito = ent.nextFloat();
					b.depositar(desposito);
					break;
				case 3:
					System.out.println("Digite o valor da taxa de rendimento:");
					taxa = ent.nextInt();
					b.calcularNovoSaldo(taxa);
					System.out.println("\nSaldo: R$: " + b.getSaldo());
					break;
				case 4:
					System.out.println("\nNome: " + b.getCliente() + "\nNúmero conta: " + b.getNum_conta() +
							"\nSaldo: R$ " + b.getSaldo() + "\nDia de Rendimento: " + b.getDiaDeRendimento());
					break;
				default:
					break;
				}
			}
			break;
		case 2:
			i = 0;
			
			ent.nextLine();
			System.out.println("Digite o nome do cliente:");
			a.setCliente(ent.nextLine());
			System.out.println("Digite o número da conta do Cliente:");
			a.setNum_conta(ent.nextInt());
			System.out.println("Digite o limite de saldo do Cliente:");
			a.setLimite(ent.nextFloat());
			a.setSaldo(0);
			while(i != 4) {
				System.out.println("Escolha uma opcao :\n 1- Sacar;\n 2- Depositar;\n 3- Mostar os dados;\n 4- Sair.");
				i = ent.nextInt();
				switch (i) {
				case 1:
					System.out.println("Digite o valor:");
					saque = ent.nextFloat();
					System.out.println(a.sacar(saque));
					break;
				case 2:
					System.out.println("Digite o valor:");
					desposito = ent.nextFloat();
					a.depositar(desposito);
					break;
				case 3:
					System.out.println("\nNome: " + a.getCliente() + "\nNúmero conta: " + a.getNum_conta() +
							"\nSaldo R$: " + a.getSaldo());
					break;
				default:
					break;
				}
			}
			break;
		}
		ent.close();
	}
}
