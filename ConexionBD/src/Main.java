import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    // Datos de conexión a la base de datos
    public static final String user = "root" ;
    public static final String pwd = "";
    public static final String url = "jdbc:MYSQL://localhost/agenda";
    public static void main(String[] args) {

        try {
            Connection conex = DriverManager.getConnection(url, user, pwd);
            System.out.println("Se ha conectado a la base de datos con éxito!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}