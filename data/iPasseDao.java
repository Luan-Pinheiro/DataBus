package data;
import java.util.ArrayList;
import model.*;

public interface iPasseDao {
    ArrayList<Passe> getAllPasses();
    void createPasse (Passe passe);
    Cliente readPasse (String numCartao);
    void updatePasse (Passe passe);
    void deletePasse (Passe passe);
}