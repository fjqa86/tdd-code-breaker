package co.edu.udea.appempresariales.example;

public class CodeBreaker {
	String numeroReal;
	
	public void setNumero(String numero){
		
		this.numeroReal=numero;
	}
	
	
	
	public String comparar( String numeroPrueba){
		String resultado="";
		if(!validarNumero(numeroPrueba))
			return resultado;
		for (int i=0;i<numeroReal.length();i++)
		{
			char x= numeroReal.charAt(i);
			char y = numeroPrueba.charAt(i);
			System.out.println(x+" "+y);
			if(x==y)
			{
				resultado=resultado+"X";
			}
		}
		
		return resultado;
	}
	
	public boolean validarNumero(String numeroPrueba)
	{
		int validar;
		try {
			validar=Integer.parseInt(numeroPrueba);
			return true;
		} catch (Exception e) {
			return false;
		}
		//cambio
	}

}
