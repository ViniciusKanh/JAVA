/******************************************************************************

Um orfanato deseja cadastrar os doadores voluntários. Para isso deve ter as seguintes informações: 
código, nome, endereço, cidade e valor doado. Sabendo que são 50 doadores, depois de cadastrados,
apresente o código e o nome dos doadores que doaram uma quantia acima de 200 reais.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	        Scanner ent = new Scanner (System.in);
	           ArrayList<Orfanato> a = new ArrayList<Orfanato>();
	           
	           Orfanato Orfaux=null;
	           
	            for(int x=0;x<2;x++){
	    
	      Orfaux = new Orfanato();
	  		System.out.println("Digite o Codigo do doador: \n");
	  		Orfaux.setCodigo(ent.nextInt());
	  		ent.nextLine();
	  		System.out.println("Digite o nome do doador: \n");
	  		Orfaux .setNome(ent.nextLine());
	  		System.out.println("Digite o Endereco do doador: \n");
	  		Orfaux .setEndereco(ent.nextLine());
	  		System.out.println("Digite a Cidade do doador: \n");
	  		Orfaux .setCidade(ent.nextLine());
	  		System.out.println("Digite o Valor Doado pelo doador: \n");
	  		Orfaux .setVdoado(ent.nextFloat());
	  		a.add(Orfaux);
	  }
	 for(int x=0;x<a.size();x++){
	   Orfaux=a.get(x);
	   if (Orfaux .getVdoado()>200){
		System.out.println("Codigo: "+Orfaux .getCodigo()+"\n Nome: "+Orfaux .getNome()+"\n Valor doado: R$"+Orfaux .getVdoado());
	   }
	}
}
}


