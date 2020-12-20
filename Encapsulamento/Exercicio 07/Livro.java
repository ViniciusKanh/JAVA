/******************************************************************************

Defina uma classe chamada de Livro, ela deve conter os seguintes atributos: código,
título, ano, editora e preço. Além disso, essa classe deve conter os métodos get e set e 
também um construtor que recebe todos os atributos como parâmetros e um outro construtor padrão. 
Criar dois objetos, cada um com construtores diferentes. Imprima o código e o nome do livro mais caro.

*******************************************************************************/

public class Livro {
    
    private int cod;
    private String livro;
    private int ano;
    private String editora;
    private double preco;
    
    public int getcod() {
        
        return cod;
    }
    
    public void setcod(int cod) {
        
        this.cod=cod;
        
    }
    
        public String getlivro() {
        
        return livro;
    }
    
    public void setlivro(String livro) {
        
        this.livro=livro;
        
    }
    
        public int getano() {
        
        return ano;
    }
    
    public void setano(int ano) {
        
        this.ano=ano;
        
    }
    
        public String geteditora() {
        
        return editora;
    }
    
    public void seteditora( String editora) {
        
        this.editora=editora;
        
    }
    
        public double getpreco() {
        
        return preco;
    }
    
    public void setpreco(double preco) {
        
        this.preco=preco;
        
    }
    
    public Livro(){
        
        
        
    }
    
    public Livro(int cod,String livro,int ano,String editora,double preco){
        
        this.cod=cod;
        this.livro=livro;
        this.ano=ano;
        this.editora=editora;
        this.preco=preco;
    }
    
}