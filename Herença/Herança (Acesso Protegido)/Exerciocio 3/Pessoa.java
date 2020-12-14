/******************************************************************************

Crie as classes solicitadas do próximo slide.
 Faça o relacionamento (herança) entre as classes.
 Defina a saída dos dados (printDados() que retorna String) nas classes indicadas.  A classe onde tem a indicação é onde estará a saída – printDados().
 Faça a classe de teste e execute.
 O método valorInss() tem a fórmula (salário * 11%).

*******************************************************************************/
public class Pessoa {
  
  private String nome;
  private int idade;
  private String sexo;
  
  public Pessoa(){
    
    
  }
  
  
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome=nome;
  }
  
  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade){
    this.idade=idade;
  }
    public String getSexo(){
    return sexo;
  }
  public void setSexo(String sexo){
    this.sexo=sexo;
  }
  
}
