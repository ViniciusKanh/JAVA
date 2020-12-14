/******************************************************************************    
  Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem,
para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base
) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e
um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.
  
*******************************************************************************/
public class Empregado extends Pessoa {
 
 
 protected int codigoSetor;
 private double salarioBase;
 public double Imposto;
 
 public Empregado(){
   
   
 }
 
 public double getSalarioBase(){
   
   return salarioBase;
   
 }
 
 public void setSalarioBase( double salarioBase){
   
   this.salarioBase=salarioBase;
   
 }
 
 public void dados(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double Imposto){
    
    System.out.println("\n Nome: "+this.nome+"\n Endereco: "+getEndereco()+"\n Telefone: "+this.telefone+"\n Codigo do Setor: "+this.codigoSetor+"\n Salario Base R$:"+this.salarioBase+"\n Imposto: "+this.Imposto+"%");
    
  }
 
 public double calcularSalario( double salarioBase, double Imposto){
   
   return salarioBase = salarioBase + (salarioBase * Imposto) / 100; 
   
 }
 
 
 
 
  
}
