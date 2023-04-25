package threads;

import java.util.Objects;

public class ObjetoFilaThread {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjetoFilaThread)) {
            return false;
        }
        ObjetoFilaThread other = (ObjetoFilaThread) obj;
        return Objects.equals(nome, other.nome) && Objects.equals(email, other.email);
    }

}