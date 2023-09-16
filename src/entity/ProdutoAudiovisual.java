package entity;

import enumerator.Genero;
import enumerator.TipoAudioVisual;


public abstract class  ProdutoAudiovisual {
    private Long codigo;
    private String nome;
    private int ano;
    private Pessoa diretor;
    private Pessoa[] principaisAtores;
    private Genero genero;
    private TipoAudioVisual tipo;
    private Streaming[] streamings;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    public Pessoa[] getPrincipaisAtores() {
        return principaisAtores;
    }

    public void setPrincipaisAtores(Pessoa[] principaisAtores) {
        this.principaisAtores = principaisAtores;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public TipoAudioVisual getTipo() {
        return tipo;
    }

    public void setTipo(TipoAudioVisual tipo) {
        this.tipo = tipo;
    }

    public Streaming[] getStreamings() {
        return streamings;
    }

    public void setStreamings(Streaming[] streamings) {
        this.streamings = streamings;
    }
}
