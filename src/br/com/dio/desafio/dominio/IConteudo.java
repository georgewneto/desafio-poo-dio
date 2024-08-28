package br.com.dio.desafio.dominio;

public interface IConteudo {
    double calcularXp();

    String getTitulo();
    void setTitulo(String titulo);

    String getDescricao();
    void setDescricao(String descricao);
}
