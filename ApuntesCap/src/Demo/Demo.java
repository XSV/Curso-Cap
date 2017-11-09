package Demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import classes.Estudiante;
import classes.Obrero;

public class Demo {
	public static void main(String[] args) {
		List<Obrero>obreros=new ArrayList<>();
		obreros.addAll(Obrero.CrearObreros(20));
		Collections.sort(obreros,(obrero1,obrero2)->obrero2.getSalario().compareTo(obrero1.getSalario()));
		Collections.sort(obreros,(obrero1,obrero2)->obrero2.getFechaContratacion().compareTo(obrero1.getFechaContratacion()));
		
		//System.out.println(obreros.toString());
		//obreros.stream().forEach(o->System.out.println(o.getNombre()+" "+o.getPrimerApellido()+" "+o.getFechaContratacion()));
		//System.out.println(obreros.toString());<
	
		List<Estudiante> estudiantes;
		estudiantes=new ArrayList<>();
		estudiantes.addAll(Estudiante.CrearEstudiantes(5000));
		
		List<Estudiante> CR;
		CR=estudiantes.stream()
				.filter(e->e.getFacultad()==Estudiante.Facultades.INFORMATICA&&
								e.getFechaMatriculacion().getMonthValue()==9)
				.collect(Collectors.toList());
		Collections.sort(CR);
		for(Estudiante x:CR) {x.pintar(x.datos()+" "+x.fecha(x.getFechaMatriculacion()));}

	}}
