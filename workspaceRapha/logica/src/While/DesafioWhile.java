package While;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		/* 
		 * 
		 * 
		String email = "rc_peres@mail.com";		
		System.out.println("Original" + email);
		System.out.println("Maio " + email.toUpperCase());
		System.out.println("Minu " + email.toLowerCase());
		System.out.println("Qtde " + email.length());
		System.out.println("@ " + email.contains("@"));
		System.out.println("posicaocarac " + email.indexOf("@"));
		System.out.println("2a5carac " + email.substring(1,6));
		 * 
		 * 
		
		//validar nome e idede
			deveter entre 5 e 20
			idade entre 18 e 8-
			
			o nome deve ter sobrenome
			no final exiba sobrenome
		*/
		
		
		
		String nome = JOptionPane.showInputDialog("Digite o Nome");
		
		
		
		while (nome.length() <=5 || nome.length() >= 20 || nome.contains(" ")==false) {
			nome = JOptionPane.showInputDialog("Inv�lido. Digite o nome e Sobrenome");
						
		}
		
		Short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade").toLowerCase());

		while (idade <= 18 || idade >= 80) {
			idade = Short.parseShort(JOptionPane.showInputDialog("Inv�lido. A idade deve estar entre 18 e 80"));
						
		}
	
		System.out.println("Nome " + nome);
		System.out.println("idade " + idade);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
