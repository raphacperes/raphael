package While;

import javax.swing.JOptionPane;

public class DesafioWhile2 {

	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		int chute = 0;
		int contador = 0;


				do 
				{
					chute = Integer.parseInt(JOptionPane.showInputDialog("Chuta� qual valor ! "));
					contador++;

				if (chute > valor)  {

					JOptionPane.showInputDialog("Chutou alto ! ");


				} else if (chute < valor){ 

					 JOptionPane.showInputDialog("Chutou baixo ! ");
					}
				

				


	} while(chute!=valor);

				System.out.println("At� que enfim " + contador + " tentativas" );
}	
}
		
		
		
		/* 


		 *
		 *
		 *
		 *
		 *
		 *
		 *
		
		short valor1 = Short.parseShort(JOptionPane.showInputDialog("Jogador 1 Digite o valor : "));
		short tent1  = Short.parseShort(JOptionPane.showInputDialog("JOgador 2 - tente adivinhar qual o numero :"));

		do {
			
		} while (valor1 > tent1)  ;
		
		JOptionPane.showInputDialog("Voce errou ! Tente um n�mero menor");
		
		do {
			
		} while (valor1 < tent1) ;
		
		JOptionPane.showInputDialog("Voce errou ! Tente um n�mero maior");
		
		
		do {
			
		} while (valor1 == tent1) ;
		
		JOptionPane.showInputDialog("Parab�ns o n�mero est� correto");
				
	}
}

 */
		


/* 

		//}while (JOptionPane.showConfirmDialog(null, "Deseja Continuar ? ", "Pergu nta", JOptionPane.YES_NO_OPTION)==0);
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
