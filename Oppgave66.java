package oppgave1;
import javax.swing.JOptionPane;
public class Oppgave66 {
	

		public static void main(String[] args) {
			String A = JOptionPane.showInputDialog("skriv in brutt lønn");
			double a = Integer.parseInt ( A );
			
			
			if (a > 934051)
			{
				double verdi1 = ((a-934051) * 0.1452);
				double verdi2 = ((934050-580651) * 0.1152);
				double verdi3 = ((580650-230951) * 0.0241);
				double verdi4 = ((230950-164101)*0.0093);
			System.out.println(verdi1+verdi2+verdi3+verdi4);	
		
			}
			
			if (580651 < a && a< 934050)
			
			{
				double verdi2 = ((934050-580651) * 0.1152);
				double verdi3 = ((580650-230951) * 0.0241);
				double verdi4 = ((230950-164101)*0.0093);
			System.out.println(verdi2+verdi3+verdi4);
			}
			if (230951 < a && a<580650)
			{
				double verdi3 = ((580650-230951) * 0.0241);
				double verdi4 = ((230950-164101)*0.0093);
			System.out.println(verdi3+verdi4);
			}
			if (164101<a && a<230950)
			{
				double verdi4 = ((230950-164101)*0.0093);
				System.out.println(verdi4);
			}
		}

	}


