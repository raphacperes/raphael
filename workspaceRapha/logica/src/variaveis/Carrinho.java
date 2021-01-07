package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {
	
	public static void main(String[] args) {
/*		
	String nomeProduto = "Maça";
	String catProduto = "Fruta";
	String valorProduto = "10";
	int quantProduto = 45;
	double impostoProduto = 0.1;
	
	String nome = JOptionPane.showInputDialog("Digite seu nome : ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
	
	*/
	
	String nomeProduto = JOptionPane.showInputDialog("Digite nomeProduto: ");
	String catProduto = JOptionPane.showInputDialog("Digite catProduto : ");
	String valorProduto = JOptionPane.showInputDialog("valorProduto : ");
	int quantProduto = Integer.parseInt(JOptionPane.showInputDialog("quantProduto :"));
	double impostoProduto = Double.parseDouble(JOptionPane.showInputDialog("impostoProduto "));
	
	//exerc
	

	double totalSemimposto = valorProduto * quantProduto ;
			
	double totalComimposto = totalSemimposto + (totalSemimposto * (impostoProduto / 100));

	double impostoTotal = totalSemimposto * (impostoProduto / 100);
	
	double totalComimposto10desconto = (valorProduto + (valorProduto * impostoProduto))*0.01);
	
	
	
	System.out.println("nomeProduto: " + nomeProduto);
	System.out.println("catProduto: " + catProduto);
	System.out.println("valorProduto: " + valorProduto);
	System.out.println("quantProduto: " + quantProduto);
	System.out.println("impostoProduto: " + impostoProduto);
	
	System.out.println("totalComimposto: " + totalComimposto);
	System.out.println("totalSemimposto: " + totalSemimposto);
	System.out.println("impostoTotal: " + impostoTotal);
	System.out.println("totalComimposto10desconto: " + totalComimposto10desconto);
	
}
}