package unidades;
public class Estado {
	private int vidaMax;
	private int manaMax;
	private int vidaActual;
	private int manaActual;
	private int expSiguiente;
	private int expActual;
	private int expAcumulada;
	private int nivel;
	public Estado() {vidaMax = 100;manaMax = 100;vidaActual = 100;manaActual = 100;expSiguiente=100;expActual=0;expAcumulada=0;nivel=0;}
	public Estado(int vidaMax, int manaMax, int vidaActual, int manaActual,int expSiguiente,int expActual,int expAcumulada,int nivel) {
		this.vidaMax = vidaMax;
		this.manaMax = manaMax;
		this.vidaActual = vidaActual;
		this.manaActual = manaActual;
		this.expSiguiente = expSiguiente;
		this.expActual = expActual;
		this.expAcumulada = expAcumulada;
		this.nivel = nivel;
	}
}
