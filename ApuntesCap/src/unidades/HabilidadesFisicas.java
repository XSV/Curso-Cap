package unidades;
public class HabilidadesFisicas {
	private int fuerza;
	private int destreza;
	private int agilidad;
	private TipoDefensaFisica tDeFisico;
	private TipoDaņoFisico tDaFisico;
	public HabilidadesFisicas(int fuerza, int destreza, int agilidad) {
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.agilidad = agilidad;
		}
	public HabilidadesFisicas() {fuerza=1;destreza=1;agilidad=1;}
	
	public int daņoFisico() {return 0;}
	public int defensaFisica() {return 0;}
	public int rangoAtaque() {return 0;}
}
