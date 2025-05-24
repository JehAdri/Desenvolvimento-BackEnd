package br.com.atividade2;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;


@Named("contatoBean")
@RequestScoped
public class ContatoBean implements Serializable {
	
    private static final long serialVersionUID = 1L;

    private String nome;
    private String sobrenome;
    private String fone;
    private String email;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String enviar() {
        System.out.println("Dados recebidos:");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Telefone: " + fone);
        System.out.println("E-mail: " + email);
        return "formulario"; // volta para a mesma página
    }
}