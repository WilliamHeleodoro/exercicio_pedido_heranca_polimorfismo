package entidades;

public class ProdutoImportado extends Produto {

	private double precoAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double precoAlfandega) {
		super(nome, preco);
		this.precoAlfandega = precoAlfandega;
	}

	public double getTaxaAlfandega() {
		return precoAlfandega;
	}

	public void setTaxaAlfandega(double precoAlfandega) {
		this.precoAlfandega = precoAlfandega;
	}

	
	public double totalPreco() {
		return preco + precoAlfandega;
	}
	
	
	@Override
	public String tabelaPreco() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" $ " + totalPreco());
		sb.append(" (Taxa de Alfandega: $ " + precoAlfandega + ")");

		return sb.toString();
	}

	
}
