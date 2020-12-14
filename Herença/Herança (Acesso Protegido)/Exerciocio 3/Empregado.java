/******************************************************************************

Crie as classes solicitadas do próximo slide.
 Faça o relacionamento (herança) entre as classes.
 Defina a saída dos dados (printDados() que retorna String) nas classes indicadas.  A classe onde tem a indicação é onde estará a saída – printDados().
 Faça a classe de teste e execute.
 O método valorInss() tem a fórmula (salário * 11%).

*******************************************************************************/

public class Empregado extends Pessoa {
  
  private double salario;
  private String matricula;
  
  public Empregado(){
    
    
  }
  
  
  public double getSalario(){
    return salario;
    
  }
  
  public void setSalario(double salario){
    
    this.salario=salario;
    
  }
  
  public String getMatricula(){
    return matricula;
  }
  public void setMatricula(String matricula){
    this.matricula=matricula;
  }
  
  
  public String valorInss(double salario){
    
    return " O seu Salario com o Percentual do INSS esta no valor de R$ "+(this.salario=this.salario+(this.salario*0.11));
    
  }
}
