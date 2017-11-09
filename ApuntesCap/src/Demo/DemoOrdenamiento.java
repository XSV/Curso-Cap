package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import classes.PersonaGenerica;

public class DemoOrdenamiento {
	static List<String> nombres=new ArrayList<>();
	public static void main(String[] args) {
		for(int x=0;x<10;x++)nombres.add(PersonaGenerica.nombreH());
		Comparator<String>ordenInverso=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {return o2.compareTo(o1);}
	};
Collections.sort(nombres,ordenInverso);
System.out.println(nombres);
	}}
