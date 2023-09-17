package data;
import java.util.ArrayList;
import model.*;

public interface iRotaDao {
  ArrayList<Rota> getAllRotas();
  Rota readRota (String codRota);
}