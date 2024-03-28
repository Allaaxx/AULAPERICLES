package modules;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produtos implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo_de_barras;
	
	private String nome_do_produto;
	
	private String marca;
	
	private Integer quantidade;
	
	private String data_cadastro;

	
	public Produtos() {

	}


	public Produtos(Integer codigo_de_barras, String nome_do_produto, String marca, Integer quantidade,
			String data_cadastro) {
		super();
		this.codigo_de_barras = codigo_de_barras;
		this.nome_do_produto = nome_do_produto;
		this.marca = marca;
		this.quantidade = quantidade;
		this.data_cadastro = data_cadastro;
	}


	public Integer getCodigo_de_barras() {
		return codigo_de_barras;
	}


	public void setCodigo_de_barras(Integer codigo_de_barras) {
		this.codigo_de_barras = codigo_de_barras;
	}


	public String getNome_do_produto() {
		return nome_do_produto;
	}


	public void setNome_do_produto(String nome_do_produto) {
		this.nome_do_produto = nome_do_produto;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public String getData_cadastro() {
		return data_cadastro;
	}


	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}


	@Override
	public String toString() {
		return "Produtos [codigo_de_barras=" + codigo_de_barras + ", nome_do_produto=" + nome_do_produto + ", marca="
				+ marca + ", quantidade=" + quantidade + ", data_cadastro=" + data_cadastro + "]";
	}
	
	
	
	
}
