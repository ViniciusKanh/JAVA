/******************************************************************************

1) Construa um programa que possua as seguintes funC'C5es:
a) calcule e retorne o C
ndice de Massa CorpC3rea (IMC) atravC)s da seguinte fC3rmula: IMC= PC/(Alt*Alt);
onde: PC - Peso Corporal em kg e Alt- altura em metros. Usar parC"metros para o peso e a altura.
b) recebe atravC)s de parC"metro o C-ndice de massa corpC3rea e retorne a interpretaC'C#o, conforme a tabela a seguir:

*******************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main
{

  public static void main (String args[])
  {
    Scanner ent = new Scanner (System.in);
    IMC a = new IMC ();

    int peso, altura;

    int ResultadoIMC;
      System.out.println ("Digite o Peso");
      peso = ent.nextInt ();
      System.out.println ("Digite a Altura");
      altura = ent.nextInt ();

      ResultadoIMC = a.CalculoImc (peso, altura);
      System.out.println (ResultadoIMC);

    if (ResultadoIMC <= 20)
        System.out.println ("Magro");

    if (20 < ResultadoIMC && ResultadoIMC <= 24)
        System.out.println ("Normal");

    if (25 < ResultadoIMC && ResultadoIMC <= 29);
      System.out.println ("Acima do peso");

    if (30 < ResultadoIMC && ResultadoIMC <= 34);
      System.out.println ("Obeso");

    if (ResultadoIMC > 34)
        System.out.println ("Muito Obeso");



  }
}
