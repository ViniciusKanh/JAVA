/******************************************************************************

Crie a classe Imovel, que possui um endereço e um preço.
 crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
 crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto.
 Crie 2 objetos: um da classe Novo e do outro Velho. Entre com o endereço e o preço de cada um, com o adicional ou o desconto e apresente o valor final de cada um.

*******************************************************************************/
import java.util.Scanner;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException {
	  Scanner teclado = new Scanner (System.in);
	  
	  Velho a = new Velho();
	  Novo b = new Novo();
	  Imovel c = new Imovel();
	  
	  //c.setendereco("Avenida Morumbi N 322");
	  
	  int opc;
	  
		System.out.println("Digite o Valor do imovel");
		c.setpreco(teclado.nextDouble());
		teclado.nextLine();
	  System.out.println("Digite o Endereco do imovel");
	  c.setendereco(teclado.nextLine());
		
	  System.out.println("O IMOVEL E NOVO OU VELHO");
		System.out.println("1 - NOVO");
		System.out.println("2 - Velho");
		opc = teclado.nextInt();
		
		if (opc ==1){
		  
		  b.getadicionalpreco();
		  
		  System.out.println(" Por ser um imovel novo na: "+c.getendereco()+", o valor do realuste sera + R$ " +c.getpreco()*0.50);
		  
		}
		
		if (opc == 2){
		  
		  a.getdescontapreco();
		   System.out.println(" Por ser um imovel velho na: "+c.getendereco()+", o valor do realuste sera - R$ " +c.getpreco()*0.30);
		  
		}
		
	}
}
