package Sobrecarga;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.dados_pessoa("Rafael", "Masculino", 20);
		pessoa.dados_pessoa("Rafael" , "Masculino");
		pessoa.dados_pessoa("Rafael");
		pessoa.dados_pessoa(20);
		
	}
}
