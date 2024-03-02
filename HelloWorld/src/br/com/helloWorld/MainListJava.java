package br.com.helloWorld;

import java.util.ArrayList;
import java.util.List;

public class MainListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Estrutura de dados LIST

		// Declaração da lista

		List<String> listaAlunos = new ArrayList<String>();

		System.out.println("Quantidade de alunos: " + listaAlunos.size());
	}

	{
		// Inserir um novo elemento novo na lista

		listaAlunos.add("Zeka");
		listaAlunos.add("Jão");
		listaAlunos.add("Tio Zé");

		System.out.println("Quantidade de alunos: " + listaAlunos.size());

		// Imorimir Todos os alunos através de um 'for'

		for (int i = 0; i < listaAlunos.size(); i++) {
			System.out.println(listaAlunos.get(i));
		}

		// Imprimir os elementos da lista atraves do "for....of"
		System.out.println("***Impressão com 'for'***");
		for (String aluno : listaAluno) {
			System.out.println(aluno);
		}

		// remover um elemento da lista
		int indexRemocao = listaAlunos.indexOf("Zeca");
		if (indexRemocao >= 0) {

			listaAlunos.remove(indexRemocao);
		}

		System.out.println("Lista de alunos atualizada: ");
		for (String aluno : listaAlunos) {
			System.out.println(aluno);
		}

	}

}
