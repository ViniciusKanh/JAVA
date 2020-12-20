/******************************************************************************

Crie um programa que declare uma classe chamada “Funcionário” com estes atributos: idade, anos em serviço e salário;
 Na classe “Funcionário” os atributos devem ser privados e forneça métodos de acesso
público para obter e alterar cada um destes atributos;
 Utilizando a classe “Funcionário” instancie dois funcionários e defina seus atributos 
baseado nas informações obtidas do usuário e que imprima os valores informados.
 Construa um método público que avalie se o funcionário pode ou não se aposentar
, sabendo que para isso ele deve ter mais de 60 anos e tempo de serviço a partir de 35 anos.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {

    Funcionario a = new Funcionario();
    a.setnome("Francisco");
    a.setidade(59);
    a.setanos(34);
    a.setsalario(4.500);
    Funcionario b = new Funcionario();
    b.setnome("Joao");
    b.setidade(63);
    b.setanos(39);
    b.setsalario(4.800);
    
    System.out.println("\n Funciorio: "+a.getnome()+"\n Idade: "+a.getidade()+"\n Anos Trabalhado: "+a.getanos()+"\n Salario: "+a.getsalario()+"\n");
    
    System.out.println("#################################");
    
    System.out.println("\n Funciorio: "+b.getnome()+"\n Idade: "+b.getidade()+"\n Anos Trabalhado: "+b.getanos()+"\n Salario: "+b.getsalario()+"\n");
    
    System.out.println("#################################");
    
        
        if(a.getidade() >60 && a.getanos() > 35){
            
            System.out.println("Sr.Francisco pode se aposentar");
            
        }
        
        if(b.getidade() >60 && b.getanos() > 35){
        
        System.out.println("Sr.joao pode se aposentar");
        
        }
        
    
	}
}
