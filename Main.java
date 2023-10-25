import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Museo museo = new Museo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos especímenes quieres registrar?");
        int numEspecimenes = scanner.nextInt();
        scanner.nextLine();  // consume newline left-over

        for (int i = 0; i < numEspecimenes; i++) {
            System.out.println("Introduce el tipo de espécimen (1: Dinosaurio, 2: Planta Fósil, 3: Mamífero Prehistórico):");
            int tipo = scanner.nextInt();
            scanner.nextLine();  // consume newline left-over

            System.out.println("Introduce el nombre del descubridor:");
            String descubridor = scanner.nextLine();

            System.out.println("Introduce la era geológica:");
            String eraGeologica = scanner.nextLine();

            System.out.println("Introduce la ubicación del hallazgo:");
            String ubicacionHallazgo = scanner.nextLine();

            if (tipo == 1) {
                Dinosaurio dino = new Dinosaurio();
                dino.setDescubridor(descubridor);
                dino.setFechaDescubrimiento(new Date());
                dino.setEraGeologica(eraGeologica);
                dino.setUbicacionHallazgo(ubicacionHallazgo);

                System.out.println("Introduce el tipo de dinosaurio (Carnívoro, Herbívoro):");
                dino.setTipo(scanner.nextLine());

                System.out.println("Introduce el tamaño del dinosaurio:");
                dino.setTamano(scanner.nextDouble());

                System.out.println("Introduce el peso del dinosaurio:");
                dino.setPeso(scanner.nextDouble());

                museo.registrarEspecimen(dino);
            } else if (tipo == 2) {
                PlantaFosil planta = new PlantaFosil();
                planta.setDescubridor(descubridor);
                planta.setFechaDescubrimiento(new Date());
                planta.setEraGeologica(eraGeologica);
                planta.setUbicacionHallazgo(ubicacionHallazgo);

                System.out.println("Introduce el tipo de planta:");
                planta.setTipoPlanta(scanner.nextLine());

                System.out.println("Introduce el periodo de existencia:");
                planta.setPeriodoExistencia(scanner.nextLine());

                museo.registrarEspecimen(planta);
            } else if (tipo == 3) {
                MamiferoPrehistorico mamifero = new MamiferoPrehistorico();
                mamifero.setDescubridor(descubridor);
                mamifero.setFechaDescubrimiento(new Date());
                mamifero.setEraGeologica(eraGeologica);
                mamifero.setUbicacionHallazgo(ubicacionHallazgo);

                System.out.println("Introduce la dieta del mamífero:");
                mamifero.setDieta(scanner.nextLine());

                System.out.println("Introduce el hábitat del mamífero:");
                mamifero.setHabitat(scanner.nextLine());

                museo.registrarEspecimen(mamifero);
            }
        }

        
        museo.mostrarEspecimenes();

        
        museo.listarTresDinosauriosMasGrandes();

        
        museo.resumenEspecimenesPorDescubridor();
    }
}

