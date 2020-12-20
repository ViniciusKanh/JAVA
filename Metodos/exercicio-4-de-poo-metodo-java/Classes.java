import java.util.Scanner;
import java.util.Arrays;


public class Classes
{

  public static void entrada (int[]a, Scanner ler)
  {

    int i;
    for (i = 0; i < a.length; i++)
      {

	a[i] = ler.nextInt ();
      }


  }

  public static void imprime (int[]a)
  {
    int i;
    for (i = 0; i < a.length; i++)
      {

	System.out.println (a[i]);
      }

  }


  public static void substituicao (int[]a)
  {
    int i = 0;
    for (i = 0; i < a.length; i++)
      {

	if (a[i] < 0)
	  {

	    a[i] = 0;

	    System.out.println (a[i]);

	  }
      }




  }

}

******************************************************************************

