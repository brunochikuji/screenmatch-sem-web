package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;


import java.time.DateTimeException;
import java.time.LocalDate;

@Entity
@Table(name = "episodios")
public class Episodio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer temporada;
    private String titulo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    private Integer numero;
    private Double avaliacao;
    private LocalDate dataDeLancamento;

    @ManyToOne
    private Serie serie;

    public Episodio() {}

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        this.numero = dadosEpisodio.numero();
        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException ex) {
            this.avaliacao = 0.0;
        }
        try {
            this.dataDeLancamento = LocalDate.parse(dadosEpisodio.dataDeLancamento());
        } catch (DateTimeException e) {
            this.dataDeLancamento = null;
        }
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numero=" + numero +
                ", avaliacao=" + avaliacao +
                ", dataDeLancamento=" + dataDeLancamento;
    }
}
