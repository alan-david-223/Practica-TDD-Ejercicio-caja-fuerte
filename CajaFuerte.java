package ar.edu.pb2.cajafuerte;

public class CajaFuerte {
	
	private Boolean estadoApertura;
	private Integer codigoApertura;
	
	//Constuctor
	public CajaFuerte() {
		this.estadoApertura =Boolean.TRUE;
		this.codigoApertura = null;
	}

	public boolean estaAbierta() {
		if(estadoApertura.equals(Boolean.TRUE)) 
			return true;
		return false;
	}

	public Boolean cerrar(Integer codigoApertura){
		estadoApertura = Boolean.FALSE;
		this.codigoApertura = codigoApertura;
		return estadoApertura;				
	}

	public Boolean abrir(Integer codigoApertura) {
		if (codigoApertura == this.codigoApertura) {
			this.codigoApertura = null;
			estadoApertura = Boolean.TRUE;			
		}
		return estadoApertura;
	}
	


}