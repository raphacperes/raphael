package ListaExercicios;

import javax.swing.JOptionPane;

public class lista1_Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

 * 1. Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
A taxa de servi�os � de: 
�	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
�	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
�	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
Monte uma aplica��o que apresente a conta do cliente.

 * 
 */
		
		
//		String materia = JOptionPane.showInputDialog("Materia");
	
		float diaria = Float.parseFloat(JOptionPane.showInputDialog("diarias"));
		float totalDiaria = 80;
		float taxa = 0;
				
		if ( diaria > 15 ) {

			taxa = (float) 5.50;
			totalDiaria = totalDiaria + taxa ;
			
		} else 	if (diaria < 15 ) {

			taxa = (float) 8.00;
			totalDiaria = totalDiaria + taxa ;
			
			} else  {

				taxa = (float) 6.00;
				totalDiaria = totalDiaria + taxa ;
			
			}							


			System.out.println("Diarias: " + diaria);

			System.out.println("taxa: " + taxa);

			System.out.println("Total: " + totalDiaria);


	}
}