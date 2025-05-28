import java.sql.*;

public class CreacionTaboaExistencia {

    public static final String user = "root";
    public static final String pwd = "";
    public static final String url = "jdbc:mysql://localhost/recambios";

    public CreacionTaboaExistencia() {
        Connection conex;
        String sqlCreacion = "CREATE TABLE IF NOT EXISTS existencias (" +
                "referencia VARCHAR(50) NOT NULL," +
                "descripcion VARCHAR(255)," +
                "cantidad INT," +
                "prezo DOUBLE," +
                "PRIMARY KEY (referencia))";

        try {
            conex = DriverManager.getConnection(url, user, pwd);
            Statement sentencia = conex.createStatement();
            sentencia.executeUpdate(sqlCreacion);
/*
            String sql = "INSERT INTO existencias (referencia, descripcion, cantidad, prezo) " +
                    "VALUES ('000x01', 'Xunta da trocola', 15, 23.52)";
            sentencia.executeUpdate(sql);

            sql = "INSERT INTO existencias (referencia, descripcion, cantidad, prezo) " +
                    "VALUES ('000x02', 'Tuerca', 100, 0.95)";
            sentencia.executeUpdate(sql);

            sql = "INSERT INTO existencias (referencia, descripcion, cantidad, prezo) " +
                    "VALUES ('000x03', 'Tornillo', 3, 10)";
            sentencia.executeUpdate(sql);
*/
            System.out.println("Se ha conectado a la base de datos con éxito!");

            String sql = "SELECT * FROM existencias";
            ResultSet existencuias = sentencia.executeQuery(sql);
            while (existencuias.next()) {
                System.out.println(existencuias.getString("referencia") + " " + existencuias.getString("descripcion") + " " + existencuias.getInt("cantidad") + " " + existencuias.getDouble("prezo"));
            }


        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}