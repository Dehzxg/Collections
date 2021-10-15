package Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoAtiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\t =========================================");
			System.out.println("\n Digite 1 Para adicionar produto ao estoque.");
			System.out.println("\n Digite 2 Para remover produto ao estoque.");
			System.out.println("\n Digite 3 Para atualizar produto ao estoque.");
			System.out.println("\n Digite 4 Para consultar produto ao estoque.");
			System.out.println("\n Digite 0 Para finalizar o programa.");
			System.out.println("\n\t =========================================");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1: 
				
				leia.nextLine(); // para limpeza de execução
				System.out.println("\nDigite o produto que deseja adicionar ao estoque");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				
				leia.nextLine();
				System.out.println("\nDigite o produto em que deseja remover do estoque");
				String produto1 = leia.nextLine();	
				if (estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nO produto não existe no estoque!");
				}
				break;
				
			case 3:
				
				leia.nextLine();
				System.out.println("Digite o produto em que deseja atualizar.");
				String verificacao = leia.nextLine();
				System.out.println("\nDigite o produto que entrará para o estoque: ");
				String novoProd = leia.nextLine();
				if(estoque.contains(verificacao))
				{
					estoque.remove(verificacao);
					estoque.add(novoProd);
				}
				else
				{
					System.out.println("\nProduto não existente no estoque!");
				}
				break;
				
			case 4:
				
				leia.nextLine();
				System.out.println("\nProdutos em estoque: ");
				System.out.println(estoque);
				
				break;
				default:
					
					System.out.println("\nOpção inválida:");			
			} 
			
		}
	while(op!=0);
	}
}