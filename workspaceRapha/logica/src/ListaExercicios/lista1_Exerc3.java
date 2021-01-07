package ListaExercicios;

import javax.swing.JOptionPane;

public class lista1_Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*

3. Elabore uma aplicação que leia o valor de dois números inteiros e a operação aritmética desejada; 
calcule, então, a resposta adequada. Utilize os símbolos da tabela a seguir para ler qual a operação 
aritmética escolhida. 
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