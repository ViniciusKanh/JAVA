/******************************************************************************

Modele e implemente a seguinte classe: Calculadora a. Implementar apenas os operadores básicos (+, - , /, * ).
b. A classe deve ter apenas dois atributos.
c. A classe dever ter um método para cada operador.
d. Seu programa deve apresentar um menu para o usuário digitar a operação desejada.
e. Seu programa só terminará a execução assim que usuário digitar a opção de saída.

*******************************************************************************/


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
				Calculadora a = new Calculadora();
		
		int opcao = 5;
		
	      Scanner input = new Scanner(System.in);  
	      
	      
		System.out.println("-Escolha uma opção-");
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtracao");  
	    System.out.println("3. Multiplicacao");  
	    System.out.println("4. Divisao");  
	    System.out.println("0. Sair");  
	    System.out.println("Operação: ");  
	    
	    opcao = input.nextInt();
	    
	    while (opcao != 0) {
	    	
	    
	    	if (opcao == 1) {
	    		///???????
	    		/**Que outra maneira poderia ser recebido 
	    		 * os numeros, sem que se repita as próximas 
	    		 * linhas para todas operações**/
	    		
	    		
	    	    Scanner input1 = new Scanner(System.in);  
	  	      
	    		System.out.println("Qual o primeiro numero: ");
	    		  a.setnum1(input1.nextInt());
	    		System.out.println("Qual o segundo numero: ");
	    		 a.setnum2 (input1.nextInt());
	    		 
	    		 /***/
	    			int operacao = a.som(a.getnum1(), a.getnum2());
	    			
	    			System.out.println(operacao);
	    		break;
	    	}
	    	 	if (opcao == 2) {
		    		
	    	 		  Scanner input1 = new Scanner(System.in);  
	    	  	      
	  	    		System.out.println("Qual o primeiro numero: ");
	  	    		 a.setnum1(input1.nextInt());
	  	    		System.out.println("Qual o segundo numero: ");
	  	    		 a.setnum2 (input1.nextInt());
	  	    			int operacao = a.sub(a.getnum1(), a.getnum2());
	  	    			
	  	    			System.out.println(operacao);
		    		
		    		break;
		    		}
		    	 	if (opcao == 3) {
		    	 		  Scanner input1 = new Scanner(System.in);  
		    	  	      
		  	    		System.out.println("Qual o primeiro numero: ");
		  	    		  a.setnum1(input1.nextInt());
		  	    		System.out.println("Qual o segundo numero: ");
		  	    		 a.setnum2 (input1.nextInt());
		  	    			int operacao = a.mult(a.getnum1(), a.getnum2());
		  	    			
		  	    			System.out.println(operacao);
			    		break;
		    	 	}
			    	 	if (opcao == 4) {
			    	 		  Scanner input1 = new Scanner(System.in);  
			    	  	      
			  	    		System.out.println("Qual o primeiro numero: ");
			  	    		  a.setnum1(input1.nextInt());
			  	    		System.out.println("Qual o segundo numero: ");
			  	    		 a.setnum2 (input1.nextInt());
			  	    			int operacao = a.div(a.getnum1(), a.getnum2());
			  	    			
			  	    			System.out.println(operacao);
				    		break;
				    		}
			    	 	else{
					    		System.out.println("????");
					    		break;
					    		}
				    
	    }
	}
}

