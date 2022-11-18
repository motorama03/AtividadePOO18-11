package Com.MateusB.Aula11_11;

import java.util.ArrayList;

public class ArrayListExemplo {

	public static void main(String[] args) {

		ArrayList<String> items = new ArrayList<String>();
		items.add("red");
		items.add(0, "yellow");
		
		
		System.out.print(
				"Display list contents with counter=controlled loop:");
		
		for (int i = 0; i < items.size(); i++)
			System.out.printf(" %s", items.get(i));
				
		display(items, "%nDisplay list contenct with enhaced fpr statement: ");
		items.add("green");
		items.add("yellow");
		display(items, "List with two new elements:");
		items.remove("yellow");
		display(items, "Remove first instance of yellow:");
		items.remove(1);
		display(items, "Remove second list elements (green)");
		
		// verifica se o valor est� na lista
		System.out.printf("\"red\" is %sin the list%n", items.contains("red")? "": "not ");
		
		// Tern�rio
		
		// exibe o numero de elementos na list
		System.out.printf("Size: %s%n", items.size());
	}
	
	public static void display(ArrayList<String> items, String header) {
		
		System.out.printf(header);
		
		// exibe cada elemento em itens
		for (String item : items)
			System.out.printf(" %s", item);
		
		System.out.println();
	}

}
