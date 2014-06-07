package co.edu.udea.appempresariales.example;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CodeBreakerTest {
	
	String numero = "3849";
	CodeBreaker code;
	
	@Before
	public void setUp() throws Exception {
		 code = new CodeBreaker();
	}

	@Test
	public void retornarUnaX() {
		String numeroPrueba = "3227";	
		code.setNumero(numero);
		String resultado = code.comparar(numeroPrueba);
		Assert.assertEquals("X", resultado);
	}
	
	@Test
	public void retornarUnaXX() {
		String numeroPrueba = "3827";
		code.setNumero(numero);
		String resultado = code.comparar(numeroPrueba);
		Assert.assertEquals("XX", resultado);
	}
	
	@Test
	public void retornarUnaXXX() {
		String numeroPrueba = "3847";
		code.setNumero(numero);
		String resultado = code.comparar(numeroPrueba);
		Assert.assertEquals("XXX", resultado);
	}
	
	@Test
	public void retornarUnaXXXX() {
		String numeroPrueba = "3849";
		code.setNumero(numero);
		String resultado = code.comparar(numeroPrueba);
		Assert.assertEquals("XXXX", resultado);
	}
	
	public void retornarVacio() {
		String numeroPrueba = "0010";
		code.setNumero(numero);
		String resultado = code.comparar(numeroPrueba);
		Assert.assertEquals("", resultado);
	}
	
	public void retornarVacioPorNumeroNoValido() {
		String numeroPrueba = "0rg0";
		code.setNumero(numero);
		String resultado = code.comparar(numeroPrueba);
		Assert.assertEquals("", resultado);
	}

}
