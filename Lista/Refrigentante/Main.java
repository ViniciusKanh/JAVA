/*

4) Desenvolva uma classe chamada Refrigerante com as seguintes características:  Atributos da classe:
 nome (tipo texto);
 preco (tipo real);
 qtdEstoque (tipo inteiro);
 Um método construtor que recebe e armazena os atributos nome, preco e qtdEstoque (nesta ordem) quando um objeto da classe Refrigerante é instanciado;
 Um método efetuarVenda que atualiza o estoque do produto após uma venda bem sucedida.
Desenvolva um programa que faça as seguintes operações:
1) Cadastrar refrigerante
2) Consultar o estoque de um refrigerante
3) Efetuar uma venda
4) Listar todos os refrigerantes
5) Excluir refrigerante
6) Sair
Regras do programa:
 Cada venda é feita apenas em um refrigerante;
 Na venda deve-se pedir o refrigerante e a qtde que se deseja comprar;
 Se a qtde de estoque for menor que a quantidade que se deseja comprar, informar uma mensagem de erro.
 A cada venda deve-se atualizar o estoque do refrigerante e apresentar o valor total a ser pago pelo cliente.
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
     Scanner ent = new Scanner (System.in);
	 ArrayList <Refrigerante> a = new ArrayList<Refrigerante>();
     Refrigerante aux = null;


 


	 int opc=1,x,qtt;

System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶");
System.out.println("¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶");
System.out.println("¶¶¶_______________________________________¶¶¶");
System.out.println("¶¶_________________________________________¶¶");
System.out.println("¶¶__¶¶¶¶¶¶¶__¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶_¶¶¶_¶¶");
System.out.println("¶¶__¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶_¶¶¶______¶¶¶_¶¶");
System.out.println("¶¶__¶¶___¶¶¶_¶¶¶_____¶¶¶____¶_¶¶¶¶¶¶¶__¶¶¶_¶¶");
System.out.println("¶¶__¶¶¶¶¶¶¶__¶¶¶¶¶¶__¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶_¶¶¶_¶¶");
System.out.println("¶¶__¶¶_______¶¶¶_____¶¶¶___________¶¶¶_¶¶¶_¶¶");
System.out.println("¶¶__¶¶_______¶¶¶¶¶¶¶_¶¶¶______¶¶¶¶¶¶¶__¶¶¶_¶¶");
System.out.println("¶¶_________________________________________¶¶");
System.out.println("¶¶¶_______________________________________¶¶¶");
System.out.println("¶¶¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶");
System.out.println("¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶1____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶1_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶1_____¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1____¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n\n");

System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
System.out.println("█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█");
System.out.println("█░░║║║╠─║─║─║║║║║╠─░░█");
System.out.println("█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█");
System.out.println("█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█ \n\n");

	 	while(opc!=6){

			  

System.out.println("\n****************************************************\n\n");



		System.out.println("		MAQUINA DE REFRIGERANTE: \n\n");

		System.out.println("		1 - Cadastrar refrigerante\n");

		System.out.println("		2 - Consultar o estoque de um refrigerante\n");

		System.out.println("		3 - Efetuar uma venda\n");

		System.out.println("		4 - Listar todos os refrigerantes\n");

		System.out.println("		5 - Excluir refrigerante\n");

		System.out.println("		6 - Sair\n");


		System.out.println("\n****************************************************\n\n");

		System.out.println("		\nDigite a opção: ");
          opc=ent.nextInt();

		
ent.nextLine();
		switch (opc){

			case 1:
			                    System.out.println("Funcao Escolhida: Cadastrar refrigerante\n\n");
                                aux = new Refrigerante();
				                System.out.println("Digite o Nome do Refrigerante:\n");
                 aux.setNome(ent.nextLine());
				 				System.out.println("Preco do Refrigerante");
                 aux.setValor(ent.nextFloat());
				 				System.out.println("Quantidade em Estoque:\n");
				aux.setQtdEstoque(ent.nextInt());
				                         a.add(aux);				 
				break;

			case 2:
if (a.isEmpty()){

System.out.println("Lista Vazia, Por favor inserir o Refrigerante.\n");

			}else{
			            System.out.println("Funcao Escolhida: Consultar o estoque de um refrigerante\n\n");

            System.out.println("Digite o codigo do Refrigenrante: ");
			x=ent.nextInt();
						System.out.println("Estoque Fisico: \n\n");
							aux = a.get(x);
							System.out.println("Nome: "+aux.getNome()+"\nEstoque: "+aux.getQtdEstoque()+"\n");

                    
			}
					
				break;

			case 3:
if (a.isEmpty()){

System.out.println("Lista Vazia, Por favor inserir o Refrigerante.\n");

			}else{
			            System.out.println("Funcao Escolhida: Consultar o estoque de um refrigerante\n\n");
System.out.println("Codigo do Refrigerante: \n");
x=ent.nextInt();
aux=a.get(x);
System.out.println("Quantidade: \n");
aux.qtt=ent.nextInt();

if(aux.qtt>aux.getQtdEstoque()){
	System.out.println("Estoque Insuficiente: \n");
}else{

	aux.efetuarVenda();

System.out.println("Estoque Atualizado do Refrigerante: "+(aux.getQtdEstoque() - aux.qtt));
	
}


			}
						
				break;

			case 4:
                   
				  	if (a.isEmpty()){

System.out.println("Lista Vazia, Por favor inserir o Refrigerante.\n");

			}else{
			            System.out.println("Funcao Escolhida: Listar os produtos\n\n");

                        System.out.println("Lista de Produtos \n\n");
						for(x=0;x<a.size();x++){
							aux = a.get(x);
							System.out.println("Codigo do Refrigerante: "+x+"\nNome do Refrigenrante: "+aux.getNome()+"\n Valor: R$ "+aux.getValor()+"\n Estoque: "+aux.getQtdEstoque()+"\n");
						}
                
			}
				
				break;

			case 5:

				if (a.isEmpty()){

System.out.println("Lista Vazia, Por favor inserir o Refrigenrante.\n");

			} else {
			System.out.println("Funcao Escolhida: Excluir refrigerante\n\n");

			System.out.println("Digite o codigo do Refrigenrante: ");
			x=ent.nextInt();
			a.remove(x);
			}

				break;
case 6:

System.out.println("Saindo...");

		}	

	}

  
  }
}