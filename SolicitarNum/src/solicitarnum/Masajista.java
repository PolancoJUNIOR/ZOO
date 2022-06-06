
package solicitarnum;


public class Masajista extends SeleccionFutbo {

    public Masajista(String Titulacion, int aniosExperiencia) {
        this.Titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
       
    
        private String Titulacion;
	private int aniosExperiencia;

        public Masajista() {
		super();
	}

	// getter y setter

	public void darMasaje() {
	
	}
    
}
