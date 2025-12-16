package projetobanco;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t.equalsIgnoreCase("cc")) {
			this.setSaldo(50.00f);
		
		}else if(t.equalsIgnoreCase("cp")){
			this.setSaldo(150.00f);
		}
		System.out.println("Conta aberta com sucesso!");
		System.out.println("Novo cliente "+ this.getDono() );
	}
	
	public void fecharConta() {
		if (this.getSaldo()>0) {
			System.out.println("Conta tem dinheiro");
			System.out.println("Saque o dinheiro primeiro o transfira para uma outra conta primeiro");
		}else if(getSaldo()<0){
			System.out.println("Conta em débito\n Favor entrar em contato com o gerente para resolver essa inconsistência");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(getSaldo()+v) ;
			System.out.println("depósito realizado na conta de "+ this.getDono());
		}else  {
			System.out.println("A conta de "+this.getDono()+" está fechada! Impossível depositar em uma conta fechada");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus() && this.getSaldo()>= v) {
			this.setSaldo(getSaldo()- v);
			System.out.println("Saque realizado com sucesso!");
		}else if(this.getStatus() && this.getSaldo()<v) {
			System.out.println("Saldo insuficiente");
		}else {
			System.out.println("Impossível sacar");
		}
	}
	
	public void pagarMensalidade() {
		float va = 0f;
		if (this.getTipo().equals("cc") && this.getSaldo()>= va && this.getStatus()) {
			va = 12.00f;
			this.setSaldo(this.getSaldo()- va);
			
		}else if(this.getTipo().equals("cp") && this.getSaldo()>= va && this.getStatus()) {
			va = 20.00f;
			this.setSaldo(this.getSaldo()- va);		
			
		}else {
			System.out.println("Saldo insuficiente");
			
		}
		
	}
	
	public void armazem() {
	    Object[][] matriz = new Object[10][5];

	    // Preenchendo a matriz com valores de exemplo
	    for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < 5; j++) {
	            if (j % 5 == 0) {
	                matriz[i][j] = getNumConta(); // Valor inteiro
	            } else if (j % 5 == 1) {
	                matriz[i][j] = getDono(); // Caractere
	            } else if (j % 5 == 2) {
	                matriz[i][j] = getSaldo(); // Valor de ponto flutuante
	            } else if (j % 5 == 3) {
	                matriz[i][j] = getTipo(); // Colocando getTipo() na última casa
	            } else {
	                matriz[i][j] = getStatus(); // Valor lógico (booleano)
	            }
	        }
	    }

	    // Exibindo a matriz
	    System.out.println("Matriz 10x5:");
	    for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < 5; j++) {
	            System.out.print(matriz[i][j] + "\t");
	        }
	        System.out.println();
	    }
	}
////////////////////////////////////////////////////////////
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta() {
		this.numConta = 2002300;
		this.numConta +=1;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
/////////////////////////////////////////////////////////////


	public void status() {
		System.out.println("Número da conta: "+this.numConta);
		System.out.println("Tipo da conta: "+this.tipo);
		System.out.println("Dono da conta: "+this.dono);
		System.out.println("Saldo da conta: "+this.saldo+" R$");
		System.out.println("Status da conta: "+this.status);
	}
	
	
}
