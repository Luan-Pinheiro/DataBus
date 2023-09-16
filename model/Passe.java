package model;

import controller.ScreenController;

public class Passe {
  private String email;
  private String senha;
  private String dataNascimento;
  private String telefone;
  private String nome;
  private String endereco;
  private String cpf;
  static String textAlerta = "Voce digitou incorretamente os campos: ";

  ScreenController sc;


  public Cliente(String email, String senha, String dataNascimento, String numeroTel, String nome, String endereco,String cpf) {
    this.email = email;
    this.senha = senha;
    this.dataNascimento = dataNascimento;
    this.telefone = numeroTel;
    this.nome = nome;
    this.endereco = endereco;
    this.cpf = cpf;
  }
}
