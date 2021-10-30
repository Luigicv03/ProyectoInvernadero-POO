package Clases;

public class Orquidea extends ClasePlanta {

	public String TipoOrquidea;
	public String TipoPetalo;
	public String Polinio;
	
	public Orquidea(String Nombre, String Origen, String Color, String TipoOrquidea, String TipoPetalo, String Polinio ) {
		super(Nombre, Origen, Color);
		this.TipoOrquidea = TipoOrquidea;
		this.TipoPetalo = TipoPetalo;
		this.Polinio = Polinio;
		
	}
	public String ObtenerOrquidea(){
		return "Nombre:" + " " + Nombre + "\n" + "Origen:" + " " + Origen +"\n" + "Color:" + " " + Color +"\n" + "Tipo de Orquidea:" + " " + TipoOrquidea +"\n" + "Tipo de Petalo:" + " " + TipoPetalo +"\n" + "Polinio:" + " " + Polinio;
	}
}
