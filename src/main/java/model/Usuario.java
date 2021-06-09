package model;

import java.sql.Date;

public class Usuario {
    private int id;
    private String senha;
    private String nome;
    private Date dataNascimento;
    private int celular;
    private String email;
    private int telefoneEmergencia;
    private String problemaSaude;
    private String alergia;
    private String tipoUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(int telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public String getProblemaSaude() {
        return problemaSaude;
    }

    public void setProblemaSaude(String problemaSaude) {
        this.problemaSaude = problemaSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }

    public Usuario(int id, String senha, String nome, Date dataNascimento, int celular, String email, int telefoneEmergencia, String problemaSaude, String alergia, String tipoUsuario) {
        super();
        this.id = id;
        this.senha = senha;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.email = email;
        this.telefoneEmergencia = telefoneEmergencia;
        this.problemaSaude = problemaSaude;
        this.alergia = alergia;
        this.tipoUsuario = tipoUsuario;
    }
}
