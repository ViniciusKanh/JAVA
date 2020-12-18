/******************************************************************************

Crie as classes solicitadas do próximo slide.
 Faça o relacionamento (herança) entre as classes.
 Defina a saída dos dados (printDados() que retorna String) nas classes indicadas.  A classe onde tem a indicação é onde estará a saída – printDados().
 Faça a classe de teste e execute.
 O método valorInss() tem a fórmula (salário * 11%).

*******************************************************************************/
public class Cliente extends Pessoa {
  
  private double valorDivida;
  private int anoNascim;
  
  public Cliente (){
    
    
  }
  
  public int getAnoNascim(){
    return anoNascim;
  }
  public void setAnoNascim( int anoNascim){
    this.anoNascim=anoNascim;
  }
    public double getValorDivida(){
    return valorDivida;
  }
  
  public void setValorDivida(double valorDivida){
    this.valorDivida=valorDivida;
  }
  
  public String printDados (String nome, String sexo, int idade, double valorDivida, int anoNascimo){
    
    System.out.println("Nome:"+getNome()+"\n Sexo: "+getSexo()+" \n Idade: "+getIdade()+" \n Valor da Divida: R$"+getValorDivida()+"\n Ano de Nascimento: "+getAnoNascim()+"\n\n");
   
   return "Nome:"+getNome()+"\n Sexo: "+getSexo()+" \n Idade: "+getIdade()+" \n Valor da Divida: R$"+getValorDivida()+"\n Ano de Nascimento: "+getAnoNascim();
  }
  
}