package variaveis;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String � um tipo de referencia
		 * 
		 * 
		 * Date = � um tipo de referencia
		 * 
		 * 
		 * String � uma classe, dentro da classe temos m�todos
		 * 
		 * Classe JOPTION PANE contem dicersos metodos
		 * 
		 * tal qual string
		 * 
		 * 
		 * 
		 * System.out.println();
		
		 * 
		 * 
		 * 
		 * 
		 */

		
		String email = "rc_peres@mail.com";		
		System.out.println("Original" + email);
		System.out.println("Maio " + email.toUpperCase());
		System.out.println("Minu " + email.toLowerCase());
		System.out.println("Qtde " + email.length());
		System.out.println("@ " + email.contains("@"));
		System.out.println("posicaocarac " + email.indexOf("@"));
		System.out.println("2a5carac " + email.substring(1,6));
		
		//exibir somente usuario
		
		System.out.println("usuario " + email.substring(0,email.indexOf("@")));
		
		//exibir somente servidor

		System.out.println("servidor " + email.substring(email.indexOf("@")+1));
		
		
		
		
	}

}
