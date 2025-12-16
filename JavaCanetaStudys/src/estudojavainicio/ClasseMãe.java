package estudojavainicio;



public class ClasseMãe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Caneta 01
		Caneta c1 = new Caneta(null,0,null);
		c1.setModelo( "Fabercastel");
		c1.setPonta(0.5f);
		c1.cor= "preta";
		c1.tampar();		
		//c1.status();
		System.out.println("Modelo: "+c1.getModelo()); // escrevendo o valor de m que é agora o valor de modelo
		System.out.println("Ponta: "+c1.getPonta());
		System.out.println("Cor: "+c1.getCor());
		c1.rabiscar();		
		
		// Caneta 02
		System.out.println("");
		Caneta c2 = new Caneta(null, 0, null);
		c2.setCor("Azul");
		c2.setModelo("Bic cristal");
		c2.setCarga(85);
		//c2.Ponta= 1.0f; como ponta é privado não consigo alterar diretamente 
		c2.setPonta(1.0f); // com o uso do set consigo alterar modelo mesmo sendo privado
		c2.status();
		c2.destampar();
		c2.rabiscar();
		System.out.println("");
		
		Caneta c3 = new Caneta("Azul", 1.0f, "Penttel");
		c3.status();
		c3.rabiscar();
	}

}
