/******************************************************************************

Defina uma classe Aluno com os dados privados para armazenar a matrícula,a nota1 e a nota2.
Inclua os métodos: um para imprimir os dados e um para calcular a media.
Aplicar os métodos para o objeto alu1

*******************************************************************************/

public class Aluno {
    
  private int matricula;
  private int nota1;
  private int nota2;
  
  
  public int getmatricula(){
      
      return matricula;
      
      
  }
    
    public void setmatricula(int matricula){
        this.matricula=matricula;
        
    }
    
    
      public int getnota1(){
      
      
      return nota1;
      
  }
    
    public void setnota1(int nota1){
        
        this.nota1=nota1;
        
    }
    
      public int getnota2(){
      
      return nota2;
      
  }
    
    public void setnota2(int nota2){
        
        this.nota2=nota2;
        
    }
    
    public int media (int matricula, int nota1, int nota2){
        
        int media;
        
        media=(nota1+nota2)/2;
        
        System.out.println("O Aluno(a) da Matricula: "+matricula+"\n Esta com a media: "+media);
        
        return media;
        
    }
}