/******************************************************************************

Cadastrar 10 alimentos com os seguintes atributos: nome, classificacL'aLo e preco. Depois de cadastrado esses alimentos
, o usuaLrio deveraL entrar com uma classificacL'aLo e o programa deveraL apresentar uma listagem desses alimentos escolhidos com o total dos precL'os.
A classificacL'aLo seria: in natura (graLos, frutas, hortalicL'as, leite, carne, etc), processado
(Queijo, paLes, geleias, etc) e ultraprocessado (bolachas, refrigerantes, etc).

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
   Scanner ent = new Scanner (System.in);
   ArrayList<Alimento> a = new ArrayList<Alimento>();
   
   Alimento Aliaux=null;
   int esc=0,opc;
   for(int x=0;x <2 ;x++){

      Aliaux = new Alimento();
      System.out.println("\nDigite o nome do Almento: \n");
      Aliaux.setNome(ent.nextLine());
      System.out.println("\nEscolha a classificacao desse alimento");
      System.out.println("1 - in natura");
      System.out.println("2 - processados");
      System.out.println("3 - ultraprocessados\n");
            if (esc == 1){
      Aliaux.setClassificacao("in natura");
        
      }
            if (esc == 2){
      Aliaux.setClassificacao("processados");
        
      }

            if (esc == 3){
      Aliaux.setClassificacao("ultraprocessados");
        
      }
      ent.nextLine();

    }
System.out.println("\n Digite Umas Das Classificacoes Abaixo para ver os Produtos\n");
      System.out.println("1 - in natura");
      System.out.println("2 - processados");
      System.out.println("3 - ultraprocessados\n");
      opc = ent.nextInt();
      

      
      if (opc ==1 ){
    System.out.println("Listagem dos Alimentos in natura\n");
      
       for(int z=0;z <a.size()  ;z++){
         
     if(Aliaux.getClassificacao()=="in natura"){

      System.out.println("\n Alimento: "+Aliaux.getNome());
              



        }
        
      }
      
       if (opc ==2 ){
    System.out.println("Listagem dos Alimentos processados\n");
      
       for(int z=0;z <a.size()  ;z++){
         
     if(Aliaux.getClassificacao()=="processados"){

      System.out.println("\n Alimento: "+Aliaux.getNome());
              



        }
        
      }
      
       if (opc ==3 ){
    System.out.println("Listagem dos Alimentos ultraprocessados\n");
      
       for(int z=0;z <a.size()  ;z++){
         
     if(Aliaux.getClassificacao()=="ultraprocessados"){

      System.out.println("\n Alimento: "+Aliaux.getNome());
              
        }
        
      }
	}
}

}

}

}
