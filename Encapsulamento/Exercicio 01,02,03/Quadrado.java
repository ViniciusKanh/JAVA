/******************************************************************************
3) Classe Quadrado: Crie uma classe que modele um quadrado: 
 Atributos: Tamanho do lado
 Métodos: getLado, setLado e calcular Área;
*******************************************************************************/

public class Quadrado {
    
    private double lado;
    private double quadrado;
    
    
    public Quadrado (double lado){
        
        this.lado=lado;
        this.quadrado=lado*lado;
        
        
        
    }
    
     public double getlado(){
	     return lado;
	}
	
	public void setlado(double lado){
	    
	    	this.lado=lado;
    
}

public double getquadrado(){
    
    return quadrado;
}

public void setquadrado(double lado){
    
    this.quadrado=quadrado;
    
}

}


