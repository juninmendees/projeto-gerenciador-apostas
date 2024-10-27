package br.com.gerenciadorApostas.gerenciadorApostas;

public class Saudacao {

    private final Long id;
    private final String mensagem;

    public Saudacao(Long id, String mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }
}
