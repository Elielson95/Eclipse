package br.ucsal_ArrayList_Caderneta;

//Crie uma lista com os alunos da turma de estrutura de dados. A) liste todos os nomes, b) imprima o tamanho da lista, c) remova o
//5 registro da lista, d) adicione o nome da professora na lista, e) verifique se o seu nome está na lista.


import java.util.ArrayList;
import java.util.List;



public class Lista {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();	
		Professor professor = new Professor();
		List<Aluno> caderneta = new ArrayList<Aluno>();
		professor.setNome("Angela Peixoto Santana");



		System.out.println("Angela Peixoto Santana\n\n");
		//aluno.AlunosLista("Angela Peixoto Santana");
		aluno.AlunosLista();
		System.out.println(aluno.alunosLista);
		System.out.println("Tamano: "+aluno.alunosLista.size());




		System.out.print("\n");
		//remover
		aluno.alunoRemover(4);
		System.out.println(aluno.alunosLista);
		System.out.println("Tamano: "+aluno.alunosLista.size());
		System.out.println("\n");
		System.out.println(aluno.procurar("Fernando"));


		//verificar

	}

}
