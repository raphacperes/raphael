package While;

import javax.swing.JOptionPane;

public class DesafioDO2 {

	public static void main(String[] args) {
		/* 


		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 */

		do {
			int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
			int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
			JOptionPane.showMessageDialog(null,"Resultado : " + (valor1 + valor2));
		}while (JOptionPane.showConfirmDialog(null, "Deseja Continuar ? ", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
	}
}




/* 


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

} */
