package org.cuatrovientos.factura;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FacturaTest {
	
	
	private Factura target;
	private double subtotal;
	
	@Before
	public void setUp() throws Exception {
		target = new Factura(subtotal);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIvareducido() {
		 
		
	}

	@Test
	public void testIva() {
		;
	}

	@Test
	public void testDescuentoespecial() {
		;
	}

}
