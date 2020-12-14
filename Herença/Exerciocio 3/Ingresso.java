
import java.util.Scanner;
public class Ingresso {

	Scanner teclado = new Scanner (System.in);
	
private double valor;



public double getValor() {
	return valor;
}



public void setValor(double valor) {
	this.valor = valor;
}



public void imprimeValor() {
		
		
		System.out.println("O Valor do Ingresso Normal sai por: R$ "+getValor());
	}
	

	public double getvaloradicional() {
		
		return this.getValor() * 0.30;
	}

}
