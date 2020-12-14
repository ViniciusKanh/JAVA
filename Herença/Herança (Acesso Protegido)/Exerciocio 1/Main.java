/******************************************************************************

Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters),
e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepc
̧ão. Atributos: String nome; String endereço; String telefone;
 Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor
. Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pesso
a, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o forneced
or). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadore
s, um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivid
a. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos método
s implementados na classe Fornecedor e os herdados da classe Pessoa.
 Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem,
para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base
) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e
um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  
	  Scanner ent = new Scanner (System.in);
	  
	  
	  Fornecedor b = new Fornecedor();
	  Pessoa a = new Pessoa();
	  Empregado c = new Empregado();
	  int opc;
	  
	  System.out.println(" \n Escolha entre 1 - Fornecedor ou 2 - Empregados ");
	  opc = ent.nextInt();
	  
	  if (opc ==1){
	  ent.nextLine();
	  System.out.println("Digite o nome do Fornecedor: ");
	  b.nome=ent.nextLine();
	  System.out.println("Digite o Endereco do Fornecedor: ");
	  b.setEndereco(ent.nextLine());
	  System.out.println("Digite o Telefone do Fornecedor: ");
	  b.telefone=ent.nextLine();	  
	  System.out.println("Digite o Valor de Credito do Fornecedor: ");
	  b.setValorCredito(ent.nextDouble());
	  System.out.println("Digite o Valor da Divida do Fornecedor: ");
	  b.setValorDivida(ent.nextDouble());	  
	  
	  b.dados(b.nome, b.getEndereco(), b.telefone, b.getValorCredito(), b.getValorDivida());
	  
	  System.out.println("Saldo R$ "+b.obterSaldo());
	  
	  }
	  
	  if (opc == 2){
	  
	  ent.nextLine();
	  System.out.println("Digite o nome do Empregado: ");
	  c.nome=ent.nextLine();
	  System.out.println("Digite o Endereco do Empregado: ");
	  c.setEndereco(ent.nextLine());
	  System.out.println("Digite o Telefone do do Empregado: ");
	  c.telefone=ent.nextLine();
	  System.out.println("Digite o Codigo do Setor do Empregado: ");
	  c.codigoSetor=ent.nextInt();	  
		System.out.println("Digite o Salario Base do Empregado: ");
	  c.setSalarioBase(ent.nextDouble());
	  System.out.println("Digite o Imposto: ");
	  c.Imposto=ent.nextDouble();	  
	    
     c.dados(c.nome, c.getEndereco(), c.telefone, c.codigoSetor, c.getSalarioBase(),c.Imposto);	    
	    
	   System.out.println("Salario R$ "+c.calcularSalario(c.getSalarioBase(),c.Imposto)); 
	    
	  }
	  
	}
	
	
}
