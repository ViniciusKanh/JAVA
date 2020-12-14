/******************************************************************************

Cadastrar um carro e um avião conforme o diagrama de classes abaixo.
Usuário deverá digitar os valores e apresentar os valores cadastrados no final:

*******************************************************************************/
public class Carro extends MeiodeTransporte {
  
  private double quilometragem;
  
  public double getquilometragem(){
    
    return quilometragem;
  }
  
  public void setquilometragem ( double quilometragem){
    
    this.quilometragem=quilometragem;
  }
  
}