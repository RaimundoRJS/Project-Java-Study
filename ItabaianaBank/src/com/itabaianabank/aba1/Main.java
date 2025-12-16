package com.itabaianabank.aba1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner dados = new Scanner(System.in);
        @SuppressWarnings("resource")
		Scanner autenticacao = new Scanner(System.in);
        ArrayList<Correntista> User = new ArrayList<>();
        ArrayList<CorrentistaFisico> user = new ArrayList<>();
        ArrayList<CorrentistaJuridico> userj = new ArrayList<>();
        //ArrayList<ContaPoupanca> userCp = new ArrayList<>();
        //ArrayList<ContaCorrente> userCc = new ArrayList<>();
        ArrayList<Conta> userC = new ArrayList<>();
        for (Correntista us : User) {
            System.out.println(us + " ");
        }
        System.out.println("Olá deseja iniciar o atendimento? ");
        String verificacao = dados.next();
        switch (verificacao) {
            case "sim":
                while (true) {
                    System.out.println("Olá, escolha uma opção\n"
                            + "1 - Cadastrar correntista    2 - Efetuar Login\n"
                            + "3 - Cadastrar Conta          4 - Debitar Conta\n"
                            + "5 - Creditar Conta           6 - Exibir Saldo das Contas\n"
                            + "7 - Remover Correntista      8 - Sair");
                    String opcao = dados.next();
                    switch (opcao) {
                        case "1": // Cadastro de usuário
                            Correntista novoCorrentista = new Correntista(0, opcao, 0, false, opcao);
                            novoCorrentista.cad_New_User(opcao, dados.nextLong(), opcao);
                            User.add(novoCorrentista);
                            
                            break;
                        case "2": // Login do usuario
                            CorrentistaFisico loginFisico = new CorrentistaFisico(0, opcao, 0, false, opcao);
                            CorrentistaJuridico loginJuridico = new CorrentistaJuridico(0, opcao, 0, false, opcao);
                            String veriUser = autenticacao.next();
                    		String sen = autenticacao.next();

                    		if(veriUser.equals(loginFisico.getCpf()) && sen.equals(loginFisico.getSenha())) {			
                    			loginFisico.login();
                    			user.add(loginFisico);
                    			System.out.println("login efetuado com sucesso!");                    			
                    		}else if (veriUser.equals(loginJuridico.getCnpj()) && sen.equals(loginJuridico.getSenha())){
                    			loginJuridico.login();
                    			userj.add(loginJuridico);
                    			System.out.println("login efetuado com sucesso!");
                    		}else {
                    		System.out.println("Erro ");
                    		}
                    		break;                    	
                        case "3": // Cadastro de Contas 
                            
                        	Correntista cadConta = new Correntista(0, opcao, 0, false, opcao);
                            cadConta.cad_conta();
                            User.add(cadConta);
                            
                            break;
                        case "4":
                        	Correntista debConta = new Correntista(0, opcao, 0, false, opcao);
                            debConta.debito(0);
                            User.add(debConta);
                            break;
                        case "5":
                        	Correntista credConta = new Correntista(0, opcao, 0, false, opcao);
                            credConta.credito(0);
                            User.add(credConta);
                            break;
                        case "6":
                        	Conta exibirSaldoDaConta = new Conta(0, 0, null, null, null, null);
                            exibirSaldoDaConta.getSaldo();
                            userC.add(exibirSaldoDaConta);
                            break;
                        case "7":
                            Correntista excluirCorrentistaFisico = new Correntista(0, opcao, 0, false, opcao);
                            excluirCorrentistaFisico.excluirCorrentista();
                            User.add(excluirCorrentistaFisico);
                            break;
                        case "8":
                            CorrentistaFisico logoutFisico = new CorrentistaFisico(0, opcao, 0, false, opcao);
                            CorrentistaJuridico logoutJuridico = new CorrentistaJuridico(0, null, 0, false, null);
                            logoutJuridico.logout();
                            logoutFisico.logout();
                            user.add(logoutFisico);
                            userj.add(logoutJuridico);
                            break;
                    }
                }
        }
    }
}
