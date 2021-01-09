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
import java.util.Random;
public class Refrigerante {

private String nome;
private float valor;
private int qtdEstoque;
public int qtt;

Random CUPOM = new Random();


public Refrigerante(){}

public Refrigerante(String nome, float valor, int qtdEstoque){
	this.nome=nome;
	this.valor=valor;
	this.qtdEstoque=qtdEstoque;
    this.qtt=qtt;
}

public String getNome(){
	return nome;
}

public void setNome(String nome){
	this.nome=nome;
}

public float getValor(){
	return valor;
}
public void setValor(float valor){
	this.valor=valor;
}
public int getQtdEstoque(){
	return qtdEstoque;
}

public void setQtdEstoque(int qtdEstoque){
	this.qtdEstoque=qtdEstoque;
}

public void efetuarVenda (){

System.out.println("\nValor Pago: R$"+(this.valor * this.qtt)+"\n");
System.out.println("\nParabens Venda Efetuada com sucesso \n");
System.out.println("\nCUPOM FISCAL: "+CUPOM.nextInt(500)+"\n\nApresente esse numero e retire seu Refrigerante no Balcao\n");

}


	
}