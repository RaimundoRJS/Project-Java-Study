package polimorfismo;

public class VerificandoAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(85.3f);
		m.setIdade(2);
		m.setMenbros(4);
		m.locomover();
		m.alimentar();
		m.setCorPelo("Laranja");
		m.emitirSom();
		
		System.out.println("");
		p.setPeso(0.35f);
		p.setIdade(2);
		p.setMenbros(0);
		p.locomover();
		p.emitirSom();
		p.alimentar();
		
		System.out.println("");
		r.setPeso(0.35f);
		r.setIdade(2);
		r.setMenbros(0);
		r.locomover();
		r.emitirSom();
		r.alimentar();
		
		System.out.println("");
		a.setPeso(0.35f);
		a.setIdade(2);
		a.setMenbros(0);
		a.locomover();
		a.emitirSom();
		a.alimentar();
		System.out.println("");
		
		Cachorro k = new Cachorro();
		k.setCorPelo("branco");
		k.setIdade(6);
		k.enterrarOsso();
		k.emitirSom();
		k.reagir(true);
		k.reagir("Olá");
		k.reagir(12, 5);
		k.reagir(15, 0.30f);
		
		
		System.out.println("");
		Canguru c = new Canguru();
		c.alimentar();
		c.setCorPelo("Marrom");
		c.usarBolsa();
		c.locomover();
		
		
		
	}

}
