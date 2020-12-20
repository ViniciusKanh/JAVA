/******************************************************************************

Crie uma classe chamada Empresa capaz de armazenar os dados de uma 
empresa (Nome, Endereço, Cidade, Estado, ValorPatrimonial e Quantidade de Funcionários)
. Inclua um construtor sem argumentos e um que receba os dados como argumentos e os inicialize. 
Escreva um método para imprimir os dados, print() que retorna String. Cadastrar 2 objetos, usando um construtor diferente para cada
m. Imprima a empresa que possui o maior valor patrimonial.

*******************************************************************************/

public class Empresa {
    
    String nome,endereco,cidade,UF;
    double ValorPatrimonial;
    float Qttfuncionario;
    
    
    public Empresa (){
        
        
        
    }
    
    public Empresa ( String nome, String endereco, String cidade, String UF, double ValorPatrimonial,float Qttfuncionario){
        
        this.nome=nome;
        this.endereco=endereco;
        this.cidade=cidade;
        this.UF=UF;
        this.ValorPatrimonial=ValorPatrimonial;
        this.Qttfuncionario=Qttfuncionario;
        
        
        
    }
    
    public String imprimir (){
        
        return "\n Nome:"+nome+"\n Endereco: "+endereco+", "+cidade+", "+UF+" \n Valor Patrimonial: R$ "+ValorPatrimonial+" \n Quantidade de Funcionarios: "+Qttfuncionario;
        
    }
    
    
}