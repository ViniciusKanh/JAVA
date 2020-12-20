/******************************************************************************

Crie um programa que declare uma classe chamada “Funcionário” com estes atributos: idade, anos em serviço e salário;
 Na classe “Funcionário” os atributos devem ser privados e forneça métodos de acesso
público para obter e alterar cada um destes atributos;
 Utilizando a classe “Funcionário” instancie dois funcionários e defina seus atributos 
baseado nas informações obtidas do usuário e que imprima os valores informados.
 Construa um método público que avalie se o funcionário pode ou não se aposentar
, sabendo que para isso ele deve ter mais de 60 anos e tempo de serviço a partir de 35 anos.

*******************************************************************************/

public class Funcionario {
    
    private String nome;
    private int idade;
    private int anos;
    private double salario;
    
    public Funcionario(){
        
        
    }
    
    public String getnome(){
        
        return nome;
    }
    
    public void setnome(String nome){
        
        this.nome=nome;
        
    }
    
    public int getidade(){
        return idade;
        
    }
    
    public void setidade(int idade){
        
        this.idade=idade;
        
    }
    
    
    public int getanos(){
        
        return anos;
        
    }
    
    public void setanos(int anos){
        
        this.anos=anos;
        
    }
    
    public double getsalario(){
        
        return salario;
    }
    
    public void setsalario(double salario){
        
        this.salario=salario;
    }
    
    
    
    
    
    
}