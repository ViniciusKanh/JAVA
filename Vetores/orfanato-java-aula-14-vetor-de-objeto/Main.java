/******************************************************************************

Um orfanato deseja cadastrar os doadores voluntários. Para isso deve ter as seguintes informações: 
código, nome, endereço, cidade e valor doado. Sabendo que são 50 doadores, depois de cadastrados,
apresente o código e o nome dos doadores que doaram uma quantia acima de 200 reais.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        Scanner ent = new Scanner (System.in);
	  Orfanato a[] = new Orfanato[50];
	  
	  for(int x=0;x<a.length;x++){
	    
	      a[x] = new Orfanato();
	  		System.out.println("Digite o Codigo do doador: \n");
	  		a[x].setCodigo(ent.nextInt());
	  		ent.nextLine();
	  		System.out.println("Digite o nome do doador: \n");
	  		a[x].setNome(ent.nextLine());
	  		System.out.println("Digite o Endereco do doador: \n");
	  		a[x].setEndereco(ent.nextLine());
	  		System.out.println("Digite a Cidade do doador: \n");
	  		a[x].setCidade(ent.nextLine());
	  		System.out.println("Digite o Valor Doado pelo doador: \n");
	  		a[x].setVdoado(ent.nextFloat());
	  		
	  }
	 for(int x=0;x<a.length;x++){
	   
	   if (a[x].getVdoado()>200){
		System.out.println("Codigo: "+a[x].getCodigo()+"\n Nome: "+a[x].getNome()+"\n Valor doado: R$"+a[x].getVdoado());
	   }
	}
}
}
