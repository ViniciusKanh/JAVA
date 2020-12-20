
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

public class Aluno {

String nome;
double nota1,nota2,nota3;
int cod;
double igual = 0, media, notaMaior = 0, notaMenor1 = 0, notaMenor2 = 0;


	void Aluno (int cod, String nome,double nota1,double nota2,double nota3){
	    
	    	
	if (nota1 > nota2 && nota1 > nota3){
		notaMaior = nota1;
		notaMenor1 = nota2;
		notaMenor2 = nota3;


	}else if (nota2 > nota1 && nota2 > nota3){
		notaMaior = nota2;
		notaMenor1 = nota1;
		notaMenor2 = nota3;

		
	
	}else if (nota3 > nota1 && nota3 > nota2){
		notaMaior = nota3;
		notaMenor1 = nota1;
		notaMenor2 = nota2;

	}
	
	if (nota1 == nota2 && nota1 == nota3){
		igual = nota1;
		
		System.out.println("A média do aluno:|"+cod+"\n|Nome:"+nome+ " \n|é: "+igual);
		
		if ( igual >= 5){
			
			System.out.println("APROVADO");
		} else {
			
			System.out.println("REPROVADO");	
		}
	}
		else{
	
	media = ((notaMaior*4) + ((notaMenor1*3)+(notaMenor2*3)));
	media = media/10;
	
	System.out.println("A média do aluno:|"+cod+"\n|Nome:"+nome+ " \n|é: "+igual);
	
	if ( media >= 5){
		
		System.out.println("APROVADO");
	} else {
		
		System.out.println("REPROVADO");
	}
	}
	    
	}







    
}

