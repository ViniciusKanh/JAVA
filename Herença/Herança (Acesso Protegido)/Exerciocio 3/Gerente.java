/******************************************************************************

Crie as classes solicitadas do próximo slide.
 Faça o relacionamento (herança) entre as classes.
 Defina a saída dos dados (printDados() que retorna String) nas classes indicadas.  A classe onde tem a indicação é onde estará a saída – printDados().
 Faça a classe de teste e execute.
 O método valorInss() tem a fórmula (salário * 11%).

*******************************************************************************/
public class Gerente extends Empregado {
  
  private String nomeGerencia;
  
  public String getNomeGerencia(){
    return nomeGerencia;
  }
  public void setNomeGerencia(String nomeGerencia){
    this.nomeGerencia=nomeGerencia;
  }
  
  
   public String printDados (){
     
     System.out.println("Nome:"+getNome()+" \n Idade: "+getIdade()+" \n Matricula: "+getMatricula()+"\n Nome da Gerencia: " + getNomeGerencia() +"\n Valor do Inss: R$ "+valorInss(getSalario())+"\n\n");
    
    return "Nome:"+getNome()+" \n Idade: "+getIdade()+" \n Matricula: "+getMatricula()+"\n Nome da Gerencia: " + getNomeGerencia() +"\n Valor do Inss: R$ "+valorInss(getSalario());
    
  }
  
}