package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;

public interface IFormacao {

    String getNome();
    void setNome(String nome);

    String getDescricao();

    void setDescricao(String descricao);

    LocalDate getDataInicial();

    LocalDate getDataFinal();

    Set<Dev> getDevsInscritos();

    void setDevsInscritos(Set<Dev> devsInscritos);

    Set<Conteudo> getConteudos();

    void setConteudos(Set<Conteudo> conteudos);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
