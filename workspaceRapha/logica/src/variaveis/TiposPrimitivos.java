package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * boolean true / false
		 * 
		 * 
		 * 
		 * nota semestral 1
		 * nota semestral 2
		 * falta
		 * disciplina	 
		 * media
		 * 
		 * /*
		 * boolean => dado lógico (true/false) - Boolean
		 * char => 1 caracter - Character
		 * -- para numeros inteiros ---
		 * byte => -127 +128 - Byte
		 * short => -32.??? + 32.??? - Short
		 * int => -2bilhoes + 2bilhoes - Integer
		 * long => ????lhoes   - Long
		 * -- para números reais -- 
		 * float => menos exatidão
		 * double => dobro de precisão nas casas decimais quando comparado ao float
		 */
		
		/* criem as variaveis para:
		 * nota (semestral1)
		 * nota (semestral2)
		 * falta (máximo 200)
		 * disciplina (nome da matéria)
		 * media (calculem) 
		 */

		float semestral1 = Float.parseFloat(JOptionPane.showInputDialog("Semestral 1"));
		float semestral2 = Float.parseFloat(JOptionPane.showInputDialog("Semestral 2"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		String disciplina = JOptionPane.showInputDialog("Disciplina");
		float media = (semestral1+semestral2) /2;
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Faltas: " + faltas);
		System.out.println("Média: " + media);
		// Cast: conversão entre tipos compatíveis
		float semestral3 = (float) 7.45;
		int teste = (int) semestral3;
		short pequena = (short) teste;
		long maior = pequena;

		
		
		 * */
		
		
		String disciplina = JOptionPane.showInputDialog("Digite Disciplina: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("nota1 "));
		double nota2 = Float.parseFloat(JOptionPane.showInputDialog("nota2 "));
		Short falta = Short.parseShort(JOptionPane.showInputDialog("falta "));
		float media = (float) ((nota1 + nota2) / 2);
		
		//double impostoProduto = Double.parseDouble(JOptionPane.showInputDialog("impostoProduto "));
	
		
		System.out.println("disciplina: " + disciplina);
		System.out.println("nota1: " + nota1);
		System.out.println("nota2: " + nota2);
		System.out.println("falta: " + falta);
		System.out.println("media: " + media);
		
		
	}
}
