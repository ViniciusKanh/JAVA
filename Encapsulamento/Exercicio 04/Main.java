/******************************************************************************

Defina uma classe Aluno com os dados privados para armazenar a matrícula,a nota1 e a nota2.
Inclua os métodos: um para imprimir os dados e um para calcular a media.
Aplicar os métodos para o objeto alu1

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	    
	   Aluno a = new Aluno();
	   a.setmatricula(123);
	   a.setnota1(8);
	   a.setnota2(9);
	   
	   a.media(a.getmatricula(),a.getnota1(),a.getnota2());
		
	}
}
