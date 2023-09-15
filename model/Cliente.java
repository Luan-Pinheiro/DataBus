package model;

import java.sql.Date;

public class Cliente {
  private int identificador;
  private String email;
  private String senha;
  private Date dataNascimento;
  private String numeroTel;
  private String nome;
  private String endereco;
  private String cpf;

public Cliente(int identificador, String email, String senha, Date dataNascimento, String numeroTel, String nome,String endereco, String cpf) {
    this.identificador = identificador;
    this.email = email;
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
public String getemail() {
    return email;
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
