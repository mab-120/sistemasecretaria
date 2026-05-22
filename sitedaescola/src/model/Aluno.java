package model;

import java.time.LocalDate;

public class Aluno {

    private int id;
    private String nome;
    private String nomeSocial;
    private LocalDate dataNascimento;
    private Genero genero;
    private String nacionalidade;
    private String paisOrigem;
    private boolean afrodescendente;
    private String primeiraFiliacao;
    private String segundaFiliacao;
    private boolean escolaridadePublica;
    private String habilitacao;
    private String modulo;
    private String periodo;

    public Aluno () {

    }

    public Aluno (int id, String nome, String nomeSocial, LocalDate dataNascimento, Genero genero, String nacionalidade, String paisOrigem, boolean afrodescendente, String primeiraFiliacao, String segundaFiliacao, boolean escolaridadePublica, String habilitacao, String modulo, String periodo)
    {
        this.id = id;
        this.nome=nome;
        this.nomeSocial = nomeSocial;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.nacionalidade=nacionalidade;
        this.paisOrigem=paisOrigem;
        this.afrodescendente= afrodescendente;
        this.primeiraFiliacao= primeiraFiliacao;
        this.segundaFiliacao = segundaFiliacao;
        this.escolaridadePublica = escolaridadePublica;
        this.habilitacao = habilitacao;
        this.modulo = modulo;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isAfrodescendente() {
        return afrodescendente;
    }

    public void setAfrodescendente(boolean afrodescendente) {
        this.afrodescendente = afrodescendente;
    }

    public String getPrimeiraFiliacao() {
        return primeiraFiliacao;
    }

    public void setPrimeiraFiliacao(String primeiraFiliacao) {
        this.primeiraFiliacao = primeiraFiliacao;
    }

    public String getSegundaFiliacao() {
        return segundaFiliacao;
    }

    public void setSegundaFiliacao(String segundaFiliacao) {
        this.segundaFiliacao = segundaFiliacao;
    }

    public boolean isEscolaridadePublica() {
        return escolaridadePublica;
    }

    public void setEscolaridadePublica(boolean escolaridadePublica) {
        this.escolaridadePublica = escolaridadePublica;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


    


    
}
