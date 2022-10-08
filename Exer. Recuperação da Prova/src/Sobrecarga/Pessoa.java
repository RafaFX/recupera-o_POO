package Sobrecarga;

public class Pessoa {

	  private String nome;
	  private String sexo;
	  private int idade;

	  public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }


	  public String getSexo() {
	    return sexo;
	  }

	  public void setSexo(String sexo) {
	    this.sexo = sexo;
	  }

	  public int getIdade() {
	    return idade;
	  }

	  public void setIdade(int idade) {
	    this.idade = idade;
	  }
	  
	  public void dados_pessoa(String nome, String sexo, int idade) {
		    setNome(nome);
		    setSexo(sexo);
		    setIdade(idade);
		    System.out.println(getNome() + getSexo() + getIdade() + " anos de idade");
		  }
	  
	  public void dados_pessoa(String nome, String sexo) {
		    setNome(nome);
		    setSexo(sexo);
		    System.out.println( getNome() + getSexo());
		  }
	  
	  public void dados_pessoa(String nome) {
		    setNome(nome);
		    System.out.println( getNome());
		  }
	  
	  public void dados_pessoa(int idade) {
		    setIdade(idade);
		    System.out.println( getIdade() + " anos de idade");
		  }


	}
