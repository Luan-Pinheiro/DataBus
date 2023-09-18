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


  public static void setTextAlerta(String textAlerta) {
    Rota.textAlerta = textAlerta;
}

public static boolean conferePontoChegada(String PontoChegada){
  boolean valido = true;
  if (PontoChegada.length() < 3) {
    valido = false;
  }
  if (!PontoChegada.matches("[a-zA-Z\\s]*")) {
    valido = false;
  }
  if (valido == false) {
    textAlerta += "Ponto chegada, ";
  }

  return valido;
}

public static boolean conferePontoPartida(String PontoChegada){
  boolean valido = true;
  if (PontoChegada.length() < 3) {
    valido = false;
  }
  if (!PontoChegada.matches("[a-zA-Z\\s]*")) {
    valido = false;
  }
  if (valido == false) {
    textAlerta += "Ponto chegada, ";
  }

  return valido;
}

public static Boolean confereCdRota(String codigoRota) {
  boolean valido = true;
  if (codigoRota.length() != 3) {
      valido = false;
  }
  if (!codigoRota.matches("[a-zA-Z0-9]*")) {
      valido = false;
  }
  if (valido == false) {
      textAlerta += "CodigoRota, ";
  }
  return valido;
}



public static Boolean confereHorarioSaida(String horarioSaida) {
  horarioSaida = horarioSaida.replaceAll("[:]", "");
  boolean valido = true;
  if (horarioSaida.length() != 4) {
      valido = false;
  }
  if (!horarioSaida.matches("[0-9]*")) {
      valido = false;
  }
  if (valido == false) {
      textAlerta += "horarioSaida, ";
  }
  return valido;
}

public static Boolean confereHorarioEntrada(String horarioEntrada) {
  horarioEntrada = horarioEntrada.replaceAll("[:]", "");
  boolean valido = true;
  if (horarioEntrada.length() != 4) {
      valido = false;
  }
  if (!horarioEntrada.matches("[0-9]*")) {
      valido = false;
  }
  if (valido == false) {
      textAlerta += "horarioSaida, ";
  }
  return valido;
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
