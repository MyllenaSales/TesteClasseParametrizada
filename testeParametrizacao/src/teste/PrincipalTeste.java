package teste;

import parametro.Parametrizada;
import java.util.Scanner;
public class PrincipalTeste {

	
	public static void main(String[] args) {
		Parametrizada<Empresa> teste = new Parametrizada<Empresa>();
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Cdastre sua empresa! ");
		System.out.print("Quantas empresas deseja cadastrar?");
		int resposta = input.nextInt();
		input.nextLine();
		Parametrizada <Funcionario> teste2 = new Parametrizada<Funcionario>();
		
		for(int i=0;i<resposta;i++) {
			
			
			System.out.println("Preencha os dados abaixo.");
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("CNPJ: ");
			String cnpj = input.nextLine();
			System.out.print("Telefone: ");
			String telefone = input.nextLine();
			
			Empresa em1 = new Empresa(nome, cnpj, telefone);
			
			teste.adicionar(em1);
		}
		
		
		System.out.print("Quantos funcionarios deseja cadastrar? ");
		int resposta2 = input.nextInt();
		input.nextLine();
		
			for(int i2=0; i2<resposta2;i2++) {
				System.out.println("Preencha os dados abaixo.");
				System.out.print("Nome: ");
				String nome2 = input.nextLine();
				System.out.print("CPF: ");
				String cpf = input.nextLine();
				System.out.print("RG: ");
				String rg = input.nextLine();
				System.out.print("Telefone: ");
				String tel = input.nextLine();
				
				System.out.println("Digite o nome da empresa que ele trabalha: ");
				String nomeEmpresa = input.nextLine();
				Empresa em = teste.procurarObjeto(e -> e.getNome().equalsIgnoreCase(nomeEmpresa));
				
				if(em!= null){
					Funcionario f = new Funcionario(nome2, cpf, rg, tel, em);
					teste2.adicionar(f);
				} else {
					System.out.println("Esse funcionário não pertence a nenhuma empresa!");
				}
			
			}
		teste.listarObjects();
		teste2.listarObjects();
		
		input.close();
	}

}
