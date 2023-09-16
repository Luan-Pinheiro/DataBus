package data;
import java.util.ArrayList;
import model.*;

public interface iClienteDao {
    ArrayList<Cliente> getAllClientes();
    void createCliente (Cliente Cliente, int id);
    Cliente readCliente (long id);
    void updateCliente (Cliente Cliente);
    void deleteCliente (Cliente Cliente);
}
