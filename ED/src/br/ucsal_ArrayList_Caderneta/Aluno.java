package br.ucsal_ArrayList_Caderneta;

import java.util.ArrayList;
import java.util.List;
public class Aluno {
	String nome;
	List<String> alunosLista = new ArrayList<String>();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> AlunosLista(){
		alunosLista.add("Jose");
		alunosLista.add("Duda");
		alunosLista.add("Luis");
		alunosLista.add("Fabia");
		alunosLista.add("Rubem");
		alunosLista.add("Polly");
		alunosLista.add("Misa");
		alunosLista.add("Luana");
		alunosLista.add("Sidney");
		return alunosLista;
	}
	public String alunoRemover(int nome){

		return alunosLista.remove(nome);
	}
	public String procurar(String nome){
		System.out.println("Entrando na busca\n\nParametro para a busca: "+nome+"\n");

		for(String buscar: alunosLista) {
			if(buscar.equals(nome)) {
				System.out.println("Seu nome esta na lista!");

				return null;
			}
		}
		System.out.println("Seu nome não está na lista");
		return null;
	}
}

