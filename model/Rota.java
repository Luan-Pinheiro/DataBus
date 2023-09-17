package model;

public class Rota {
  private String codigoRota;
  private String pontoPartida;
  private String pontoChegada;
  private String horarioSaida;
  private String horarioChegada;
  static String textAlerta = "Voce digitou incorretamente os campos: ";

  
  public Rota(){
    
  }
  
  public Rota(String cRota,String pontoPartida,String pontoChegada,String horarioSaida, String horarioChegada){
    this.codigoRota = cRota;
    this.pontoPartida = pontoPartida;
    this.pontoChegada = pontoChegada;
    this.horarioSaida = horarioSaida;
    this.horarioChegada = horarioChegada;
  }
  
  public static String alertas() {
    return textAlerta;
  }

  //Getters e Setters
  public String getCodigoRota() {
    return codigoRota;
  }
  public void setCodigoRota(String codigoRota) {
    this.codigoRota = codigoRota;
  }
  public String getPontoPartida() {
    return pontoPartida;
  }
  public void setPontoPartida(String pontoPartida) {
    this.pontoPartida = pontoPartida;
  }
  public String getPontoChegada() {
    return pontoChegada;
  }
  public void setPontoChegada(String pontoChegada) {
    this.pontoChegada = pontoChegada;
  }
  public String getHorarioSaida() {
    return horarioSaida;
  }
  public void setHorarioSaida(String horarioSaida) {
    this.horarioSaida = horarioSaida;
  }
  public String getHorarioChegada() {
    return horarioChegada;
  }
  public void setHorarioChegada(String horarioChegada) {
    this.horarioChegada = horarioChegada;
  }

}
