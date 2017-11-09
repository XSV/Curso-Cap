package classes;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Estudiante extends PersonaGenerica  implements EstudiantesHelper ,Comparable<Estudiante>{
	public enum Facultades{MATEMATICAS, INFORMATICA, FISICA};
	public enum Sesion{MAÑANA,TARDE,NOCHE};
	private TreeSet<String>lenguajesProgramacion;
	private Integer horasJava;
	private Facultades facultad;
	private LocalDate fechaMatriculacion;
	private LocalDate fechaAltaGym;
	private final LocalTime horaEntradaGym;
	private final LocalTime horaSalidaGym;
		/*
	agregar fecha de alta en el gimnasio
a cada estudiante agregar horario de asistencia
hora de entrada y de salida-- estos valores no pueden ser nulos
que sean imutables
comprobar que la hora de salida sea antes que la de entrada comprobar

al dar de alta , el alta no puede ser mayor a date now

recorrer el listado de estudiantes y obtener un mapa que contenga el nombre y apellidos de cada estudiante

	*/
	
	
	//El siguiente metodo es redundante ,porque ya esta implementado en la interface
	//public List<String> getLenguajesProgramacion() {	return lenguajesProgramacion;}
	public Integer getHorasJava() {return horasJava;}
	public Facultades getFacultad() {	return facultad;}
	public final LocalDate getFechaMatriculacion() {return fechaMatriculacion;}
	
	public void setLenguajesProgramacion(TreeSet<String> lenguajesProgramacion) {this.lenguajesProgramacion = lenguajesProgramacion;}
	public void setHorasJava(Integer horasJava) {this.horasJava = horasJava;}
	public void setFacultad(Facultades facultad) {	this.facultad = facultad;}
	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {this.fechaMatriculacion = fechaMatriculacion;}
	
	
@Override
public Integer getTotalLenguajesDominados() {return lenguajesProgramacion.size();}
@Override
public TreeSet<String> getLenguajesDominados() {return lenguajesProgramacion;}

public Estudiante(String nombre, String primerApellido, String segundoApellido, Sex sexo, LocalDate nacimiento,
		LocalDate fechaMatriculacion,String correo,Facultades facultad,TreeSet<String> lenguajesProgramacion,Integer horasJava
		,LocalDate fechaAltaGym,LocalTime horaEntradaGym,LocalTime horaSalidaGym) throws Exception {
	super(nombre,primerApellido,segundoApellido,sexo,nacimiento,correo);
		this.facultad = facultad;
		this.horasJava=horasJava;
		this.lenguajesProgramacion = lenguajesProgramacion;
		this.fechaMatriculacion=fechaMatriculacion;
		if(LocalDate.now().isBefore(fechaAltaGym)) {throw new Exception("Fecha de Alta Gym Incorrecta");}
		this.fechaAltaGym=fechaAltaGym;
		this.horaEntradaGym=horaEntradaGym;
		if(horaEntradaGym.getSecond()>horaSalidaGym.getSecond()) {throw new Exception("Hora de salida Del Gym Incorrecta");}
		this.horaSalidaGym=horaSalidaGym;
	}
public Estudiante(Facultades facultad,TreeSet<String> lenguajesProgramacion,Integer horasJava,LocalDate fechaMatriculacion
		,LocalDate fechaAltaGym,LocalTime horaEntradaGym,LocalTime horaSalidaGym) throws Exception{
	super();
		this.facultad = facultad;
		this.horasJava=horasJava;
		this.lenguajesProgramacion = lenguajesProgramacion;
		this.fechaMatriculacion=fechaMatriculacion;
		if(LocalDate.now().isBefore(fechaAltaGym)) {throw new Exception("Fecha de Alta Gym Incorrecta");}
		this.fechaAltaGym=fechaAltaGym;
		this.horaEntradaGym=horaEntradaGym;
		if(horaEntradaGym.getSecond()>horaSalidaGym.getSecond()) {throw new Exception("Hora de salida Del Gym Incorrecta");}
		this.horaSalidaGym=horaSalidaGym;
	}
public Estudiante() {
	super();
		this.facultad = facultad();
		this.horasJava=numeroInt(100, 300);
		this.lenguajesProgramacion =lP(); 
		this.fechaMatriculacion=nacimiento();
		this.fechaAltaGym=fecha(this.fechaMatriculacion,LocalDate.now());
		this.horaEntradaGym=hora(0);
		this.horaSalidaGym=hora(this.horaEntradaGym.getSecond());
		
	}
		
	public static Facultades facultad() {int a=numeroInt(0,3);
		if( a==1)return Estudiante.Facultades.FISICA;
		if( a==2)return Estudiante.Facultades.MATEMATICAS;
		return Estudiante.Facultades.INFORMATICA;
		}

	public static TreeSet<String> lP() {
		String[]lenguajes= {"Java","C","C++","Java-Script","C#",".NET","HTML","Visual-Basic","SQL"};
		TreeSet<String> lenguajesSAlida=new TreeSet<String>();
		int x=numeroInt(0,lenguajes.length);
		for(int y=0;y<x;y++)lenguajesSAlida.add(lenguajes[numeroInt(1,lenguajes.length)-1]);
		return lenguajesSAlida;}

	public static List<Estudiante> CrearEstudiantes(int estudiantesC) {
		List<Estudiante>estudiantes;
		estudiantes=new ArrayList<>();
			for(int x=0;x<estudiantesC;x++) {estudiantes.add(new Estudiante());}
		return  estudiantes;}
	@Override
	public int compareTo(Estudiante o) {
		int c1=getPrimerApellido().compareTo(o.getPrimerApellido());
		if(c1!=0)return c1;
		int c2=getSegundoApellido().compareTo(o.getSegundoApellido());
		if(c2!=0)return c2;
		int c3=getNombre().compareTo(o.getNombre());
		return c3;
				
	}
	
	

	
	
	
	
}
