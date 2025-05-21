package EjemploExamen1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDeportistas {
    private List<Deportista> deportistas;
    private static final String FICHERO = "deportistas.dat";

    public GestorDeportistas() {
        deportistas = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        File fichero = new File(FICHERO);
        if (!fichero.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO))) {
            deportistas = (List<Deportista>) ois.readObject();
        } catch (Exception e) {
            System.err.println("Erro ao cargar datos: " + e.getMessage());
        }
    }

    public void gardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
            oos.writeObject(deportistas);
        } catch (IOException e) {
            System.err.println("Erro ao gardar datos: " + e.getMessage());
        }
    }

    public void engadirDeportista(Deportista d) {
        if (d != null) deportistas.add(d);
    }

    public boolean eliminarDeportista(String dni) {
        return deportistas.removeIf(d -> d.getDni().equalsIgnoreCase(dni));
    }

    public Deportista buscarPorDni(String dni) {
        return deportistas.stream()
                .filter(d -> d.getDni().equalsIgnoreCase(dni))
                .findFirst()
                .orElse(null);
    }

    public boolean modificarDeportista(String dni, String novoNome, String novaLicenza) {
        Deportista d = buscarPorDni(dni);
        if (d == null) return false;

        try {
            if (novoNome != null && !novoNome.isBlank()) {
                d.setNome(novoNome);
            }
            if (novaLicenza != null && !novaLicenza.isBlank()) {
                d.setLicenza(novaLicenza);
            }
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao modificar: " + e.getMessage());
            return false;
        }
    }

    public List<Deportista> getDeportistas() {
        return new ArrayList<>(deportistas);
    }
}
