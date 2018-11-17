package br.com.gastronomia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


import br.com.gastronomia.util.TipoDeUsuario;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Classe modelo para o acesso ao banco de dados.
 * Feito a partir da classe Usuario do projeto IdeiasAges
 *
 * @author Pedro Bledow - pedro.bledow@acad.pucrs.br
 * @since 06/09/2017
 *
 **/
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name= "Usuario",
        uniqueConstraints={
                @UniqueConstraint(columnNames={"Cpf"}, name="cpf_uc")})
@JsonIgnoreProperties(ignoreUnknown=true)
public class Usuario implements Serializable {

    private static final long serialVersionUID = -789863172532826108L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    private long id;

    @NotEmpty
    @Column(name = "Cpf")
    private String cpf;

    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "IdFatura")
    private List<Fatura> faturas = new ArrayList<>();

    @NotEmpty
    @Email(message="E-mail invalido")
    @Column(name = "Email")
    private String email;

    @NotEmpty
    @Column(name = "Moeda")
    private int moeda;

    @NotEmpty
    @Column(name= "Nome")
    private String nome;

    @NotEmpty
    @Column(name= "Senha")
    private String senha;

    @Column(name= "Tipo")
    private String tipo;


    @Column(name= "Status", nullable = false)
    private boolean status;

    /**
     * Construtor vazio.
     *
     **/
    public Usuario() {}

    /**
     * Construtor com o CPF.
     *
     * @param cpf CPF de um usuario.
     **/
    public Usuario(String cpf) {
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public Usuario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Usuario(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Valida se o usuario esta ativo ou nao.
     *
     * @return boolean
     **/
    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Valida se o usuario e valido atraves do CPF.
     *
     * @return boolean
     **/
    public boolean isValid() {
        return (this.cpf != null);
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", cpf=" + cpf + ", email=" + email + ", nome=" + nome
                + ", senha=" + senha + ", tipo=" + tipo.toString() + ", status=" + status + "]";
    }

}