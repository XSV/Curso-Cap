package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import classes.Empleado;

public class DemoMapInterface {
	public static void main(String[] args) {// https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
		String[] arg= {"a","a","d","d","a","d","e","e"};
		Map<String,Integer>ms;
		ms=new HashMap<>();
		
		for(String a:arg) {
			Integer freq = ms.get(a);
            ms.put(a, (freq == null) ? 1 : freq + 1);
		}
		for(String k:ms.keySet()) {System.out.println(k);}
		for(Integer k:ms.values()) {System.out.println(k);}
		for(Map.Entry<String, Integer> a :ms.entrySet()) {System.out.println(a);}
		System.out.println(ms.size() + " distinct words:");
        System.out.println(ms);
        
	List<Empleado>empleados=Empleado.CrearEmpleados(20);
	//empleados.forEach(e->System.out.println("Nombre: "+e.getNombre()+" Salario:"+e.getSalario()));
	
	List<String>empl;
	empl=new ArrayList<String>();
	for(int x=0;x<5;x++)empl.add(Empleado.nombreH());
	SortedSet<String>empleOrdenados=empl.stream().collect(Collectors.toCollection(TreeSet::new));
	//empleOrdenados.forEach(e->System.out.println("Nombre: "+e));
	
	
	
	Map<Empleado.Departamentos,List<Empleado>>m;
	m=new HashMap<>();
	m=empleados.stream().collect(Collectors.groupingBy(Empleado::getDepartamento));
	/*
	for(Empleado e:empleados) {
		if(m.get(e.getDepartamento())==null) {
			List<Empleado>es=new ArrayList<Empleado>();
			es.add(e);
			m.put(e.getDepartamento(), es);
		}else {
			List<Empleado>x=m.get(e.getDepartamento());
			x.add(0,e);
		    m.put(e.getDepartamento(), x);
		}
	}
	*/
	for(Empleado.Departamentos dep:m.keySet()) {System.out.print(dep+" ");}
	System.out.println();
	for(List<Empleado> ListEmple:m.values()) {
		for(Empleado es:ListEmple) {
		System.out.println(es.getNombre());
		}}
	
	for(Map.Entry<Empleado.Departamentos,List<Empleado>> entry:m.entrySet()) {
		Empleado.Departamentos key=entry.getKey();
		List<Empleado>value=entry.getValue();
		System.out.println("Departamento: "+key);
		value.stream().forEach(e->System.out.println(e.getNombre()));
		}
	
	for(Empleado.Departamentos dep:m.keySet()) {
		System.out.println("Empleados de: "+dep);
		System.out.println();
		for(Empleado es:m.get(dep)) {
			System.out.println("Departamento: "+dep+"  Dep: "+es.getDepartamento()+" Nombre: "+es.getNombre());}
		System.out.println();
	}

	Map<Empleado.Departamentos, List<String>> nombresDepartamento =
			empleados
			.stream()
		    .collect(Collectors.groupingBy(Empleado::getDepartamento, 
		    		     Collectors.mapping(Empleado::getNombre,Collectors.toList())));
	for(Empleado.Departamentos  dep:nombresDepartamento.keySet()) {
		System.out.println("Empleados de: "+dep);
		nombresDepartamento.get(dep).forEach(e->System.out.println(e));
	}

	nombresDepartamento.entrySet().stream().forEach(e->e.getValue().forEach(z->System.out.println(z)));
	nombresDepartamento.entrySet().stream().forEach(entry ->{
		System.out.println("Departamento: "+entry.getKey());
		entry.getValue().forEach(z->System.out.println(z));});

}}
