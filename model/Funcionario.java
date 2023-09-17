package model;

public class Funcionario {
  private String email;
  private String senha;
  private String codigoFuncionario;
  public Funcionario(){};

  public Funcionario(String email, String senha, String codigoFuncionario){
    this.email = email;
    this.senha = senha;
    this.codigoFuncionario = codigoFuncionario;
  }

  //Getters e Setters
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getCodigoFuncionario() {
    return codigoFuncionario;
  }
  public void setCodigoFuncionario(String codigoFuncionario) {
    this.codigoFuncionario = codigoFuncionario;
  }
}
