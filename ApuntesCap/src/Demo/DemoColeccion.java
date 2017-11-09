package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoColeccion {
		public static void main(String[] args) {
			List<String> nombres;
			SortedSet<String>nombreOrdenadosSinDuplicados;
			List<String> parammetrosRecibidos;
			
		nombres=new ArrayList<>();
		nombreOrdenadosSinDuplicados=new TreeSet<>();
		parammetrosRecibidos=Arrays.asList(args) ;

		nombres.add("Victor");
		nombres.add("Victor");
		nombres.add("JuanJo");
		nombres.add("Javier");
		nombres.add("Andres");
		nombres.add("Maria");

		nombreOrdenadosSinDuplicados.add("Victor");
		nombreOrdenadosSinDuplicados.add("Victor");
		nombreOrdenadosSinDuplicados.add("JuanJo");
		nombreOrdenadosSinDuplicados.add("Javier");
		nombreOrdenadosSinDuplicados.add("Andres");
		nombreOrdenadosSinDuplicados.add("Maria");

		for(String nombre:nombres)System.out.println(nombre);
		for(String nombre:nombreOrdenadosSinDuplicados)System.out.println(nombre);

		System.out.println("¿Esta vavia la lista?"+(parammetrosRecibidos.isEmpty()?"Si esta vacia":"No no esta vacia"));
		if(parammetrosRecibidos.isEmpty()) {
				
		}else if(parammetrosRecibidos.contains("Machado")) {
			System.out.println("La lista Contiene el parametro Machado");
		}else {System.out.println("La cadena Machado no esta en la lista de parametros recibidos");}

		System.out.println("La lista "+(parammetrosRecibidos.contains("Machado")?"SI":"NO")+" Contiene el parametro Machado");
			
		for(String p:parammetrosRecibidos)System.out.println(p);/*
			  Ventajas:		No hace falta conocer el numero de elementos
			 Desventajas:  No puedes eliminar elementos mientras los recorres
		*/
		System.out.println("Pruevas con iterator y eliminar string");
		for(String p:nombres)System.out.println(p);
		Iterator<String> it=nombres.iterator();
		int contador=0;
		while (it.hasNext()) {
			contador++;
			it.next();
			if(contador==3) it.remove();
			}for(String p:nombres)System.out.println(p);
			
		/*
		Ventajas:			No hace falta conocer el numero de elementos
								Si permite eliminar mientras se recorre
		Desventajas:  No puedes eliminar elementos mientras los recorres
		*/
		/*
			Crear lista de nombres
			e eliminar el tercer elemento de la lista
			
			
			*/
	
			
	}}
