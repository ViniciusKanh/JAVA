/******************************************************************************

Crie uma classe chamada Empresa capaz de armazenar os dados de uma 
empresa (Nome, Endereço, Cidade, Estado, ValorPatrimonial e Quantidade de Funcionários)
. Inclua um construtor sem argumentos e um que receba os dados como argumentos e os inicialize. 
Escreva um método para imprimir os dados, print() que retorna String. Cadastrar 2 objetos, usando um construtor diferente para cada
m. Imprima a empresa que possui o maior valor patrimonial.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Empresa MC= new Empresa ();
    Empresa BK= new Empresa ("Burger King", "Shopping Eldorado","Sao Paulo","SP",55000,100);
    Scanner ent = new Scanner (System.in);
    
    MC.nome=" MC DONALDS";
    MC.endereco="Estrada de Itapecerica 4500";
    MC.cidade ="Sao Paulo";
    MC.UF="SP";
    MC.ValorPatrimonial=50000;
    MC.Qttfuncionario= 100;
    
    
    if ( MC.ValorPatrimonial < BK.ValorPatrimonial){
       
       System.out.println(BK.imprimir()); 
        
    }
    
    else {
        
        System.out.println(MC.imprimir());
        
    }
    
    
}
}