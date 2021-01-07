package variaveis;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String materia = JOptionPane.showInputDialog("Materia");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("nota2"));
	
		float media = (nota1 + nota2) /2;
		
		if (media>=6) {
			
			System.out.println("Parabens APROVADO em " + materia +  " com Media: " + media);
					
		}
			
		if (media<4) {
			
			System.out.println("Mandou muito mal em " + materia +  " Refaça o curso pois sua media foi: " + media);
					
		}
		
		if (media>=4) {
			
			System.out.println("Mais esforço em " + materia +  " você foi reprovado com Media: " + media);
					
		}
		
		
			
			
		
		System.out.println("Media: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
