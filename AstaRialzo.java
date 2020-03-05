import java.util.*;
public class AstaRialzo extends Annuncio{

	private double prezzoiniziale;
	private Date datascadenza;
	private double importoultimaofferta;
	private String ultimoofferente;
	
	public AstaRialzo(String descrizione, Date now, double prezzoiniziale, Date datascadenza, double importoultimaofferta, String ultimoofferente) {
		super (descrizione, now);
		this.datascadenza=datascadenza;
		this.importoultimaofferta=importoultimaofferta;
		this.ultimoofferente=ultimoofferente;
		this.prezzoiniziale=prezzoiniziale;
	}
	
	// impostiamo un altro costruttore perch� al momento della creazione dell'oggetto AstaRialzo
	// il valore di importoultimaofferta � necessariamente 0
	// per reimpostare il suo valore si utilizza l'apposito metodo setter
	public AstaRialzo(String descrizione, Date now, double prezzoiniziale, Date datascadenza, String ultimoofferente) {
		super (descrizione, now);
		this.datascadenza=datascadenza;
		this.importoultimaofferta=prezzoiniziale;
		this.ultimoofferente=ultimoofferente;
		this.prezzoiniziale=prezzoiniziale;
	}
	
	//imposto i debiti metodi getter
	public double getprezzoiniziale() {
		return prezzoiniziale;
	}
	public Date getdatascadenza() {
		return datascadenza;
	}
	public double getimportoultimaofferta() {
		return importoultimaofferta;
	}
	public String getultimoorente() {
		return ultimoofferente;
	}
	public void setimportoultimaofferta(double nuovaofferta) {
		importoultimaofferta=nuovaofferta;
	}

}