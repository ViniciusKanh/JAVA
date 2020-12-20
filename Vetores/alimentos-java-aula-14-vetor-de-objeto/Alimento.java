/******************************************************************************

Cadastrar 10 alimentos com os seguintes atributos: nome, classificação e preco. Depois de cadastrado esses alimentos
, o usuário deverá entrar com uma classificação e o programa deverá apresentar uma listagem desses alimentos escolhidos com o total dos preços.
A classificação seria: in natura (grãos, frutas, hortaliças, leite, carne, etc), processado
(Queijo, pães, geleias, etc) e ultraprocessado (bolachas, refrigerantes, etc).

*******************************************************************************/
public class Alimento 
{
  
  private String nome;
  private String classificacao;
  private double preco;
  
  
  public String getNome(){
    
    return nome;
    
  }
  
  public void setNome(String nome){
    this.nome=nome;
  }
  
  public String getClassificacao(){
    return classificacao;
  }
 public void setClassificacao(String classificacao){
   this.classificacao=classificacao;
 } 
  public double getPreco(){
    return preco;
  }
  public void setPreco(double preco){
    this.preco=preco;
  }
  
  
  
}