package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DemoEstudiantes {
	
	public static void main(String[] args) {
		List<Estudiante>estudiantes;
		estudiantes=new ArrayList();
		estudiantes.addAll(Estudiante.CrearEstudiantes(30));

/******************************************/
//for(Estudiante e:estudiantes)e.pintar();
 /**************************************** */

/******************
 * Punto Numero 1
 * El total de lenguajes de programacion dominados en la Universidad.
 * ***************** */
SortedSet<String>lenguajesDominados;
lenguajesDominados=new TreeSet<>();
//Utilizando una sentencia for extendida
for(Estudiante e:estudiantes) {lenguajesDominados.addAll(e.getLenguajesDominados());}
//Utilizando una sentencia for extendida
estudiantes.forEach((e)->{lenguajesDominados.addAll(e.getLenguajesDominados());});
//para comprobar visualizamos
/*
lenguajesDominados.stream().forEach(l->System.out.println(l));
System.out.println(lenguajesDominados.size());
*/

/******************
 * Punto Numero 2
 * El estudiante de la facultad de INFORMATICA, del sexo FEMENINO que domina mas lenguajes de programacion.
 * ***************** */
Integer maxLenguajesDominados;
maxLenguajesDominados=estudiantes.stream()
		.filter(e->
				e.getFacultad()==Estudiante.Facultades.INFORMATICA&&
				e.getSexo()==Estudiante.Sex.MUJER)
		.mapToInt(Estudiante::getTotalLenguajesDominados)
		.max()
		.getAsInt();

List<Estudiante> chicasQueControlaMasLenguajesDeProgramacion;
chicasQueControlaMasLenguajesDeProgramacion=estudiantes.stream()
		.filter(e->e.getFacultad()==Estudiante.Facultades.INFORMATICA&&
						e.getSexo()==Estudiante.Sex.MUJER&&
						e.getTotalLenguajesDominados()==maxLenguajesDominados)
		.collect(Collectors.toList());
/*
chicasQueControlaMasLenguajesDeProgramacion.stream()
					.forEach(c->System.out.println(
							c.getNombre().toString()+"  "+
							c.getPrimerApellido().toString()+"  "+
							c.getSegundoApellido().toString()
							));
*/

/******************
 * Punto Numero 3
 * Un listado de los estudiantes que estan por encima de la media en el dominio de los lenguajes de programacion
 * ***************** */
double MediaLenguajesDominados;
MediaLenguajesDominados=estudiantes.stream()
		.mapToInt(Estudiante::getTotalLenguajesDominados).sum();
double Media=MediaLenguajesDominados/estudiantes.size();

List<Estudiante> chicosPorEncimaDeLaMedia;
chicosPorEncimaDeLaMedia=estudiantes.stream()
		.filter(e->e.getTotalLenguajesDominados()>Media)
		.collect(Collectors.toList());
/*
System.out.println(Media);
chicosPorEncimaDeLaMedia.stream()
.forEach(c->System.out.println(
		c.getNombre().toString()+"  "+
		c.getPrimerApellido().toString()+"  "+
		c.getSegundoApellido().toString()+"  "+
		c.getTotalLenguajesDominados()
		));
		*/

/******************
 * Punto Numero 4
 * Agrupacion de alumnos por Facultad
 * ***************** */
Map<Estudiante.Facultades,List<Estudiante>>m;
m=new HashMap<>();
//m= ((Stream<Estudiante>) estudiantes).collect(Collectors.groupingBy(Estudiante::getFacultad));
for(Estudiante e:estudiantes) {
	if(m.get(e.getFacultad())==null) {
		List<Estudiante>es=new ArrayList();
		es.add(e);
		m.put(e.getFacultad(), es);
	}else {
		List<Estudiante>x=m.get(e.getFacultad());
		x.add(0,e);
	    m.put(e.getFacultad(), x);
	}} 
for(Estudiante.Facultades fac:m.keySet()) {
	System.out.println("Alumnos de: "+fac);
	System.out.println();
	for(Estudiante es:m.get(fac)) {
		System.out.println("Facultad: "+fac+
										"  CMP_Facult: "+es.getFacultad()+
										" Nombre: "+es.getNombre()+
										" Horas: "+es.getHorasJava());}
	System.out.println();
}

/******************
 * Punto Numero 1 ejer 12
 * Agrupacion de alumnos por Facultad
 * 1. Crear una colección que implemente la interface Map,
 * Para obtener el total de horas dedicadas al estudio del lenguaje java, por Facultad.
 * ***************** */
Map<Estudiante.Facultades, Double>lJ;
lJ=new HashMap<>();
lJ=estudiantes.stream().collect(Collectors.groupingBy(Estudiante::getFacultad, 
	     Collectors.averagingInt(Estudiante::getHorasJava)));

	//for(Estudiante es:lJ.get(fac)) {System.out.println("Facultad: "+fac+"  CMP_Facult: "+es.getFacultad()+" Nombre: "+es.getNombre());}

/******************
 * Punto Numero 2 ejer 12
 * Recorrer el mapa anterior, con sentencias for, iterador (con while) y operaciones de agregado,
 * mostrando  por cada departamento el numero de horas dedicadas al estudio de Java.
  * ***************** */
for(Estudiante.Facultades fac:lJ.keySet()) {
	System.out.println("Facultad: "+fac+" Horas de java"+lJ.get(fac) );
}



	}}
