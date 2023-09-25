package br.com.via.atividades.aplicacao;

import java.util.Scanner;

import br.com.via.atividades.dao.ProdutoDAO;
import br.com.via.atividades.model.Produto;

public class Main {

	public static void main(String[]args) {
		ProdutoDAO produtoDao = new ProdutoDAO();
		Produto produto = new Produto();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome do produto: ");
		String nomeInput = input.nextLine();
		System.out.print("Informe a descrição do produto: ");
		String descricaoInput = input.nextLine();
		
		produto.setNome(nomeInput);
		produto.setDescricao(descricaoInput);
		produtoDao.inserir(produto);
		
		if (input != null) input.close();
	}
	
}
