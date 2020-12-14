/******************************************************************************

Cadastrar um Empregado e um Gerente, usando as seguintes classes:
O método CalculaSalario() deve retornar o salário, sendo que o salário do gerente é o salario + gratificação.

*******************************************************************************/
public class Gerente extends Empregado {
  
  private double gratificacao;
  
  
  public double getGratificacao(){
    return gratificacao;
  }
  public void setGratificacao(double gratificacao){
    this.gratificacao=gratificacao;
  }
  
  public void ImprimeDados(){
    
   System.out.println("\n Nome: "+getNome()+"\n Salario Fixo: R$" +this.salarioFixo);
    
  }
  
  public double CalculaSalario (double salarioFixo, double gratificacao){
    
    System.out.println("Salario mais a gratificacao: R$"+(salarioFixo+gratificacao));
    
    return salarioFixo = salarioFixo + gratificacao;
  }
  
  
}