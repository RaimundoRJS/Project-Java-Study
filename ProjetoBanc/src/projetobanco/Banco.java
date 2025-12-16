package projetobanco;

import java.util.Scanner;

public class Banco {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco pessoa = new ContaBanco();
		@SuppressWarnings("resource")
		Scanner p_usu = new Scanner(System.in);
		System.out.println("Já possui uma conta ?S/N");
		String recep = p_usu.next();
		// Criação de conta bancária
		if (recep.equalsIgnoreCase("n")) {
			System.out.println("Qual o tipo da conta? CC(Conta Corrente) ou CP(Conta Pouoança)");
			pessoa.setTipo(p_usu.next());
			System.out.println("Por favor informe seu nome Completo");
			pessoa.setDono(p_usu.next());	
			pessoa.abrirConta(pessoa.getTipo());
			pessoa.setNumConta();
			pessoa.armazem();
			pessoa.status();
			
		// debitar na conta 
		}else if(recep.equalsIgnoreCase("s")) {
			System.out.println("Por favor informe o  número da conta");
			String Proc_usu = p_usu.next();//Verificando se o usuário existe 
			if (Proc_usu.equals(pessoa.getNumConta())) {//Verificando número da conta
			System.out.println("Olá, o que deseja?\n Tecle D(para depósito \n Tecle S(para Saque) \n Tecle PM(Pagar a mensalidade)\n Tecle F(Fechar a conta 🥺)");
			String att = p_usu.next();			
			if (att.equalsIgnoreCase("D")) { // Depositando dinheiro na conta
				System.out.println("Qual o valor do depósito?");
				int dp = p_usu.nextInt();
				pessoa.depositar(dp);
			}else if (att.equalsIgnoreCase("S")) { // Processo de saque de dinheiro
				System.out.println("Quanto deseja sacar ?");
				int dp = p_usu.nextInt();
				pessoa.sacar(dp);
			}else if (att.equalsIgnoreCase("PM")) { // pagamento de Mensalidade
				if (pessoa.getTipo().equalsIgnoreCase("CC")) { // verificando tipo de conta 
					System.out.println("Confirma o pagameto de mensalidade no valor de\n R$ 12,00 ?");
					pessoa.pagarMensalidade();
				}else if (pessoa.getTipo().equalsIgnoreCase("CP")) { // Verificando tipo de conta
					System.out.println("Confirma o pagameto de mensalidade no valor de\n R$ 20,00 ?");
					pessoa.pagarMensalidade();
				}else {
					System.out.println("Operação cancelada");
				}
			}else if (att.equalsIgnoreCase("F")) {
				pessoa.fecharConta();
			}
		}else {
			System.out.println("Usuário não encontrado!\n Operação cancelada!");
		}
	}else {
		System.out.println("Operação cancelada!");
	}
		
  }
	
	
}

/*Scanner pegar = new Scanner(System.in);
		ContaBanco pessoa1 = new ContaBanco();
		pessoa1.setNumConta(pegar.nextInt());
		pessoa1.setTipo(pegar.next());
		pessoa1.setDono(pegar.next());
		pessoa1.setSaldo(500.0f);
		pessoa1.setStatus(true);
		pessoa1.sacar(25);		
		pessoa1.status();
		pessoa1.pagarMensalidade();
		System.out.println("Saldo atual pós pagamento de mensalidade "+pessoa1.getSaldo()+"R$");*/