package classes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado extends PersonaGenerica {
	public enum Departamentos{RRHH,CONTABILIDAD,FINANZAS};
	private Departamentos departamento;
	private Double salario;
	
	public Departamentos getDepartamento() {	return departamento;}
	public void setDepartamento(Departamentos departamento) {this.departamento = departamento;}
	public Double getSalario() {return salario;}
	public void setSalario(Double salario) {	this.salario = salario;}

	public Empleado(String nombre, String primerApellido, String segundoApellido, Sex sexo, LocalDate nacimiento,String correo,Departamentos departamento, Double salario) {
		super(nombre,primerApellido,segundoApellido,sexo,nacimiento,correo);
		this.departamento = departamento;
		this.salario = salario;
	}
	public Empleado(Departamentos departamento, Double salario) {
		super();
		this.departamento = departamento;
		this.salario = salario;
	}
	public Empleado() {
		super();
		this.departamento = departamento();
		this.salario =numeroDouble(3000);
	}

	public static Departamentos departamento() {int a=numeroInt(1,3);
		if( a==1)return Empleado.Departamentos.CONTABILIDAD;
		if( a==2)return Empleado.Departamentos.FINANZAS;
		return Empleado.Departamentos.RRHH;
		}
	
	public static List<Empleado> CrearEmpleados(int empleadosC) {
		List<Empleado>empleados;
		empleados=new ArrayList<>();
			for(int x=0;x<empleadosC;x++) {empleados.add(new Empleado(departamento(),numeroDouble(3000)));}
return empleados;}
	
	}
