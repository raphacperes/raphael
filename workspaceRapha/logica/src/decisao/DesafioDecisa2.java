package decisao;


import javax.swing.JOptionPane;

public class DesafioDecisa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("idade"));
		

			
		if (idade<16) {
			
			System.out.println("Voce possui " + idade +  " anos : NÃO VAI VOTAR" );
					
		}
		
		if (idade>=18 && idade<70)  {

			System.out.println("Voce possui " + idade +  " anos : VOTO OBRIGATÓRIO" );
					
		}
		
		
		if (idade>70 || idade==16 || idade==17 ) {
			
			System.out.println("Voce possui " + idade +  " anos : VOTO FACULTATIVO" );
					
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
