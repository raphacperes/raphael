package ListaExercicios;

import javax.swing.JOptionPane;

public class lista1_Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
4. Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente. 
*/
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Numero"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro Numero"));
		int A = 0;
		int B = 0;
		int C = 0;		
				
		if  (n1 > n2 && n1 > n3) {
		
			A = n1;
					
		} else if (n2 > n3) {
			
					B = n2;
					C = n3;
			}
			
				
		
		if  (n2 > n1 && n2 > n3) {
			
			A = n2;
					
		} else if (n1 > n3) {
						
						B = n1;
						C = n3;
				}		
					

		if  (n3 > n1 && n3 > n2) {
			
			A = n3;
					
		} else if (n1 > n2) {
						
						B = n1;
						C = n3;
				}

		System.out.println("Ordem: " + A + " " + B + " " + C );
		
	}
	
		}		

		