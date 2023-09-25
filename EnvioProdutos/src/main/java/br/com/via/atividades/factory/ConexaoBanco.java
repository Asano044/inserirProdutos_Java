package br.com.via.atividades.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "c17e55bD#";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/exercicios";
	
	public static Connection criarConexao() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conexao = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return conexao;
	}
	
	public static void main(String[]args) throws Exception{
		Connection con = criarConexao();
		
		if (con != null) {
			System.out.println("Conexão criada com sucesso!");
			con.close();
		}
	}
	
}
