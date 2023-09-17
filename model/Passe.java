package model;

import java.util.Random;

import data.ClienteDaoJDBC;

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

    public Passe(){};
    
    public Passe(String clienteCPF, float saldo, String validade, String instituicao, String numMatricula) {
        cpfCliente = clienteCPF;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Instituicao = instituicao;
        this.numMatricula = numMatricula;
    }

    public Passe(String clienteCPF, float saldo, String validade, String rg) {
        cpfCliente = clienteCPF;
        this.saldo = saldo;
        NumCartao = geraNumCartao();
        this.validade = validade;
        Rg = rg;
    }

    public Passe(String clienteCPF, float saldo, String validade, String rg, int carteiraTrabalho) {
        cpfCliente = clienteCPF;
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
    public void setNomeCliente(String clienteCPF) {
        ClienteDaoJDBC cDao = new ClienteDaoJDBC();
        this.nomeCliente = cDao.queryName(nomeCliente).getNome();
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
