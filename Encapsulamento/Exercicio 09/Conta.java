/******************************************************************************

Crie uma classe Conta que irá manipular contas de um banco. Siga as especificações que estão no slide seguinte:
 Apresente o seguinte menu : 
 Realizar depósito
 Realizar saque
 Mostrar saldo
 Mostrar informações do titular  Sair  
Exemplo: Caso o usuário escolha a opção de realizar depósito, o mesmo deve digitar o valor que ele quer depositar.

*******************************************************************************/

public class Conta {
    
    private int numconta;
    private String nome;
    private String tconta1;
    private String tconta2;
    private double saldo;
    
    
    public int getnumconta(){
        
        return numconta;
    }
    
    
    public void setnumconta(int numconta){
        
        this.numconta=numconta;
    }
    
        public String getnome(){
        
        return nome;
    }
    
    
    public void setnome(String nome){
        
        this.nome=nome;
    }
    
            public String gettconta1(){
        
        return tconta1;
    }
    
    
    public void settconta1(String tconta1){
        
        this.tconta1=tconta1;
    }
    
    public String gettconta2(){
        
        return tconta2;
    }
    
    
    public void settconta2(String tconta2){
        
        this.tconta2=tconta2;
    }
    
    public double getsaldo(){
        
        return saldo;
    }
    
    public void setsaldo (double saldo){
        
        this.saldo=saldo;
        
    }
    
    
    public void deposito (int valor){
        
        this.saldo+=valor;
        descontatarifa();
    }
   
   public void sacar(int valor){
       
       this.saldo-=valor;
       descontatarifa();
       
   } 
   
   private void descontatarifa (){
       
       this.saldo-=0.1;
       
   }
   
   void mostrasaldo(){
       
       System.out.println(this.saldo);
   }
    
    void mostratitular(String nome, String tconta1, double saldo){
        
    System.out.println("Nome: "+this.nome);
    System.out.println("Tipo de Conta: "+this.tconta1);
    System.out.println("Saldo: R$"+this.saldo);
        
    }
}