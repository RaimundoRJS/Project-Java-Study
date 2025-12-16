package projetofinal;

import java.util.Scanner;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Biblioteca {

	public static void main(String[] args) {
		
		//Scanner ent = new Scanner(System.in);
		//String cad = ent.next();
		//String[] cads = cad.split("/");
		//ystem.out.println(cads[1]);
		
		ArrayList<Usuarios> nomes= new ArrayList<Usuarios>();		
		nomes.add(new Usuarios(123,"Aluno", "Alan lucas"));
		nomes.add(new Usuarios(456,"Técnico Administrativo", "Telma Alves"));
		nomes.add(new Usuarios(789,"Aluno pós graduação", "Ana luiza"));
		nomes.add(new Usuarios(100,"Professor", "Paulo Pereira"));
		
		
		
		for (Usuarios  usuario : nomes) {
			 System.out.println("ID: " + usuario.getCodId());
			    System.out.println("Tipo de Usuário: " + usuario.getTipoUsuario());
			    System.out.println("Nome: " + usuario.getNome());
			    System.out.println("Sigla: " + usuario.getSigla());
			    System.out.println("Tempo de Empréstimo: " + usuario.tempoDeEmprestimo() + " dias");
			    System.out.println("----------------------------------");
			
		}
		
		
		
		
	}

}
