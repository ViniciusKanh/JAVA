/******************************************************************************

Modele e implemente a seguinte classe: Calculadora a. Implementar apenas os operadores básicos (+, - , /, * ).
b. A classe deve ter apenas dois atributos.
c. A classe dever ter um método para cada operador.
d. Seu programa deve apresentar um menu para o usuário digitar a operação desejada.
e. Seu programa só terminará a execução assim que usuário digitar a opção de saída.

*******************************************************************************/

public class Calculadora {
    
    
    private int num1;
    private int num2;

    
    
    public int getnum1(){
        
        return num1;
    }
    
    public void setnum1(int num1){
        
        this.num1=num1;
        
    }
    
        public int getnum2(){
        
        return num2;
    }
    
    public void setnum2(int num2){
        
        this.num2=num2;
        
    }
    



	public int som(int getnum1, int getnum2) {
	  
		return getnum1 + getnum2;
		
	}
	public int sub(int getnum1, int getnum2){
	   
		return getnum1 - getnum2;
		
	}
	public int div(int getnum1, int getnum2){
	    
		return getnum1 / getnum2;
		
	}
	public int mult(int getnum1, int getnum2){
	     
		return getnum1 * getnum2;
		
	}
	
	
    
    
}
