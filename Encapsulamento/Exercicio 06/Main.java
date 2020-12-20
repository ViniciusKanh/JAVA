/******************************************************************************

Escreva um programa que apresente a classe Circulo, com atributos raio, area e perimetro e, os métodos calcularArea,
calcularPerimetro e imprimir. Os métodos calcularArea e calcularPerimetro devem efetuar seus respectivos cálculos e
colocar os valores nos atributos area e perimetro. O método imprimir deve mostrar na tela os valores de todos os atributos. 
Salienta-se que a área de um círculo é obtida pela fórmula (pi * raio * raio) e o perímetro por (2 * pi * raio), onde pi = 3,141516.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Circulo a = new Circulo();
	    
	    Scanner ent = new Scanner(System.in);
	    
	    
	    System.out.println("Digite o calor do raio \n");
	    a.setraio(ent.nextDouble());
	    
	    a.calculaarea(a.getraio());
	    a.calculaperimetro(a.getraio());
	
	
	
	
	
	
	}
}
