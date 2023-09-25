package br.com.via.atividades.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.via.atividades.factory.ConexaoBanco;
import br.com.via.atividades.model.Produto;

public class ProdutoDAO {

	public void inserir(Produto produto) {
		String consulta = "INSERT INTO produtos (nome, descricao) VALUES (?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.criarConexao();
			pstm = (PreparedStatement) conn.prepareStatement(consulta);
			
			pstm.setString(1,  produto.getNome());
			pstm.setString(2,  produto.getDescricao());
			
			System.out.println("Produto cadastrado com sucesso!");
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (conn != null) conn.close();
				
				if (pstm != null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
