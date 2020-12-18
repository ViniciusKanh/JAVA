/******************************************************************************

Crie as classes solicitadas do próximo slide.
 Faça o relacionamento (herança) entre as classes.
 Defina a saída dos dados (printDados() que retorna String) nas classes indicadas.  A classe onde tem a indicação é onde estará a saída – printDados().
 Faça a classe de teste e execute.
 O método valorInss() tem a fórmula (salário * 11%).

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner ent = new Scanner (System.in);
	
	Cliente a = new Cliente();
	Gerente b = new Gerente();
	Vendedor c = new Vendedor();
	int opc;
	
	System.out.println(" Escolha as Opcoes Abaixo \n");
	System.out.println(" 1 - Cliente \n");	  
	System.out.println(" 2 - Gerente \n");	
	System.out.println(" 3 - Vendedor \n");	
	opc=ent.nextInt();
	
	if (opc == 1 ){
	    ent.nextLine();
	  	System.out.println(" Digite o nome do Cliente \n");
	  	a.setNome(ent.nextLine());
	  	System.out.println(" Digite a Idade do Cliente \n");
	  	a.setIdade(ent.nextInt());	
	  	ent.nextLine();
	  	System.out.println(" Digite o Sexo do Cliente \n");
	  	a.setSexo(ent.nextLine());
	  	System.out.println(" Digite o Valor da Divida do Cliente \n");
	  	a.setValorDivida(ent.nextDouble());	 
	  	System.out.println(" Digite o Ano de Nascimento do Cliente \n");
	  	a.setAnoNascim(ent.nextInt());	
	  	
	  	a.printDados(a.getNome(),a.getSexo(),a.getIdade(),a.getValorDivida(),a.getAnoNascim());
	}
	
	if (opc == 2){
	   ent.nextLine();
	  	System.out.println(" Digite o nome do Gerente \n");
	  	b.setNome(ent.nextLine());
	  	System.out.println(" Digite a Idade do Gerente \n");
	  	b.setIdade(ent.nextInt());	
	  	ent.nextLine();	  	
	  	System.out.println(" Digite a Matricula do Gerente \n");
	  	b.setMatricula(ent.nextLine());
	  	System.out.println(" Digite o nome da Gerencia do Gerente \n");
	  	b.setNomeGerencia(ent.nextLine());
	  	System.out.println(" Digiteo Salario do Gerente \n");
	  	b.setSalario(ent.nextDouble());	  
	  	
	  	b.valorInss(b.getSalario());
	  	b.printDados ();
	  	
	  
	}
	
	if (opc == 3){
	  	ent.nextLine();
	  	System.out.println(" Digite o nome do Vendedor \n");
	  	c.setNome(ent.nextLine());	  
	  	System.out.println(" Digiteo Salario do Vendedor \n");
	  	c.setSalario(ent.nextDouble());	 
	  	System.out.println(" Digiteo o Valor da Vendas do Vendedor \n");
	  	c.setValorVenda(ent.nextDouble());		  	
	  	System.out.println(" Digiteo a Quantidade de Vendas do Vendedor \n");
	  	c.setQttVendas(ent.nextInt());
	  	
	  	c.printDados();
	  
	}
	}
}
