/******************************************************************************

Crie as classes solicitadas do próximo slide.
 Faça o relacionamento (herança) entre as classes.
 Defina a saída dos dados (printDados() que retorna String) nas classes indicadas.  A classe onde tem a indicação é onde estará a saída – printDados().
 Faça a classe de teste e execute.
 O método valorInss() tem a fórmula (salário * 11%).

*******************************************************************************/
public class Vendedor extends Empregado {
  
  private double valorVenda;
  private int qttVendas;
  
  public double getValorVenda(){
    return valorVenda;
  }
  public void setValorVenda(double valorVenda){
    this.valorVenda=valorVenda;
  }
  public int getQttVendas(){
    return qttVendas;
  }
  public void setQttVendas(int qttVendas){
    this.qttVendas=this.qttVendas;
  }
  
    public String printDados(){
    
    System.out.println("Nome:"+getNome()+" \n Salario: R$"+ getSalario()+"\n Valor da Venda: R$ "+getValorVenda()+"\n Quantidade da Venda: "+this.qttVendas+"\n\n");
    
    return "Nome:"+getNome()+" \n Salario: R$"+ getSalario()+"\n Valor da Venda: R$ "+getValorVenda()+"\n Quantidade da Venda: "+this.qttVendas; 
    
  }
  
}