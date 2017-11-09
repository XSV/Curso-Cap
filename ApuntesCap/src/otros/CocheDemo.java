package otros;

public class CocheDemo {

	public static void main(String[] args){
Coche coche1,coche2,coche3,coche4,coche5;
coche1=new Coche();
coche1.fin();
coche2=new Coche();
coche3=new Coche();
coche4=new Coche();
coche5=new Coche();
System.out.println(Coche.getTotalInstances()+" "+coche1.getnumero());
	}

}
