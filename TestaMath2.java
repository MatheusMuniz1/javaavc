package bibliotecas;

public class TestaMath2 {

	public static void main(String[] args) {
		
		System.out.println("Fun��o exp");
		
		int x = 4;
	
		System.out.println(Math.exp(x));
		//Fun��o exp
		
		
		System.out.println("Fun��o Log");
		double t = 5;
		
		System.out.println(Math.log(t));
		//retorna o logaritmo natural(base e) de um n�mero
		
		
		System.out.println("Fun��o Pow");		
		int a = 2;
		int b = 3;
		System.out.println(Math.pow(a, b));
		//Fun��o que utiliza a (base,expoente)
		
		//
		//
		
		System.out.println("Sqrt");
		int p = 9;	
		System.out.println(Math.sqrt(p));
		//Retorna a raiz quadrada
		
	
		
		System.out.println("Fun��o Sin");
		double y = 10;
		System.out.println(Math.sin(y));
		// Retorna um numero seno 
		
		
		System.out.println("Fun��o toDegrees");
		double z = 10;
		System.out.println(Math.toDegrees(z));
		//Convers�o de Radiano para Graus
		
		
		System.out.println("Fun��o to Radians");
		double u = 236;
		System.out.println(Math.toRadians(u));
		//Converte um angulo em graus para radiano
		
	}

}
