

/*

Crie uma classe com as seguintes características:
 Nome da classe: Produto;
 Atributos da classe: descricao (texto); preco (real); saldo (inteiro);
 Deve existir um método construtor que inicia os valores dos atributos descricao, preco e saldo (nesta ordem);
 Apresente o seguinte menu:
1. Inserir produto
2. Listar os produtos
3. Excluir um produto
4. Esvaziar lista
5. Sair
Regras:
 Sealistaestivervazianahoradelistar,excluir,consultarouesvaziar,oprogramadevemostraumamensagem de lista vazia;
 Nalistagem,deve-seapresentartodososatributosinclusivaototaldoprodutoqueéosaldo*preço.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner ent = new Scanner (System.in);
	 ArrayList <Produto> a = new ArrayList<Produto>();

     Produto aux = null;
	 

int opc=1,x;
	 	while(opc!=0){

			  

		System.out.println("\n****************************************************\n\n");




System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
System.out.println("█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█");
System.out.println("█░░║║║╠─║─║─║║║║║╠─░░█");
System.out.println("█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█");
System.out.println("█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█ \n\n");


		System.out.println("		MENU - PARA A TABELA PRODUTO: \n\n");

		System.out.println("		1-Inserir produto\n");

		System.out.println("		2-Listar os produtos\n");

		System.out.println("		3-Excluir um produto\n");

		System.out.println("		4-Esvaziar lista\n");

		System.out.println("		5-Sair\n");

		System.out.println("\n****************************************************\n\n");

		System.out.println("		\nDigite a opção: ");
          opc=ent.nextInt();

		
ent.nextLine();
		switch (opc){

			case 1:

			                    System.out.println("Funcao Escolhida: Inserir produto\n");
                                aux = new Produto();
				                System.out.println("Digite a descricao do Produto");
                 aux.descricao=ent.nextLine();
				 				System.out.println("Digite o Valor do Produto");
                 aux.preco=ent.nextFloat();
				 				System.out.println("Digite o saldo do item");
				aux.saldo=ent.nextInt();
				                         a.add(aux);				 
				break;

			case 2:

						if (a.isEmpty()){

System.out.println("Lista Vazia, Por favor inserir o Produto.\n");

			}else{
			            System.out.println("Funcao Escolhida: Lista de Produtos\n");

                        System.out.println("Lista de Produtos \n\n");
						for(x=0;x<a.size();x++){
							aux = a.get(x);
							System.out.println("Codigo do Produto: "+x+"\nDescricao: "+aux.descricao+"\n Valor: R$ "+aux.preco+"\n Saldo: "+aux.saldo+"\n Total do Produto: "+aux.saldo * aux.preco+"\n");
						}
                
			}
				break;

			case 3:

						if (a.isEmpty()){

System.out.println("Lista Vazia, Por favor inserir o Produto.\n");

			} else {
			System.out.println("Funcao Escolhida: Excluir um produto\n");

			System.out.println("Digite o codigo do item que vc quer excluir: ");
			x=ent.nextInt();
			a.remove(x);
			}
				break;

			case 4:
                   
				   a.clear();
				
				break;

			case 5:

				System.out.println("Saindo...\n");

				break;

		}	

	}

  }
}