/******************************************************************************

Defina uma classe chamada de Livro, ela deve conter os seguintes atributos: código,
título, ano, editora e preço. Além disso, essa classe deve conter os métodos get e set e 
também um construtor que recebe todos os atributos como parâmetros e um outro construtor padrão. 
Criar dois objetos, cada um com construtores diferentes. Imprima o código e o nome do livro mais caro.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
		 Livro a = new Livro();
		 Livro b = new Livro();
		 
		 System.out.println("Digite o Codigo do livro");
		 a.setcod(ent.nextInt());
		 System.out.println("Digite o Nome do livro");
		 a.setlivro(ent.nextLine());
		 System.out.println("Digite o Ano do livro");
		 a.setano(ent.nextInt());
		 System.out.println("Digite o Nome doa Editora");
		 a.seteditora(ent.nextLine());
		 System.out.println("Digite o Preco do livro");
		 a.setpreco(ent.nextDouble());
		 
		 System.out.println("Digite o Codigo do livro");
		 b.setcod(ent.nextInt());
		 System.out.println("Digite o Nome do livro");
		 b.setlivro(ent.nextLine());
		 System.out.println("Digite o Ano do livro");
		 b.setano(ent.nextInt());
		 System.out.println("Digite o Nome doa Editora");
		 b.seteditora(ent.nextLine());
		 System.out.println("Digite o Preco do livro");
		 b.setpreco(ent.nextDouble());
		 
		 if(a.getpreco()>b.getpreco()){
		     
		     System.out.println("O livro de codigo : "+a.getcod()+", e o mais caro");
		     
		 }
		 
			 if(b.getpreco()>a.getpreco()){
		     
		     System.out.println("O livro de codigo : "+b.getcod()+", e o mais caro");
		     
		 }
	}
}
