import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Museo {
    List<Especimen> especimenes = new ArrayList<>();

    void registrarEspecimen(Especimen especimen) {
        especimenes.add(especimen);
    }

    void mostrarEspecimenes() {
        for (Especimen especimen : especimenes) {
            System.out.println(especimen);
        }
    }

    void listarTresDinosauriosMasGrandes() {
        List<Dinosaurio> dinosaurios = new ArrayList<>();
        for (Especimen especimen : especimenes) {
            if (especimen instanceof Dinosaurio) {
                dinosaurios.add((Dinosaurio) especimen);
            }
        }
        dinosaurios.sort(Comparator.comparing(Dinosaurio::getTamano).reversed());
        for (int i = 0; i < 3 && i < dinosaurios.size(); i++) {
            System.out.println(dinosaurios.get(i));
        }
    }

    void resumenEspecimenesPorDescubridor() {
        Map<String, List<Especimen>> resumen = new HashMap<>();
        for (Especimen especimen : especimenes) {
            String descubridor = especimen.getDescubridor();
            if (!resumen.containsKey(descubridor)) {
                resumen.put(descubridor, new ArrayList<>());
            }
            resumen.get(descubridor).add(especimen);
        }
        for (Map.Entry<String, List<Especimen>> entry : resumen.entrySet()) {
            System.out.println("Descubridor: " + entry.getKey());
            for (Especimen especimen : entry.getValue()) {
                System.out.println(especimen);
            }
        }
    }
}

