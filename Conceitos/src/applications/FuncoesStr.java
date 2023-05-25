package applications;

public class FuncoesStr {

	public static void main(String[] args) {
		
		//formatar
		String original = "123 ABC abc   ";
		String s0 = original.toUpperCase();
		String s1 = original.toLowerCase();
		String s2 = original.trim();
		
		//recortar
		String s3 = original.substring(3);
		String s4 = original.substring(1, 5);
		
		//substituir
		String s5 = original.replace('1', '5');
		String s6 = original.replace("ABC", "XDE");
		
		//buscar
		int s7 = original.indexOf("bc");
		int s8 = original.lastIndexOf("bc");
		
		//formatar
		System.out.println("Original: " + original);
		System.out.println("UpperCase: " + s0);
		System.out.println("lowerCase: " + s1);
		System.out.println("trim: -" + s2 + "-");
		
		//recortar
		System.out.println("substring: " + s3);
		System.out.println("substring (inicio, fim): " + s4);
		
		//substituir
		System.out.println("replace (char, char): " + s5);
		System.out.println("replace (string, string): " + s6);
		
		//buscar
		System.out.println("indexOf: " + s7);
		System.out.println("lastIndexOf: " + s8);
		
		// operação split : criar um vetor com separador.
		String frase = "potato lemon apple";
		String[] vet = frase.split(" ");
		System.out.println(vet[0]);
	}

}
