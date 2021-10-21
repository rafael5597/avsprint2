package atvd_1.model;

import java.sql.Connection;

import atvd_1.dao.ProdutoDAO;
import atvd_1.factory.ConnectionFactory;

public class Promocao {
	private int idPromo;
	private Produto promocao;
	private ProdutoDAO produtoDao;
	private ConnectionFactory connectionFactory;

	public Promocao() {
		connectionFactory = new ConnectionFactory();
	}

	public int cadastraPromo(String nome, String descricao, double desconto, String data_inicio, String data_fim) {
		idPromo = 0;

		try (Connection con = connectionFactory.recuperarConexao()) {

			promocao = new Produto(nome, descricao, desconto, data_inicio, data_fim);
			produtoDao = new ProdutoDAO(con);
			produtoDao.salvar(promocao);
			this.idPromo = promocao.getId();

		} catch (Exception e) {
			System.out.println(e);
		}
		return this.idPromo;
	}

	public int atualizaPromo(int id, String nome, String descricao, double desconto, String data_inicio,
			String data_fim) {

		try (Connection con = connectionFactory.recuperarConexao()) {

			promocao = new Produto(id, nome, descricao, desconto, data_inicio, data_fim);
			produtoDao = new ProdutoDAO(con);
			return produtoDao.atualizar(promocao);

		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	};

	public int removerPromo(int id) {

		try (Connection con = connectionFactory.recuperarConexao()) {

			promocao = new Produto(id);
			produtoDao = new ProdutoDAO(con);
			return produtoDao.remover(promocao);

		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	};
}
