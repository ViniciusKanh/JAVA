public class Classe
{

  float numero, numero2, quadrado;


  float quadrado (float numero)
  {

    quadrado = numero * numero;

    System.out.println ("O Resultado dessa operacao foi: " + quadrado);

    return quadrado;



  }

  float quadrado (float numero, float numero2)
  {

//Math.pow(numero,numero2);
    System.out.println ("O Resultado dessa operacao foi: " +
			Math.pow (numero, numero2));
    return quadrado;

  }
}
