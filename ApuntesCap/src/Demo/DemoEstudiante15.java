package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import classes.Estudiante;

public class DemoEstudiante15 {
	public static void main(String[] args) {
		List<Estudiante>estudiantes;
		estudiantes=new ArrayList();
		estudiantes.addAll(Estudiante.CrearEstudiantes(5));
		
		
		/***********************
		*  1. Recorrer el listado de estudiantes y obtener un mapa que contenga el nombre y los apellidos de cada estudiante con el
		*  total de d�as que han asistido al gimnasio desde su fecha de matriculaci�n.�
		************************/
		Map<String, Double> lJ;
		lJ=new HashMap<>();
		lJ=estudiantes.stream().collect(Collectors.groupingBy(Estudiante::getNComplet,
			     Collectors.averagingLong(Estudiante::getDiasAsistenciaGym)));
			for(Map.Entry<String, Double> entry : lJ.entrySet()) {
			String nombreC=entry.getKey();
			Double dias=entry.getValue();
			System.out.println("Nombre Completo: "+nombreC+"  Dias Asistidos: "+dias);
		}
		
			/********************************
			 * 2. Almacenar en una colecci�n�map los estudiantes agrupados por la sesi�n�(ma�ana, tarde o noche) 
			 *  a la cual asisten al gimnasio.
			 **************************** */
			Map<Estudiante.Sesion,List<Estudiante>>m;
			m=new HashMap<>();
for(Estudiante.Sesion s:Estudiante.Sesion.values())
	m.put(s,estudiantes.stream().filter(e->e.getSesion().contains(s)).collect(Collectors.toList()));
			/*
			m.put(Estudiante.Sesion.MA�ANA,estudiantes.stream().filter(e->e.getSesion().contains(Estudiante.Sesion.MA�ANA))
					.collect(Collectors.toList()));
			
			m.put(Estudiante.Sesion.TARDE,estudiantes.stream().filter(e->e.getSesion().contains(Estudiante.Sesion.TARDE))
					.collect(Collectors.toList()));
			
			m.put(Estudiante.Sesion.NOCHE,estudiantes.stream().filter(e->e.getSesion().contains(Estudiante.Sesion.NOCHE))
					.collect(Collectors.toList()));
			*/
			for(Map.Entry<Estudiante.Sesion, List<Estudiante>> entry : m.entrySet()) {
				System.out.println("Sesion: "+entry.getKey());
				entry.getValue().stream().forEach(e->System.out.println(
						e.getNComplet()+" "+
						e.getSesion()+" "+
						e.getHoraEntradaGym()+" "+
						e.getHoraSalidaGym()));
			}
			
			
			/********************************
			 * 3. Almacenar en una Colecci�n�Map los estudiantes, agrupados por Facultad y por horario de asistencia al gimnasio
			 **************************** */
			
			Map<Estudiante.Sesion,List<Estudiante>>ma;
			ma=new HashMap<>();

			for(Estudiante.Sesion s:Estudiante.Sesion.values())
				ma.put(s,estudiantes.stream().filter(e->e.getSesion().contains(s)).collect(Collectors.toList()));
			
			for(Map.Entry<Estudiante.Sesion, List<Estudiante>> entry : ma.entrySet()) {
				System.out.println("Sesion: "+entry.getKey());
				entry.getValue().stream().forEach(e->System.out.println(
						e.getNComplet()+" "+
						e.getSesion()+" "+
						e.getHoraEntradaGym()+" "+
						e.getHoraSalidaGym()));
			}
			
			
			
			
			
		/****************************
		 * 4. Obtener un mapa con el estudiante que practica mas horas de deporte diariamente por facultad.
		******************************/
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*aplicar para todos los anteriores
		 * 1. En todos los casos, visualizar el contenido de la colecci�n�Map resultante, utilizando la sentencia for Extendida y los m�todos�de la clase Stream, operaciones de agregado y expresiones lambda.
2. Visualizar los estudiantes ordenados por el primer apellido en orden alfab�tico�inverso y por la fecha de matriculaci�n�en el gimnasio en orden cronol�gico�inverso, es decir, que se muestren primero los que se matricularon mas recientemente en el gimnasio.
		 * 
		 * */
		
	}}
