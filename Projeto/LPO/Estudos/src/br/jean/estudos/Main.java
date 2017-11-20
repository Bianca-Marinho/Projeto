package br.jean.estudos;
import java.util.Scanner;

public class Main {
	static Testador testador = new Testador();
	static Desenvolvedor desen = new Desenvolvedor();
	static Analista analista = new Analista();
	static Software soft = new Software();
	static Teste teste = new Teste();
	static Funcionalidade func = new Funcionalidade();
	static String nome;
	static Scanner sc1 = new Scanner(System.in);
	static int codigo = 0, n = 0, t = 0;

	public static void main(String[] args) {			
		System.out.println("#######Funcionalitester#######\n");
		do {				
			switch(n) {
			case 0:
				System.out.println("Digite:\n1) Para se identificar\n2) para se cadastrar\n15) Para encerrar");
				int i = sc1.nextInt();
				if(i == 1) 
					identificacao();				
				else if(i == 2) 
					cadastrarUsuario();	
				else if(i == 15)
					n = 15;
				else
					System.out.println("Opção inválida!");
				break;
			case 1:
				System.out.println("7) Para consultar um teste\n0) Para voltar\n");
				n = sc1.nextInt();
				switch(n) {
				case 7:
					System.out.print("Insira o código do teste: ");
					codigo = sc1.nextInt();
					if(teste.getCodigo().contains(codigo)) {
						t = teste.getCodigo().indexOf(codigo);
						System.out.println("Ocorrência: " + teste.getOcorrencia().get(t));
						System.out.println("Área: " + teste.getArea().get(t));
						System.out.println("Tipo: " + teste.getTipo().get(t));
						System.out.println("Situação: " + teste.getSituacao().get(t));
						System.out.println("Prioridade: " + teste.getPrioridade().get(t));
						System.out.println("Observação: " + teste.getObservacao().get(t));
					}
					else
						System.out.println("Teste não cadastrado.");
					n = 1;
					break;
				}
				break;
			case 2:				
				System.out.println("4) Cadastrar Software\n5) Cadastrar funcionalidade\n6) Excluir Software\n0) Para voltar\n");
				n = sc1.nextInt();
				switch(n) {
				case 4:
					sc1 = new Scanner(System.in);
					System.out.print("Cadastrar Software\n");
					System.out.print("Nome do software: ");
					soft.setNome(sc1.nextLine());
					System.out.print("Data de criação do software: ");
					soft.setDataCriacao(sc1.nextLine());
					System.out.print("Proprietário do software: ");
					soft.setDono(sc1.nextLine());
					System.out.print("Insira membros da equipe do desenvolvimento: ");
					soft.setEquipe(sc1.nextLine());
					System.out.println("Insira o código do software: ");
					soft.setCodigo(sc1.nextInt());
					System.out.println("Software cadastrado com sucesso!");
					n = 2;
					break;
				case 5:
					sc1 = new Scanner(System.in);
					System.out.println("Cadastrar Funcionalidade\n");
					System.out.print("Digite o código do software: ");
					codigo = sc1.nextInt();
					if(soft.getCodigo().contains(codigo)) {						
						func.setCodigo(codigo);
						func.setCodigoSoft(codigo);
						System.out.print("Digite a funcionalidade do software: ");
						func.setFuncao(sc1.nextLine());
						System.out.println("Funcionalidade cadastrada com sucesso!");
					}
					else
						System.out.println("Software não cadastrado para ter funcionalidade.");
					
					n = 2;
					break;
				case 6:
					sc1 = new Scanner(System.in);
					System.out.println("Excluir Software\n");
					System.out.print("Digite o código do software a ser excluído: ");
					codigo = sc1.nextInt();
					if(soft.getCodigo().contains(codigo)){
						t = soft.getCodigo().indexOf(codigo);
						soft.getDono().remove(t);
						soft.getNome().remove(t);
						soft.getDataCriacao().remove(t);
						soft.getEquipe().remove(t);
						if(func.getCodigo().contains(codigo)) {
							func.getCodigo().remove(codigo);
							func.getCodigoSoft().remove(codigo);
							func.getFuncao().remove(func.getCodigo().indexOf(codigo));
						}	
						System.out.println("Software e suas funcionalidades removidos com sucesso!");						
					}
					else
						System.out.println("Software não cadastrado.");
					n = 2;
					break;
				}
				break;
			case 3:
				sc1 = new Scanner(System.in);
				System.out.println("1) Para cadastrar um teste\n2) Para alterar um teste\n4) Para excluir um teste\n0) Para voltar");
				n = sc1.nextInt();
				switch(n) {
				case 1:
					System.out.print("Cadastrar teste\n");
					sc1 = new Scanner(System.in);
					System.out.print("Digite a ocorrência: ");
					teste.setOcorrencia(sc1.nextLine());
					System.out.print("Área da ocorrência: ");
					teste.setArea(sc1.nextLine());
					System.out.print("Tipo da ocorrência: ");
					teste.setTipo(sc1.nextLine());
					System.out.print("Situação da ocorrência: ");
					teste.setSituacao(sc1.nextLine());
					System.out.print("Prioridade do Teste: ");
					teste.setPrioridade(sc1.nextLine());
					System.out.print("Observações: ");
					teste.setObservacao(sc1.nextLine());
					System.out.print("Código do teste: ");
					teste.setCodigo(sc1.nextInt());
					System.out.println("Teste cadastrado com sucesso!");
					n = 3;
					break;
				case 2:
					System.out.print("Digite o código do teste a ser alterado: ");
					codigo = sc1.nextInt();
					if(teste.getCodigo().contains(codigo)) {
						t = teste.getCodigo().indexOf(codigo);
						sc1 = new Scanner(System.in);
						System.out.print("Digite a ocorrência: ");
						teste.getOcorrencia().add(t, sc1.nextLine());;
						System.out.print("Área da ocorrência: ");
						teste.getArea().add(t, sc1.nextLine());;
						System.out.print("Tipo da ocorrência: ");
						teste.getTipo().add(t, sc1.nextLine());;
						System.out.print("Situação da ocorrência: ");
						teste.getSituacao().add(t, sc1.nextLine());;
						System.out.print("Prioridade do Teste: ");
						teste.getPrioridade().add(t, sc1.nextLine());;
						System.out.print("Observações: ");
						teste.getObservacao().add(t, sc1.nextLine());;
						System.out.println("Teste alterado com sucesso! ");
					}
					else
						System.out.println("Teste não cadastrado.");
					n = 3;
					break;
				case 4:
					System.out.print("Digite o código do teste a ser excluído: ");
					codigo = sc1.nextInt();
					if(teste.getCodigo().contains(codigo)) {
						t = teste.getCodigo().indexOf(codigo);
						teste.getArea().remove(t);
						teste.getObservacao().remove(t);
						teste.getOcorrencia().remove(t);
						teste.getPrioridade().remove(t);
						teste.getSituacao().remove(t);
						teste.getTipo().remove(t);
						teste.getCodigo().remove(t);
						System.out.println("Teste removido com sucesso!");
					}
					else
						System.out.println("Teste não cadastrado.");
					n = 3;
					break;
				}
			}									
		}while(n != 15);
					
	}
	static private void identificacao(){
		sc1 = new Scanner(System.in);
		if(desen.getCodigo().isEmpty() && testador.getCodigo().isEmpty() && analista.getCodigo().isEmpty()) {
			System.out.println("Não há cadastro realizado.");
			cadastrarUsuario();
		}
		else{
			System.out.println("Identifique-se\n");
			System.out.println("Código: ");
			codigo = sc1.nextInt();
			if(desen.getCodigo().contains(codigo)) {
				n = 1;
			}
			else if(analista.getCodigo().contains(codigo)){
				n = 2;
			}
			else if(testador.getCodigo().contains(codigo)) {
				n = 3;
			}
			else
				System.out.println("Usuário não cadastrado!");
		}				
	}
	static private void cadastrarUsuario() {
		sc1 = new Scanner(System.in);
		System.out.println("Escolha a função que gostaria se cadastrar: ");
		System.out.println("1) Desenvolvedor\n2) Analista\n3) Testador");
		n = sc1.nextInt();
		switch(n) {
		case 1:
			sc1 = new Scanner(System.in);
			System.out.println("Desenvolvedor\n");
			System.out.print("Nome: ");
			desen.setNome(sc1.nextLine());
			System.out.print("Sobrenome: ");
			desen.setSobrenome(sc1.nextLine());
			System.out.print("Data de Nascimento: ");
			desen.setDataNascimento(sc1.next());
			System.out.print("Código: ");
			desen.setCodigo(sc1.nextInt());
			sc1 = new Scanner(System.in);
			System.out.print("Linguagem que desenvolve: ");
			desen.setLinguagem(sc1.nextLine());
			System.out.print("Desenvolvedor cadastrado com sucesso!");
			break;
		case 2:
			sc1 = new Scanner(System.in);
			System.out.println("Analista\n");
			System.out.println("Nome: ");
			analista.setNome(sc1.nextLine());
			System.out.println("Sobrenome: ");
			analista.setSobrenome(sc1.nextLine());
			System.out.println("Data de Nascimento: ");
			analista.setDataNascimento(sc1.next());
			System.out.println("Código: ");
			analista.setCodigo(sc1.nextInt());
			System.out.println("Analista cadastrado com sucesso!");
			break;
		case 3:
			sc1 = new Scanner(System.in);
			System.out.println("Testador\n");
			System.out.println("Nome: ");
			testador.setNome(sc1.nextLine());
			System.out.println("Sobrenome: ");
			testador.setSobrenome(sc1.nextLine());
			System.out.println("Data de Nascimento: ");
			testador.setDataNascimento(sc1.next());
			System.out.println("Código: ");
			testador.setCodigo(sc1.nextInt());
			System.out.println("Testador cadastrado com sucesso!");
			break;
		}
	}
}
