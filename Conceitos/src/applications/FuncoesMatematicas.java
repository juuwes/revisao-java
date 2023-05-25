package applications;

public class FuncoesMatematicas {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;

		a = Math.pow(x, y);
		b = Math.sqrt(x);
		c = Math.abs(z);

		System.out.println(x + " elevado a" + y + " = " + a);
		System.out.println("Raiz Quadrada de " + x + " = " + b);
		System.out.println("Valor absoluto de " + z + " = " + c);

	}

}
