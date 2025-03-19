import java.util.*;
import java.time.LocalDate;

public class Persona {
    private String nombre;
    private int edad;
    private double salario;
    private boolean activo;
    private Date fechaNacimiento;
    private List<String> habilidades;
    private String correo;
    private String contrasena;
    private long telefono;
    private double descuento;
    private List<Integer> notas;
    private Empleado jefe;
    private List<Producto> carrito;
    private LocalDate fechaReserva;
    private TipoUsuario tipoUsuario;
    private String dni;

    // Setter para nombre
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío o ser nulo.");
        }
    }

    // Setter para edad
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120 años.");
        }
    }

    // Setter para salario
    public void setSalario(double salario) {
        if (salario >= 1000) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("El salario debe ser al menos 1000.");
        }
    }

    // Setter para estado activo
    public void setActivo(boolean activo) {
        this.activo = activo;
        System.out.println("El estado activo ha sido cambiado a: " + this.activo);
    }

    // Setter para fecha de nacimiento
    public void setFechaNacimiento(Date fechaNacimiento) {
        if (fechaNacimiento != null && fechaNacimiento.before(new Date())) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser en el futuro.");
        }
    }

    // Setter para habilidades
    public void setHabilidades(List<String> habilidades) {
        if (habilidades != null && !habilidades.isEmpty()) {
            this.habilidades = habilidades;
        } else {
            throw new IllegalArgumentException("La lista de habilidades no puede estar vacía.");
        }
    }

    // Setter para correo electrónico
    public void setCorreo(String correo) {
        if (correo != null && correo.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("Correo electrónico no válido.");
        }
    }

    // Setter para contraseña
    public void setContrasena(String contrasena) {
        if (contrasena != null && contrasena.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            this.contrasena = contrasena;
        } else {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres, una mayúscula y un número.");
        }
    }

    // Setter para teléfono
    public void setTelefono(long telefono) {
        String telefonoStr = String.valueOf(telefono);
        if (telefonoStr.length() == 9 || telefonoStr.length() == 10) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El número de teléfono debe tener 9 o 10 dígitos.");
        }
    }

    // Setter para descuento
    public void setDescuento(double descuento) {
        if (descuento >= 0 && descuento <= 50) {
            this.descuento = descuento;
        } else {
            throw new IllegalArgumentException("El descuento debe estar entre 0% y 50%.");
        }
    }

    // Setter para notas
    public void setNotas(List<Integer> notas) {
        if (notas != null && notas.stream().allMatch(nota -> nota >= 0 && nota <= 10)) {
            this.notas = notas;
        } else {
            throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
        }
    }

    // Setter para jefe
    public void setJefe(Empleado jefe) {
        if (jefe != null && !jefe.equals(this)) {
            this.jefe = jefe;
        } else {
            throw new IllegalArgumentException("Un empleado no puede ser su propio jefe.");
        }
    }

    // Setter para carrito de compras
    public void setCarrito(List<Producto> carrito) {
        if (carrito != null && !carrito.isEmpty()) {
            this.carrito = carrito;
        } else {
            throw new IllegalArgumentException("El carrito de compras no puede estar vacío.");
        }
    }

    // Setter para fecha de reserva
    public void setFechaReserva(LocalDate fechaReserva) {
        if (fechaReserva != null && !fechaReserva.isBefore(LocalDate.now())) {
            this.fechaReserva = fechaReserva;
        } else {
            throw new IllegalArgumentException("La fecha de reserva no puede ser en el pasado.");
        }
    }

    // Setter para tipo de usuario
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        if (tipoUsuario != null) {
            this.tipoUsuario = tipoUsuario;
        } else {
            throw new IllegalArgumentException("El tipo de usuario no puede ser nulo.");
        }
    }

    // Setter para DNI
    public void setDni(String dni) {
        if (dni != null && dni.matches("\\d{8}[A-Z]")) {
            this.dni = dni;
        } else {
            throw new IllegalArgumentException("El DNI debe tener 8 números seguidos de una letra mayúscula.");
        }
    }
}
