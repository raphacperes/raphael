package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String produto = JOptionPane.showInputDialog("Produto");
		float qtde = Float.parseFloat(JOptionPane.showInputDialog("qtde"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("valor"));
		float total = (qtde * valor);
		float totalDesc = total;
		
		if (qtde > 20) {
			
			totalDesc = total * (float) 0.88;
			System.out.println("Parabens vc ganhou 20 % de desconto. TOTAL :"  + totalDesc);
					
		} else if (qtde >= 10 && qtde <= 20 ) {
			
			totalDesc = total * (float) 0.9;
			System.out.println("Parabens vc ganhou 10 % de desconto. TOTAL :"  + totalDesc);
		
		} else if (qtde >= 5 && qtde <= 9 ) {
			
			totalDesc = total * (float) 0.95;
			System.out.println("Parabens vc ganhou 5 % de desconto. TOTAL :"  + totalDesc);
							
		} else   {
			
			System.out.println("Leve mais de 5 itens para ganhar descontos. TOTAL :"  + totalDesc);
					
		}
		
		}
	}
