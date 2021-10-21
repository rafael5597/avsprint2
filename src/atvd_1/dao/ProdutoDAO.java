package atvd_1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import atvd_1.model.Produto;
import java.sql.Connection;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Produto produto) throws SQLException {

		String sql = "INSERT INTO produto(nome, descricao, desconto, data_inicio, data_fim) VALUES(?,?,?,?,?)";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setDouble(3, produto.getDesconto());
			pstm.setString(4, produto.getData_inicio());
			pstm.setString(5, produto.getData_fim());

			pstm.execute();

			try (ResultSet rst = pstm.getGeneratedKeys()) {
				while (rst.next()) {
					produto.setId(rst.getInt(1));
				}
			}

		}

	}

	public int atualizar(Produto produto) throws SQLException {
		int affRows = 0;
		String sql = "UPDATE produto SET nome = ?, descricao = ?, desconto = ?, data_inicio = ?, data_fim = ? WHERE id = ?";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {

			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setDouble(3, produto.getDesconto());
			pstm.setString(4, produto.getData_inicio());
			pstm.setString(5, produto.getData_fim());
			pstm.setInt(6, produto.getId());

			affRows = pstm.executeUpdate();

		}
		return affRows;
	}
	
	public int remover(Produto produto) throws SQLException {
		int affRows = 0;
		String sql = "DELETE FROM produto WHERE id = ?";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.setInt(1, produto.getId());
			affRows = pstm.executeUpdate();
		}
		
		return affRows;
	}

}
