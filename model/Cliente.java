package model;

import java.sql.Date;

public class Cliente {
  private int identificador;
  private String usuario;
  private String senha;
  private Date dataNascimento;
  private String numeroTel;
  private String nome;
  private String endereco;
  private String cpf;

public Cliente(int identificador, String usuario, String senha, Date dataNascimento, String numeroTel, String nome,String endereco, String cpf) {
    this.identificador = identificador;
    this.usuario = usuario;
    this.senha = senha;
    this.dataNascimento = dataNascimento;
    this.numeroTel = numeroTel;
    this.nome = nome;
    this.endereco = endereco;
    this.cpf = cpf;
}

public int getIdentificador() {
    return identificador;
}
public String getUsuario() {
    return usuario;
}
public String getSenha() {
    return senha;
}
public Date getDataNascimento() {
    return dataNascimento;
}
public String getNumeroTel() {
    return numeroTel;
}
public String getNome() {
    return nome;
}
public String getEndereco() {
    return endereco;
}
public String getCpf() {
    return cpf;
}

}
