package arquivos;

import java.io.Serializable;

public class Usuario implements Serializable {


	private static final long serialVersionUID = 1L;

	private String login;
	private String senha;
	private String cpf;

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
