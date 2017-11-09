package unidades;
public class HabilidadesMagicas {
	private int inteligencia;
	private int sabiduria;
	private int carisma;
	private TipoDañoMagico iDaMagico;
	private TipoDefensaMagica tDeMagico;
	public HabilidadesMagicas(int dañoMagico, int inteligencia, int sabiduria, int carisma) {
		this.inteligencia = inteligencia;
		this.sabiduria = sabiduria;
		this.carisma = carisma;
	}
	public HabilidadesMagicas() {inteligencia=1; sabiduria=1;carisma=1;}
	
	public int dañoMagico() {return 0;}
	public int defensaMagica() {return 0;}
	public int rangoMagia() {return 0;}
}
