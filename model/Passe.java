package model;

import java.util.Random;

public class Passe {
    private String cpfCliente;
    private String nomeCliente;
    private float saldo;
    private String NumCartao;
    private String validade;
    private String Rg;
    private String Instituicao;
    private String numMatricula;
    private int carteiraTrabalho;
    static String textAlerta = "Voce digitou incorretamente os campos: ";

    public Passe(){};
    
    public Passe(String clienteCPF,String numMatricula,String instituicao, float saldo, String validade, String nome) {
        cpfCliente = clienteCPF;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Instituicao = instituicao;
        this.numMatricula = numMatricula;
        this.nomeCliente = nome;
    }

    public Passe(String clienteCPF, float saldo, String validade, String rg, String nome) {
        cpfCliente = clienteCPF;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Rg = rg;
        this.nomeCliente = nome;
    }

    public Passe(String clienteCPF, float saldo, String validade, String rg, int carteiraTrabalho, String nome) {
        cpfCliente = clienteCPF;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Rg = rg;
        this.carteiraTrabalho = carteiraTrabalho;
        this.nomeCliente = nome;
    }

    public String geraNumCartao(){
        // Gere um número aleatório de 7 dígitos
        Random random = new Random();
        int numeroAleatorio = random.nextInt(9000000) + 1000000;
        String numero = Integer.toString(numeroAleatorio);
        return numero;
    }

    public static String alertas() {
        return textAlerta;
      }
    
      public static void setTextAlerta(String textAlerta) {
        Cliente.textAlerta = textAlerta;
      }

    public Boolean confereRg(String rg){
        rg = rg.replaceAll("[.-]", "");
    boolean valido = true;
    if (rg.length() != 10) {
      valido = false;
    }
    if (!rg.matches("[0-9]*")) {
      valido = false;
    }
    if (valido == false) {
      textAlerta += "RG, ";
    }
    return valido;
    }
    public boolean confereCtps(String ctps){
        
        ctps = String.valueOf(carteiraTrabalho); 
    ctps.replaceAll("[/]", "");
    boolean valido = true;
    if (ctps.length() != 10) {
      valido = false;
    }
    if (!ctps.matches("[0-9]*")) {
      valido = false;
    }
    if (valido == false) {
      textAlerta += "CTPS, ";
    }
    return valido;
    }

    public boolean confereNumMatricula(String nMatricula){
        boolean valido = true;
        if (nMatricula.length() < 3 && nMatricula.length() > 10)   {
          valido = false;
        }
        if (!nMatricula.matches("[0-9]*")) {
          valido = false;
        }
        if (valido == false) {
          textAlerta += "Numero Matricula, ";
        }
        return valido;
    }
    

    public String getCpfCliente() {
        return cpfCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNumCartao() {
        return NumCartao;
    }

    public String getValidade() {
        return validade;
    }

    public String getRg() {
        return Rg;
    }

    public String getInstituicao() {
        return Instituicao;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public int getCarteiraTrabalho() {
        return carteiraTrabalho;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nome) {
        this.nomeCliente = nome;
    }
    public void setCpfCliente(String clienteCPF) {
        cpfCliente = clienteCPF;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNumCartao(String numCartao) {
        NumCartao = numCartao;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setRg(String rg) {
        Rg = rg;
    }

    public void setInstituicao(String instituicao) {
        Instituicao = instituicao;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setCarteiraTrabalho(int carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }
    
}
