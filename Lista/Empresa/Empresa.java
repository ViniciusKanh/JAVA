import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

	Scanner ent = new Scanner(System.in);

	private String CNPJ;
	private String RazaoSocial;
	public ArrayList<Funcionario> ListaFun;

	public Empresa() {

		ListaFun = new ArrayList<Funcionario>();
		Funcionario aux = null;

	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String RazaoSocial) {
		this.RazaoSocial = RazaoSocial;
	}

	public void add(Funcionario v) {
		ListaFun.add(v);
	}

	public void FolhaPagamento() {

		if (ListaFun.isEmpty()) {

			System.out.println("Lista Vazia, Por favor inserir os Dados no Cadastro.\n");

		} else {

			System.out.println("Empresa: " + RazaoSocial + "\n");
			for (Funcionario v : ListaFun) {
				System.out.println("\nNOME: " + v.getNome() + "  ||   Salario Liquido: R$ " + v.getSalario() + "\n");
			}

		}

		for (Funcionario v : ListaFun) {
			System.out.println("\nTotal da Folha de Pagamento: " + v.getSalario() + "\n");
		}

	}

	public String Relatorio() {

		String msg = "";

		if (ListaFun.isEmpty()) {

			System.out.println("Lista Vazia, Por favor inserir os Dados no Cadastro.\n");

		} else {

			msg += "Empresa: " + RazaoSocial + "\n";
			for (Funcionario v : ListaFun) {
				msg += "ID: " + v.getCodigo() + "\nNOME: " + v.getNome() + "\nSalario: R$ " + v.getSalario() + "\n";
				msg +="\n****************************************************\n\n";
			}

		}

		return msg;

	}

	public static int procurarNome(ArrayList<Funcionario> ListaFun, String nome) {

		int quantidade = 0;
		if (!ListaFun.contains(nome)) {

			System.out.println("O nome não existe!");

		} else {

			for (int contador = 0; contador < ListaFun.size(); contador++) {

			}

		}

		return quantidade;

	}

}