package model;

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
    
    public Passe(Cliente cliente, float saldo, String numCartao, String validade, String instituicao, String numMatricula) {
        Cliente = cliente;
        this.saldo = saldo;
        NumCartao = numCartao;
        this.validade = validade;
        Instituicao = instituicao;
        this.numMatricula = numMatricula;
    }

    public Passe(Cliente cliente, float saldo, String numCartao, String validade, String rg) {
        Cliente = cliente;
        this.saldo = saldo;
        NumCartao = numCartao;
        this.validade = validade;
        Rg = rg;
    }

    public Passe(Cliente cliente, float saldo, String numCartao, String validade, String rg, int carteiraTrabalho) {
        Cliente = cliente;
        this.saldo = saldo;
        NumCartao = numCartao;
        this.validade = validade;
        Rg = rg;
        this.carteiraTrabalho = carteiraTrabalho;
    }


    
}
