package org.cuatrovientos.factura;

/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class Factura {
	private double total;
	private double subtotal;
	
	
	public Factura (double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void ivareducido () {
		total = subtotal + (subtotal * 0.21d);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void iva () {
		total = subtotal + (subtotal * 0.04d);		
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void descuentoespecial () {
		total = subtotal - (subtotal * 0.10d);
	}

}
