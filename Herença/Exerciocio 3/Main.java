/******************************************************************************

Crie uma classe chamada Ingresso que possui um valor em reais
e um método imprimeValor().
 crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
 crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso Normal".
 Crie dois objetos: um para a classe VIP e a outra Normal. Apresente os valores finais de cada um.
*******************************************************************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner (System.in)) {
		  
			Ingresso a = new Ingresso();
			Vip b = new Vip();
			Normal c = new Normal();
			
			int opc;
			
			System.out.println("Digite o Valor do Ingresso");
			a.setValor(teclado.nextDouble());
			System.out.println("Qual a Opcao de que vc deseja comprar");
			System.out.println("1 - Vip");			
			System.out.println("2 - Normal");			
			opc = teclado.nextInt();			
				
				if(opc == 1){
 System.out.println("O com o ingresso VIP o valor sai: R$ "+ (a.getValor() + a.getvaloradicional()));
				
			}
			
			if (opc == 2){


      a.imprimeValor();
			  
			  
			}
		}
	}
	
}


