/******************************************************************************

2) Classe Bola: Crie uma classe que modele uma bola: 
tributos: Cor, circunferência, material
Métodos: todos os gets e sets dos atributos

*******************************************************************************/
public class Bola {
    
    private String cor;
    private double circunferencia;
    private String material;
    
    public Bola (String cor, double circunferencia, String matererial){
        
        this.cor=cor;
        this.circunferencia=circunferencia;
        this.material=material;
        
        
    }
    
         public String getcor(){
	     return cor;
	}
	
	public void setcor(String cor){
	    
	    	this.cor=cor;
	    
	}

	public double getcircunferencia(){
		return circunferencia;
	}
	
	public void setcircunferencia(double circunferencia){
	    this.circunferencia=circunferencia;
	    
	}
    
    	public String getmaterial(){
		return material;
	}
	
	public void setmaterial(String material){
	    this.material=material;
	    
	}
    
    
}