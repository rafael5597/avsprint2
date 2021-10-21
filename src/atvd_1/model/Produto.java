package atvd_1.model;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double desconto;
	private String data_inicio;
	private String data_fim;
	
	public Produto(String nome, String descricao, double desconto, String data_inicio, String data_fim) {
		this.nome = nome;
		this.descricao = descricao;
		this.desconto = desconto;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
	}

	public Produto(int id,String nome, String descricao, double desconto, String data_inicio, String data_fim) {
		this.nome = nome;
		this.descricao = descricao;
		this.desconto = desconto;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.id = id;
	}
	
	public Produto(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getData_fim() {
		return data_fim;
	}

	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}
	
}
