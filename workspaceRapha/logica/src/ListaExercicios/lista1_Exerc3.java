package ListaExercicios;

import javax.swing.JOptionPane;

public class lista1_Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*

3. Elabore uma aplica��o que leia o valor de dois n�meros inteiros e a opera��o aritm�tica desejada; 
calcule, ent�o, a resposta adequada. Utilize os s�mbolos da tabela a seguir para ler qual a opera��o 
aritm�tica escolhida. 
*/
		
		

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Numero"));
		char oper = JOptionPane.showInputDialog("Operacao Desejada : + - / ou * ? ").charAt(0);
		int result=0;


		if  (oper == '+') {
			result = n1 + n2;
		} 
		else if (oper == '-') { 
			result = n1 - n2;
		} 
		else if	( oper == '*') { 
			result = n1 * n2;
		} 
		else if (oper == '/') { 						
			result = n1 / n2;
			
			
			
		}
		

		
		System.out.println("Resultado: " + n1 + " " + oper + " " + n2 +  " = " + result);
		
	}
}