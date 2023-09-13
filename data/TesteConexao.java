package data;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
       Connection conexao = new FabricaConnection ().getConnection();
        System.out.println("Conexão aberta!");
        conexao.close();
    }
}
