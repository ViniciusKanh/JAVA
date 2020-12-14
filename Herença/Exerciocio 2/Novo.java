/******************************************************************************

Crie a classe Imovel, que possui um endereço e um preço.
 crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
 crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto.
 Crie 2 objetos: um da classe Novo e do outro Velho. Entre com o endereço e o preço de cada um, com o adicional ou o desconto e apresente o valor final de cada um.

*******************************************************************************/
public class Novo extends Imovel{
  
    @Override
  public double getadicionalpreco(){
    
    return getpreco() * 0.50;
    
    
  }
  
  
  
  
  
  
  
  
  
}