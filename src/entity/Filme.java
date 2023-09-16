package entity;

import java.math.BigDecimal;

public class Filme extends ProdutoAudiovisual{
    private BigDecimal duracao;

    public Filme(BigDecimal duracao) {
        this.duracao = duracao;
    }

    public BigDecimal getDuracao() {
        return duracao;
    }

    public void setDuracao(BigDecimal duracao) {
        this.duracao = duracao;
    }
}
