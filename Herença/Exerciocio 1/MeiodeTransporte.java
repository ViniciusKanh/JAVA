/******************************************************************************

Cadastrar um carro e um avião conforme o diagrama de classes abaixo.
Usuário deverá digitar os valores e apresentar os valores cadastrados no final:

*******************************************************************************/

public class MeiodeTransporte {
  private String descricao;
  private int capacidade;
  
  
  public String getdescricao ()
{
          
          return descricao;
  
}  
  
  public void setdescricao ( String descricao){
    
            this.descricao=descricao;
    
  }
  
  
    public int getcapacidade ()
{
          
          return capacidade;
  
}  
  
  public void setcapacidade ( int capacidade){
    
            this.capacidade=capacidade;
    
  }
  
}