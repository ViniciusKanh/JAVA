/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		Pessoa a = new Pessoa("Vinicius",22);
		a.setnome("vinicius");
		a.setidade(22);
		Bola b = new Bola("Vermelha",5,"Borracha");
		b.setcor("Vermelho");
		b.setcircunferencia(5);
		b.setmaterial("Borracha");
		Quadrado c = new Quadrado(4);
		c.setlado(4);
		c.setquadrado(4);
		
		System.out.println(a.getnome());
		System.out.println(a.getidade());
		System.out.println(b.getcor());
		System.out.println(b.getcircunferencia());
		System.out.println(b.getmaterial());
		System.out.println(c.getlado());
		System.out.println(c.getquadrado());
		
		
	}
}
