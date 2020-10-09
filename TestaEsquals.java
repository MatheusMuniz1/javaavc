package bibliotecas;

public class TestaEsquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;
		
		if (i == j) {
			
			System.out.println("i e j são iguais");
		} else {
			System.out.println("i e j são diferentes");
		}
		
		String c = new String( "Senac 123");
		
		String d = new String(" Senac 123");
		
		if (c == d) {
			System.out.println("c e d são iguais");
		} else {
			System.out.println("c e d são diferentes");
		}
		//equals() e toString() sao os metodos mais
		// importantes do Object
		if (c.equals(d)) {
			System.out.println("As String c e d possuem o mesmo conteudo");
			
			} else {
				System.out.println("As Strings c e d possuem conteudo diferentes");
			}
		
			
		}
		
	}


