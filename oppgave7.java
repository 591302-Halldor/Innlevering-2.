package oppgave1;

import static javax.swing.JOptionPane.showInputDialog;

public class oppgave7 {

	public static void main(String[] args) {
		int i=0;
		while ( i< 11)  {	
			String tall = showInputDialog("tall :");
			double a = Integer.parseInt ( tall );
			if (a>0 || a<100) {

				if (90<=a && a<=100)
				{System.out.println("A");}
				if (80<=a && a<=89)
				{System.out.println("B");}
				if (60<=a && a<=79)
				{System.out.println("C");}
				if (50<=a && a<=59)
				{System.out.println("D");}
				if (40<=a && a<=49)
				{System.out.println("E");}
				if (0<=a && a<=39)
				{System.out.println("F");}
				i = i+1;}
			if (a<0 || a>100)	{
				System.out.println("ugyldig poengsum, skriv in en ny");}
				
			
			
		}
	}
}



