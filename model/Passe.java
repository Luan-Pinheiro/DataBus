package model;

import java.util.Random;

import model.*;

public class Passe {
    private Cliente Cliente;
    private float saldo;
    private String NumCartao;
    private String validade;
    private String Rg;
    private String Instituicao;
    private String numMatricula;
    private int carteiraTrabalho;
    
    public Passe(Cliente cliente, float saldo, String validade, String instituicao, String numMatricula) {
        Cliente = cliente;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Instituicao = instituicao;
        this.numMatricula = numMatricula;
    }

    public Passe(Cliente cliente, float saldo, String validade, String rg) {
        Cliente = cliente;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Rg = rg;
    }

    public Passe(Cliente cliente, float saldo, String validade, String rg, int carteiraTrabalho) {
        Cliente = cliente;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Rg = rg;
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String geraNumCartao(){
        // Gere um número aleatório de 7 dígitos
        Random random = new Random();
        int numeroAleatorio = random.nextInt(9000000) + 1000000;
        String numero = Integer.toString(numeroAleatorio);
        return numero;
    }

    public Cliente getCliente() {
        return Cliente;
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

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
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
