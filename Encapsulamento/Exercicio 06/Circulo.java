/******************************************************************************

Escreva um programa que apresente a classe Circulo, com atributos raio, area e perimetro e, os métodos calcularArea,
calcularPerimetro e imprimir. Os métodos calcularArea e calcularPerimetro devem efetuar seus respectivos cálculos e
colocar os valores nos atributos area e perimetro. O método imprimir deve mostrar na tela os valores de todos os atributos. 
Salienta-se que a área de um círculo é obtida pela fórmula (pi * raio * raio) e o perímetro por (2 * pi * raio), onde pi = 3,141516.

*******************************************************************************/

public class Circulo {
    
    
    private double raio;
    private double perimetro;
    private double area;
    
    
    
    public double getraio(){
        
        return raio;
        
    }
    
    public void setraio(double raio){
        
        this.raio=raio;
        
        
    }
    
      
    public double getperimetro(){
        
        return perimetro;
        
    }
    
    public void setperimetro(double perimetro){
        
        this.perimetro=perimetro;
        
        
    }
    
      
    public double getarea(){
        
        return area;
        
    }
    
    public void setarea(double area){
        
        this.area=area;
        
        
    }
    
    
    public double calculaarea(double raio){
        
        double pi=3.141516;
        
        area = pi * raio * raio;
        
        System.out.println("O valor da area e: "+area);
        
        return area;
    }
    
    public double calculaperimetro(double raio){
         double pi=3.141516;
         
         perimetro = 2*pi*raio;
         
         System.out.println("O valor do perimetro e: "+perimetro);
        
        return perimetro;
    }
    

    
}