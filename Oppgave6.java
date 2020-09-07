package oppgavesett3;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave6 {
	 	
		public static void main(String[] args) {
			int i = 1;
			int b = 1;
			String tall1 = showInputDialog("tall :");
			int a = Integer.parseInt ( tall1 );
		 	
			while (a>=i) {
				b=i*b;
				i=i+1;

		
			
		}
			System.out.println(b);
		}
		

		}
			 
	 

