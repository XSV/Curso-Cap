package classes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Estudiante extends PersonaGenerica  implements EstudiantesHelper ,Comparable<Estudiante>{
	public enum Facultades{MATEMATICAS, INFORMATICA, FISICA};
	private TreeSet<String>lenguajesProgramacion;
	private Integer horasJava;
	private Facultades facultad;
	private LocalDate fechaMatriculacion;
	
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
		LocalDate fechaMatriculacion,String correo,Facultades facultad,TreeSet<String> lenguajesProgramacion,Integer horasJava) {
	super(nombre,primerApellido,segundoApellido,sexo,nacimiento,correo);
		this.facultad = facultad;
		this.horasJava=horasJava;
		this.lenguajesProgramacion = lenguajesProgramacion;
		this.fechaMatriculacion=fechaMatriculacion;
	}
public Estudiante(Facultades facultad,TreeSet<String> lenguajesProgramacion,Integer horasJava,LocalDate fechaMatriculacion) {
	super();
		this.facultad = facultad;
		this.horasJava=horasJava;
		this.lenguajesProgramacion = lenguajesProgramacion;
		this.fechaMatriculacion=fechaMatriculacion;
	}
public Estudiante() {
	super();
		this.facultad = facultad();
		this.horasJava=numeroInt(100, 300);
		this.lenguajesProgramacion =lP(); 
		this.fechaMatriculacion=nacimiento();
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
			for(int x=0;x<estudiantesC;x++) {estudiantes.add(new Estudiante(facultad(), lP(),numeroInt(100, 300),nacimiento()));}
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
