package bibliotecas;


public class TestaString22 {
	public static void main(String[] args) {
		String a = "Aprendendo muito Java";
		String b[] = a.split("");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	//System.out.println(b[3]);
		
		String c = "aprendendo muito java";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = a.compareTo(c);
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		a.toLowerCase();
		System.out.println(a);
		String d = a.toLowerCase();
		System.out.println(d);
		String e = a.toUpperCase();
		System.out.println(e);
		//Com a vari�vel "a" e o auxilio de outras vari�veis
		//crie exemplos para demonstrar a funcionalidade
		//dos seguintes m�todos de Strinng: 
		//(podem ou n�o ter par�metros
		//charAt(); length(); substring(); indexOf();
		// lastIndexOf();
		// isEmpety(); contains(); replace().
		
		//java.lang.System
		//java.lang.Object
	}
}
