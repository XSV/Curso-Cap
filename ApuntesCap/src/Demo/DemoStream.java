package Demo;

import java.util.List;
import java.util.stream.Collectors;

import classes.PersonaGenerica;
import classes.PersonaGenerica.Sex;

public class DemoStream {

	public static void main(String[] args) {
		//serializada como stream
		//no modifica la collection original
		//lista.stream().forEach(e->System.out.println(e));
		List<PersonaGenerica> listadoPersonas;
		listadoPersonas=PersonaGenerica.Crear(10);
		listadoPersonas.stream()
			.filter(p->p.getSexo()==PersonaGenerica.Sex.HOMBRE&&p.getEdad()>18)
			.map(PersonaGenerica::getCorreo)
			.forEach(e->System.out.println(e));
		
		List<String> listadoNombres;
		listadoNombres=
		listadoPersonas.stream()
		.filter(p->p.getSexo()==Sex.HOMBRE&&p.getEdad()>18)
		.map(PersonaGenerica::getNombre).collect(Collectors.toList());
		listadoNombres.stream().forEach(e->System.out.println(e));
		
		Integer totalAge = PersonaGenerica.Crear(50)
			    .stream()
			    .mapToInt(PersonaGenerica::getEdad)
			    .sum();
		System.out.println( totalAge );
			
			Integer totalAgeReduce = PersonaGenerica.Crear(50)
			   .stream()
			   .map(PersonaGenerica::getEdad)
			   .reduce(0,(a, b) -> a + b);
			System.out.println(totalAgeReduce);
			
		//serializada como parallelStream
		//para modificar en paralelo la colleccion, no usar funciones que individualmente modifiquen el flujo
		listadoPersonas.parallelStream();
			
			
	}}
