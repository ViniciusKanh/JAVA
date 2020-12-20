
import java.util.Scanner;

public class Classe
{


double nota1,nota2,media;
int peso1,peso2;

  double calcularMedia (double nota1, double nota2)
  {


   media = (nota1+nota2)/2;
   
    System.out.println("O Valor da Sua Media Aritmetica e: "+media);

    return media;
  }

  double calcularMedia (double nota1, double nota2, int peso1, int peso2)
  {

    
    media = ((nota1*peso1)+(nota2*peso2))/(peso1+peso2);
    
    System.out.println("O Valor da Sua Media Ponderada e: "+media);
    
    return media;




  }


}

