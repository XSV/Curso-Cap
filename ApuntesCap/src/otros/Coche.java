package otros;

public class Coche {
private static int totalInstances=0;
private int numero;
public Coche() {	this.numero=totalInstances;totalInstances++;}
public void fin() {	totalInstances--;try {
	this.finalize();
} catch (Throwable e) {e.printStackTrace();};}
public int getnumero() {return numero;}
public static int getTotalInstances() {return totalInstances;}
}
