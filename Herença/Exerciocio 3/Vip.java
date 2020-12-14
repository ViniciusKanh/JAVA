/******************************************************************************

Crie uma classe chamada Ingresso que possui um valor em reais
e um método imprimeValor().
 crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
 crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso Normal".
 Crie dois objetos: um para a classe VIP e a outra Normal. Apresente os valores finais de cada um.
*******************************************************************************/


public class Vip extends Ingresso {

	 
 @Override
	  
	public double getvaloradicional() {
		
		return getValor() * 0.50;
	}
	
}
