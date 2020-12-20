/******************************************************************************

Escreva uma classe Aluno, com atributos código, nome, nota1, nota2 e média. Construa os seguintes métodos:
 Calcular a média aritmética das notas e atribuir na media. Este método não retorna nada.
 Verificar se o aluno está aprovado ou reprovando, sabendo que a média é 6. Este método retorna uma string.
 Imprimir todos os dados do aluno no qual o método retorna uma string.
 Construir dois métodos construtores: um sem parâmetros e o outro com
código, nome e as notas como parâmetros.
Cadastrar 2 objetos, usando um construtor diferente para cada um. Imprima somente os alunos aprovados.

*******************************************************************************/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

    Aluno a = new Aluno();

	Scanner teclado = new Scanner(System.in);
	
    System.out.println("Digite o código do aluno");
	a.cod = teclado.nextInt();
	System.out.println("Digite o nome do aluno");
	a.nome = teclado.nextLine();
	System.out.println("Digite a primeira nota");
	a.nota1 = teclado.nextDouble();
	System.out.println("Digite a segunda nota");
	a.nota2 = teclado.nextDouble();
	System.out.println("Digite a terceira nota");
	a.nota3 = teclado.nextDouble();
	
	a.Aluno(a.cod,a.nome,a.nota1,a.nota2,a.nota3);


}

}


