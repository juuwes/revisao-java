package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
/* não aceita tipos primitivos.
* <> generics - parametrizar a definição de um tipo com outro tipo, ex. lista de inteiros -> Integer.
* List<Integer> list; // declarar lista (inteiros - wrappers class). */

// ArrayList = (+) otimizada.
// ArrayList<> : <String> | versões novas do Java não há necessidade.
		List<String> list = new ArrayList<>(); // instanciação do List (interface), classe que implementa interface - ArrayList.
		
		list.add("Maria"); // adicionar elementos.
		list.add("Bob");
		list.add("Vini");
		list.add("Ju");
		
		list.add(2, "Ana"); // adicionar elementos pela posição.
		
		System.out.println(list.size()); // tamanho da lista.
	
		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("----------------");
		
		list.remove("Anna"); // remove elementos, a partir de comparação dos elementos.
		list.remove(1); // remove por posição do elemento.
		
		//remove elementos com primeiro caracter função lambda (predicado - valor true ou false)
		list.removeIf(nomes -> nomes.charAt(0) == 'M');
		
		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------");
		
		// quando não encontra o elemento retorna: -1
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // encontrar elemento e mostrar sua posição
		
		System.out.println("----------------");
		
/* filtrar a lista com que inicia A : stream() - aceita operações com lambda (java 8)
* filter() - recebe um predicado.
* stream não é compativel com Lista, para converter para lista novamente collect. */
		List<String> result = list.stream().filter(nomes -> nomes.charAt(0)== 'A').collect(Collectors.toList());
		
		for (String nomes : result) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------");
		//encontrar o primeiro elemento que começar com A = findFirst() = (optinal String)
		// se não encontrar retorna nulo.
		String name = list.stream().filter(nomes -> nomes.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
