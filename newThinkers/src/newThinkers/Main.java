package newThinkers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
Ingrediente ingrediente = new Ingrediente ();
String nomeIngrediente;
String dataValidade;
Funcionario funcionario = new Funcionario ();
String nomeFuncionario;
String atividadeFuncionario;

ArrayList <Ingrediente> ingredientes = new ArrayList <Ingrediente> ();
ArrayList <Funcionario> funcionarios = new ArrayList <Funcionario> ();

Cozinha cozinhaMineira = new Cozinha ();

Cozinha cozinhaChinesa = new Cozinha ();
Cozinha cozinhaItaliana = new Cozinha (); 

Scanner scanner = new Scanner (System.in);
int opcao = 0;
int abertura = 0;
int fechamento = 0;
String pratoPrincipal;

do {
System.out.println("Digite sua opção. 1 - Cadastrar cozinha mineira; 2 - cadastrar cozinha italiana; 3 - cadastrar cozinha chinesa; 0 - fechar");

		
		opcao = scanner.nextInt();

if (opcao == 1) {
	System.out.println("Cozinha mineira");
System.out.println("Horário de abertura:");
abertura= scanner.nextInt();
System.out.println("Horário de fechamento:");
fechamento = scanner.nextInt();
System.out.println("Prato principal:");
pratoPrincipal = scanner.next();
System.out.println("Registro de ingredientes");
for (int i = 0; i <= 4; i++) {
	System.out.println("Ingrediente "+ (i + 1));
nomeIngrediente = scanner.next();
System.out.println("Data de validade (dd/mm/aaaa)");
dataValidade = scanner.next();
ingrediente.setDataValidade(dataValidade);
ingrediente.setNome(nomeIngrediente);
ingredientes.add(ingrediente);

}
System.out.println("Registro de funcionários");
for (int i = 0; i <= 3; i++) {
	System.out.println("Nome:");
	nomeFuncionario = scanner.next();
	System.out.println("Atividade do funcionário:");
	atividadeFuncionario = scanner.next();
funcionario.setAtividade(atividadeFuncionario);
funcionario.setNome(nomeFuncionario);
funcionarios.add(funcionario);

}

cozinhaMineira.setFuncionarios(funcionarios);
cozinhaMineira.setIngredientes(ingredientes);
cozinhaMineira.setHoraAbertura(abertura);
cozinhaMineira.setHoraFechamento(fechamento);
cozinhaMineira.setPratoPrincipal(pratoPrincipal);
funcionarios = null;
ingredientes = null;

} else if (opcao == 2) {
System.out.println("Cozinha italiana");
System.out.println("Horário de abertura:");
abertura= scanner.nextInt();
System.out.println("Horário de fechamento:");
fechamento = scanner.nextInt();
System.out.println("Prato principal:");
pratoPrincipal = scanner.next();
System.out.println("Registro de ingredientes");
for (int i = 0; i <= 2; i++) {
	System.out.println("Ingrediente "+ (i + 1));
nomeIngrediente = scanner.next();
System.out.println("Data de validade (dd/mm/aaaa)");
dataValidade = scanner.next();
ingrediente.setDataValidade(dataValidade);
ingrediente.setNome(nomeIngrediente);
ingredientes.add(ingrediente);

}
System.out.println("Registro de funcionários");
for (int i = 0; i <= 1; i++) {
	System.out.println("Nome:");
	nomeFuncionario = scanner.next();
	System.out.println("Atividade do funcionário:");
	atividadeFuncionario = scanner.next();
funcionario.setAtividade(atividadeFuncionario);
funcionario.setNome(nomeFuncionario);
funcionarios.add(funcionario);

}

cozinhaItaliana.setFuncionarios(funcionarios);
cozinhaItaliana.setIngredientes(ingredientes);
cozinhaItaliana.setHoraAbertura(abertura);
cozinhaItaliana.setHoraFechamento(fechamento);
cozinhaItaliana.setPratoPrincipal(pratoPrincipal);
funcionarios = null;
ingredientes = null;


} else if (opcao == 3) {
	System.out.println("Horário de abertura:");
	abertura= scanner.nextInt();
	System.out.println("Horário de fechamento:");
	fechamento = scanner.nextInt();
	System.out.println("Prato principal:");
	pratoPrincipal = scanner.next();
	System.out.println("Registro de ingredientes");
	for (int i = 0; i <= 2; i++) {
		System.out.println("Ingrediente "+ (i + 1));
	nomeIngrediente = scanner.next();
	System.out.println("Data de validade (dd/mm/aaaa)");
	dataValidade = scanner.next();
	ingrediente.setDataValidade(dataValidade);
	ingrediente.setNome(nomeIngrediente);
	ingredientes.add(ingrediente);

	}
	System.out.println("Registro de funcionários");
	for (int i = 0; i <= 3; i++) {
		System.out.println("Nome:");
		nomeFuncionario = scanner.next();
		System.out.println("Atividade do funcionário:");
		atividadeFuncionario = scanner.next();
	funcionario.setAtividade(atividadeFuncionario);
	funcionario.setNome(nomeFuncionario);
	funcionarios.add(funcionario);

	}

	cozinhaChinesa.setFuncionarios(funcionarios);
	cozinhaChinesa.setIngredientes(ingredientes);
	cozinhaChinesa.setHoraAbertura(abertura);
	cozinhaChinesa.setHoraFechamento(fechamento);
	cozinhaChinesa.setPratoPrincipal(pratoPrincipal);
	funcionarios = null;
	ingredientes = null;

}




}
while(opcao >0);
System.out.println("Fim!");
	}

}
