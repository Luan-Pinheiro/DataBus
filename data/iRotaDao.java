package data;
import java.util.ArrayList;
import model.*;

public interface iRotaDao {
  ArrayList<Rota> getAllRotas();
  void createRota (Rota rota);
  Rota readRota (String codRota);
  void updateRota (Rota rota);
  void deleteRota (Rota rota);
}