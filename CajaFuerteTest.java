package ar.edu.pb2.cajafuerte;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("unused")
public class CajaFuerteTest {	
	
	private CajaFuerte caja;
	
	//preparaci�n (dado / given)
	//ejecuci�n (cuando / when)
	//validaci�n - constataci�n (entonces / then)
	
		@Test
	public void alCrearUnaCajaFuerteEstaAbierta() {
		
		whenCreoUnaCajaFuerte();
		thenLaCajaFuerteEstaAbierta();
		
			}
				
			private CajaFuerte whenCreoUnaCajaFuerte() {
					return caja = new CajaFuerte();
					
			}
		
			private void thenLaCajaFuerteEstaAbierta() {
				Assert.assertTrue(caja.estaAbierta()==true);
				
			}
			
	@Test
	public void alCerrarDeberiaEstarCerrada() {
		Integer codigoApertura = 123;
		CajaFuerte caja = whenCreoUnaCajaFuerte1();
		
		whenCierroLaCajaFuerte(codigoApertura);
		
		thenLaCajaFuerteEstaCerrada();
	}
	
			
	
	@Test
	
	public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaEstarAbierta() {
		//preparacion - given
		Integer codigoApertura = 123;
		CajaFuerte caja = whenCreoUnaCajaFuerte1();
		
		
		//ejecucion		
		whenCierroLaCajaFuerte(codigoApertura);		
		
		//whenAbroLaCajaFuerteConCodigo(codigoApertura);
		whenAbroLaCajaFuerte(codigoApertura);
		
		//validacion
		thenLaCajaFuerteEstaAbierta();
		
	}
	
		private CajaFuerte whenCreoUnaCajaFuerte1() {
			return caja = new CajaFuerte();
	
		}
	
		private void whenCierroLaCajaFuerte(Integer codigoApertura) {
			caja.cerrar(codigoApertura);
		
		}

		private void thenLaCajaFuerteEstaCerrada() {
			Assert.assertTrue(caja.estaAbierta()!=Boolean.TRUE);
		
		}

		private void whenAbroLaCajaFuerte(Integer codigoApertura) {
			caja.abrir(codigoApertura);		
		}		


}//