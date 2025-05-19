package src.Ej10;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class TiendaRepostos {
    Map<String, Integer> existenxias = new TreeMap<>();
    String ficheiro;

    public Map<String, Integer> cargarMapa() {
        Map<String, Integer> ex = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheiro));
            ex = (Map<String, Integer>) ois.readObject();
        }catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero " + e);
        }catch (IOException e) {
            System.out.println("Error de entrada/salida " + e);
        }catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada " + e);
        }
        return ex;
    }

    public void gardarMapa(Map<String, Integer> existenxias) {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(ficheiro));
            oos.writeObject(existenxias);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero " + e);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida " + e);
        }
    }






    private class Peza implements Serializable{
        String referencia;
        int     cantidad;
        Peza(String referencia, int cantidad) {
            this.referencia = referencia;
            this.cantidad = cantidad;
        }
        public String getReferencia() {
            return referencia;
        }
        public int getCantidad() {
            return cantidad;
        }
        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
        @Override
        public String toString() {
            return "Peza{" +
                    "referencia='" + referencia + '\'' +
                    ", cantidad=" + cantidad +
                    '}';
        }

    }

    public static void main(String[] args) {

    }
}
