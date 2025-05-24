package br.com.cadUser;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("pessoa")
@SessionScoped
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private List<String> nomesCadastrados = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

    public String cadastrar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomesCadastrados.add(nome);
            nome = "";
        }
        return null;
    }
}
