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

public class Produto {

String descricao;
float preco;
int saldo;

public Produto(){};

public Produto(String descricao, float preco, int saldo){

	this.descricao=descricao;
	this.preco=preco;
	this.saldo=saldo;
}



}