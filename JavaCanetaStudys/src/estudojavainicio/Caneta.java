package estudojavainicio;

public class Caneta {
	public String modelo;
	public String cor;
	private boolean tampada;
	private int carga;
	private float ponta;
	
	public void status() {
		System.out.println("O modelo da caneta é : "+this.modelo);
		System.out.println("A cor da caneta é : "+this.cor);
		System.out.println("A caneta possui uma carga de : "+this.carga+"%");
		System.out.println("A caneta está tampada ? "+this.tampada);
		System.out.println("A ponta da caneta é : "+this.ponta);
	}
	
	public  Caneta(String c,float p, String m) { // esse é o método construtor
		this.setCor(c);
		this.setPonta(p);
		this.setModelo(m);
		this.tampar();
		
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		this.cor = c;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean t) {
		this.tampada = t;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int car) {
		this.carga = car;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro caneta tampada");
		}else {
			System.out.println("Caneta disponível pra escrever");
		}
		
	}
	
	protected void pintar() {
		
	}
	
}

