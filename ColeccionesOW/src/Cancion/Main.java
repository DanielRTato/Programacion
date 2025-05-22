package Cancion;




import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Cancion> Canciones = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try(BufferedReader br = new BufferedReader(new FileReader("playlist.txt"))){
            String linea;
            while ((linea=br.readLine())!=null){
                String [] datos = linea.split(" - ");
                Cancion cancion = new Cancion((datos[0]),(datos[1]));
                Canciones.add(cancion);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int op = 0;
        do {
            System.out.println("1.Engadir cancion");
            System.out.println("2.Eliminar cancion");
            System.out.println("3.Buscar cancion por titulo");
            System.out.println("4.Mostrar lista de reproduccion");
            System.out.println("5.Sair");
            op = sc.nextInt();

            switch (op){
                case 1 -> engadirCanciones(Canciones);
                case 2 -> eliminarCanciones(Canciones);
                case 3 -> buscarCancionT(Canciones);
                case 4 -> System.out.println(Canciones);
                case 5 ->{
                    gardarPlaylist(Canciones);
                    System.out.println("Cerrando");
                    //;
                }
                default -> System.out.println("Opcion no valida");
            }//end switch

        }while(op != 5);
    }//end main

    static List<Cancion> engadirCanciones(List<Cancion> Canciones){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la cancion: ");
        String nCancion = sc.nextLine();
        System.out.println("Artista: ");
        String nArtista = sc.nextLine();

        Cancion cancion = new Cancion(nCancion,nArtista);
        Canciones.add(cancion);
        return Canciones;

    }//end altaProductos

    static void eliminarCanciones(List<Cancion> Canciones){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo del producto a eliminar:");
        String CancionAEliminar = sc.nextLine();
        Canciones.removeIf(Cancion -> Cancion.getTitulo().equals(CancionAEliminar));

    }//baixaProducto

    static void buscarCancionT(List<Cancion> Canciones){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cancion a buscar");
        String tCancion = sc.nextLine();


        for (Cancion cancion : Canciones){
            if (cancion.getTitulo().equals(tCancion)){
                System.out.println("El titulo es: "+ cancion.getTitulo()+ " y su artitsta: "+ cancion.getArtista());
            }//end if
        }//end for

    }//end actualizar

    static void gardarPlaylist(List<Cancion> Canciones){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida = new ObjectOutputStream(new FileOutputStream("playlist.txt"));
        }catch (IOException e){
            System.out.println("erro de entrada/saida"+ e.getMessage());
        }finally {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("playlist.txt"))){
                for (Cancion info : Canciones) {
                    bw.append(info.toString());
                    bw.newLine();
                }


                fluxoSaida.close();
            }catch (IOException e){
                System.out.println("erro:"+e.getMessage());
            }
        }
    }//end guardarProductos

}//end class