import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		int cero = 0;
		Televisor televisor1 = new Televisor();
		Scanner entrada = new Scanner(System.in);
		int llave=entrada.nextInt();
		
		switch(llave)
		{
		case 1: televisor1.setVolumen(cero); break;
		}
	}

}
