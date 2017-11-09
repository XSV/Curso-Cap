package classes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obrero extends PersonaGenerica  implements Comparable<Obrero> {
	public Obrero(String nombre, String primerApellido, String segundoApellido, Sex sexo, LocalDate nacimiento,String correo,Double	salario,LocalDate fecha) {
		super(nombre,primerApellido,segundoApellido,sexo,nacimiento,correo);
		this.salario=salario;
		this.fechaContratacion=fecha;
	}
	public Obrero(Double	salario,LocalDate fecha) {
		super();
		this.salario=salario;
		this.fechaContratacion=fecha;
	}
	public Obrero() {
		super();
		this.salario=numeroDouble(1500);
		this.fechaContratacion=nacimiento();
	}
	private final Double	salario;
	private final LocalDate fechaContratacion;
	public Double getSalario() {return salario;}
	public LocalDate getFechaContratacion() {return fechaContratacion;}
	
	public static List<Obrero> CrearObreros(int obrerosC) {
		List<Obrero>obreros;
		obreros=new ArrayList<>();
		for(int x=0;x<obrerosC;x++) {obreros.add(new Obrero(numeroDouble(1500),nacimiento()));}
		return  obreros;}
		
	
	@Override
	public int compareTo(Obrero o) {
		int comparacionActual=getPrimerApellido().compareTo(o.getPrimerApellido());
		return (comparacionActual!=0?comparacionActual:getNombre().compareTo(o.getPrimerApellido()));
	}
	public String toString() {return getPrimerApellido()+" "+getNombre();}
}
