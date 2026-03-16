package Exercise10;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistObjeto {
     private static final String nombreFichero = "PartidoLiga.txt";

    public static void main(String[] args) {
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        File fichero = new File(nombreFichero);
        Scanner leerArchivo = null;

        try {

            leerArchivo = new Scanner(fichero);

            while (leerArchivo.hasNextLine()) {
                String linea = leerArchivo.nextLine();
                String[] cortarLinea = linea.split("::");
                PartidoFutbol partido = new PartidoFutbol();
                partido.setEquipoLocal(cortarLinea[0]);
                partido.setEquipoVisitante(cortarLinea[1]);
                partido.setGolLocal(Integer.parseInt(cortarLinea[2]));
                partido.setGolVisitante(Integer.parseInt(cortarLinea[3]));

                partidos.add(partido);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");

        }

        System.out.println("Total matches: " + partidos.size());
        mostrarGanadorVisitante(partidos);
        contarBarcelona(partidos);
        eliminarNoEmpates(partidos);
        contarGanadorLocal(partidos);

    }


    public static void mostrarGanadorVisitante(ArrayList<PartidoFutbol> partidos) {
        System.out.println("\nVisitor wins:");

        for (PartidoFutbol p : partidos) {

            if (p.getGolVisitante() > p.getGolLocal()) {

                System.out.println(
                        p.getEquipoLocal() + " "
                        + p.getGolLocal() + " - "
                        + p.getGolVisitante() + " "
                        + p.getEquipoVisitante());
            }
        }
    }

    
    public static void contarBarcelona(ArrayList<PartidoFutbol> partidos) {
        int contador = 0;

        for (PartidoFutbol p : partidos) {

            if (p.getEquipoLocal().equals("Barcelona") &&
                    p.getGolLocal() > p.getGolVisitante()) {

                contador++;
            }

            if (p.getEquipoVisitante().equals("Barcelona") &&
                    p.getGolVisitante() > p.getGolLocal()) {

                contador++;
            }
        }

        System.out.println("\nBarcelona wins: " + contador);
    }

    
    public static void eliminarNoEmpates(ArrayList<PartidoFutbol> partidos) {

        Iterator<PartidoFutbol> it = partidos.iterator();

        while(it.hasNext()){
            PartidoFutbol p = it.next();
            if(p.getGolLocal() != p.getGolVisitante()){
                it.remove();
            }

        }
        System.out.println("\nDraw matches:");

        for (PartidoFutbol p : partidos) {
            System.out.println(
                    p.getEquipoLocal() + " "
                    + p.getGolLocal() + " - "
                    + p.getGolVisitante() + " "
                    + p.getEquipoVisitante());
        }
    }

    public static void contarGanadorLocal(ArrayList<PartidoFutbol> partidos){
        int contador = 0;

        for(PartidoFutbol p : partidos){

            if(p.getGolLocal() > p.getGolVisitante()){
                contador++;
            }
        }
        System.out.println("\nLocal team wins: "+contador);
    }
}
