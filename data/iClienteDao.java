package data;
import java.util.ArrayList;
import model.*;

public interface iClienteDao {
    ArrayList<Cliente> getAllClientes();
    void createCliente (Cliente cliente);
    Cliente readCliente (String cpf);
    void updateCliente (Cliente cliente);
    void deleteCliente (Cliente cliente);
    Cliente queryAccount (String cpf);
}
