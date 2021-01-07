package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String materia = JOptionPane.showInputDialog("Materia");
		float faltas = Float.parseFloat(JOptionPane.showInputDialog("faltas"));

		if (faltas >= 20 ) {

			System.out.println("REPROVADO POR NUMERO DE FALTAS");

		} else {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("nota1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("nota2"));
			float media = (nota1 + nota2) /2;

			if (media >= 6 ) {

				System.out.println("APROVADO");

			} else if (media < 4 ) {

				System.out.println("REPROVADO");

			} else  {

				System.out.println("EXAME");
			}							


			System.out.println("Media: " + media);
			System.out.println("Faltas: " + faltas);



		}

	}
}