/******************************************************************************

Cadastrar 10 alimentos com os seguintes atributos: nome, classificacL'aLo e preco. Depois de cadastrado esses alimentos
, o usuaLrio deveraL entrar com uma classificacL'aLo e o programa deveraL apresentar uma listagem desses alimentos escolhidos com o total dos precL'os.
A classificacL'aLo seria: in natura (graLos, frutas, hortalicL'as, leite, carne, etc), processado
(Queijo, paLes, geleias, etc) e ultraprocessado (bolachas, refrigerantes, etc).

*******************************************************************************/
import java.util.Scanner;
import java.io.IOException;
public class Main
{
  public static void main (String[]args) throws IOException, InterruptedException
  {
    Scanner ent = new Scanner (System.in);
    Alimento Alimentos[] = new Alimento[2];
        int opc,esc=0;
    for(int x=0;x < Alimentos.length  ;x++){

      Alimentos [x] = new Alimento();
      System.out.println("\nDigite o nome do Almento: \n");
      Alimentos[x].setNome(ent.nextLine());
      System.out.println("\nEscolha a classificacao desse alimento");
      System.out.println("1 - in natura");
      System.out.println("2 - processados");
      System.out.println("3 - ultraprocessados\n");
            if (esc == 1){
      Alimentos[x].setClassificacao("in natura");
        
      }
            if (esc == 2){
      Alimentos[x].setClassificacao("processados");
        
      }

            if (esc == 3){
      Alimentos[x].setClassificacao("ultraprocessados");
        
      }
      ent.nextLine();

    }
 if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
      System.out.println("\n Digite Umas Das Classificacoes Abaixo para ver os Produtos\n");
      System.out.println("1 - in natura");
      System.out.println("2 - processados");
      System.out.println("3 - ultraprocessados\n");
      opc = ent.nextInt();
      

      
      if (opc ==1 ){
    System.out.println("Listagem dos Alimentos in natura\n");
      
       for(int x = 0; x<Alimentos.length; x++){
         
     if(Alimentos[x].getClassificacao()=="in natura"){

      System.out.println("\n Alimento: "+Alimentos[x].getNome());
              



        }
        
      }
      
       if (opc ==1 ){
    System.out.println("Listagem dos Alimentos processados\n");
      
       for(int x = 0; x<Alimentos.length; x++){
         
     if(Alimentos[x].getClassificacao()=="processados"){

      System.out.println("\n Alimento: "+Alimentos[x].getNome());
              



        }
        
      }
      
       if (opc ==1 ){
    System.out.println("Listagem dos Alimentos ultraprocessados\n");
      
       for(int x = 0; x<Alimentos.length; x++){
         
     if(Alimentos[x].getClassificacao()=="ultraprocessados"){

      System.out.println("\n Alimento: "+Alimentos[x].getNome());
              



        }
        
      }
      
  }
}

}
