package Clases;

public class Cactus extends ClasePlanta {
	public String Forma;
	public String TipoEspina;
	public String Flor;

	public Cactus(String Nombre, String Origen, String Color, String Forma, String TipoEspina, String Flor) {
		super(Nombre, Origen, Color);
		this.Forma = Forma;
		this.TipoEspina = TipoEspina;
		this.Flor = Flor;
		
	}
	public String ObtenerCactus(){
		return "Nombre:" + " " + Nombre + "\n" + "Origen:" + " " + Origen +"\n" + "Color:" + " " + Color +"\n" + "Forma:" + " " + Forma +"\n" + "Tipo Espina:" + " " + TipoEspina +"\n" + "Flor:" + " " + Flor;
}
}
