package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		List<Produto> listaproduto = new ArrayList<>();

		System.out.print("Quantos produtos deseja inserir: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nProduto: #" + i);
			System.out.print("Seu produto é comum(c) usado(u) importado(i): ");
			char tpProduto = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			if (tpProduto == 'u') {
				System.out.print("Digite a data de fabricação: ");
				Date data = sdf1.parse(sc.next());

				listaproduto.add(new ProdutoUsado(nome, preco, data));

			} else if (tpProduto == 'i') {
				System.out.print("Digite o custo da alfandega: ");
				double precoAlfandega = sc.nextDouble();
				
				listaproduto.add(new ProdutoImportado(nome, preco, precoAlfandega));
			}
			
			else {
				listaproduto.add(new Produto(nome, preco));
			}
		}
		
		for (Produto x: listaproduto) {
			System.out.println("\n"+ x.tabelaPreco());
		}

	}

}
