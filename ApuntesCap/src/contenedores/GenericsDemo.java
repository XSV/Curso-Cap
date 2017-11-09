package contenedores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {public void main (String[] args) {
	Almacen<Integer> almacenEnteros;
	Almacen<String> almacenNombres;
	Almacen<List<Person>> almacenPersonas;
	almacenEnteros=new Almacen<>();
	almacenNombres=new Almacen<>();
	almacenPersonas=new Almacen<>();
	
	almacenEnteros.setContenido(1);
	almacenNombres.setContenido("pepe");
	almacenPersonas.setContenido(Person.createRoster());
	
	List<Integer> li=Arrays.asList(1,2,3,4);
	
	
	
	
	
	
}}
