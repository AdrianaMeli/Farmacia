package com.generation.farmacia.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo é obrigatório e não pode ser vazio!")
    @Size(min = 5, max = 100, message = "O tamanho minimo de 5 e maximo 100 caracteres!" )
    private String nome;

    @NotNull(message = "O atributo é obrigatório e não pode ser vazio!")
    private BigDecimal preco;

    @NotBlank(message = "O atributo é obrigatório e não pode ser vazio!")
    @Size(min = 5, message = "O tamanho minimo de 5!" )
    private String descricao;

    @NotBlank(message = "O atributo é obrigatório e não pode ser vazio!")
    @Size(min = 5, message = "O tamanho minimo de 1 e maximo 20 caracteres!" )
    private String foto;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}