/******************************************************************************

Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters),
e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepçao
. Atributos: String nome; String endereço; String telefone;


 Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor
. Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pesso
a, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o forneced
or). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadore
s, um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivid
a. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos método
s implementados na classe Fornecedor e os herdados da classe Pessoa.
 Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem,
para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base
) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e
um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.

*******************************************************************************/

public class Pessoa {
  
  protected String nome;
  private String endereco;
  public String telefone;
  
  public Pessoa() {
    
    
    
  }
  
  public Pessoa ( String nome, String endereco){
    
    this.nome=nome;
    this.endereco=endereco;
  }
  
    public Pessoa ( String nome, String endereco, String telefone){
    
    this.nome=nome;
    this.endereco=endereco;
    this.telefone=telefone;
  }
  
  
    public String getEndereco(){
    return endereco;
  }
  
  public void setEndereco(String endereco){
    
    this.endereco=endereco;
  }
  
  public void dados(String nome, String endereco, String telefone){
    
    System.out.println("\n NOME: "+this.nome+"\n Endereco: "+this.endereco+"\n Telefone: "+this.telefone);
    
  }
  
}

