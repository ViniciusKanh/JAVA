/******************************************************************************

Cadastrar um Empregado e um Gerente, usando as seguintes classes:
O método CalculaSalario() deve retornar o salário, sendo que o salário do gerente é o salario + gratificação.

*******************************************************************************/
public class Empregado {
  
  private String nome;
  protected double salarioFixo;
  
  public Empregado (){
    
    
  }
  
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome=nome;
  }
  
  public Empregado (String nome, double salarioFixo){
    
    this.nome=nome;
    this.salarioFixo=salarioFixo;
    
  }
  
  public void ImprimeDados(){
    
    System.out.println("\n Nome: "+this.nome+"\n Salario Fixo: R$" +this.salarioFixo);
    
  }
  
  public double CalculaSalario (double salarioFixo){
    
    return salarioFixo;
  }
}