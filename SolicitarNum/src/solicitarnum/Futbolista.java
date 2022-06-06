
package solicitarnum;

public class Futbolista  {
    

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
        
        private int dorsal;
	private String demarcacion;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

        public Futbolista() {
		super();
	}

	// getter y setter

	public void jugarPartido() {
		
	}

	public void entrenar() {
		
	}
    
    
}
