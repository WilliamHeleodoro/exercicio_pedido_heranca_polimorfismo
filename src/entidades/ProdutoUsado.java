package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dtfabricacao;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, double preco, Date dtfabricacao) {
		super(nome, preco);
		this.dtfabricacao = dtfabricacao;
	}

	public Date getDtfabricacao() {
		return dtfabricacao;
	}

	public void setDtfabricacao(Date dtfabricacao) {
		this.dtfabricacao = dtfabricacao;
	}

	@Override
	public String tabelaPreco() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.tabelaPreco());
		sb.append(" (Data de Fabricação: " + sdf1.format(dtfabricacao) + ")");

		return sb.toString();
	}

}
