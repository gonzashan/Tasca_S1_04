package n1exercici1;

import java.util.LinkedHashMap;

public class Months {

    LinkedHashMap<Integer, String> linkedHashSet = new LinkedHashMap<Integer, String>();

    public Months(){
        super();
        incialiarMeses();
    }

    public void incialiarMeses() {

        linkedHashSet.put(1, "Gener");
        linkedHashSet.put(2, "Febrer");
        linkedHashSet.put(3, "Març");
        linkedHashSet.put(4, "Abril");
        linkedHashSet.put(5, "Maig");
        linkedHashSet.put(6, "June");
        linkedHashSet.put(7, "Juliol");
        linkedHashSet.put(8, "Agost");
        linkedHashSet.put(9, "September");
        linkedHashSet.put(10, "Octubre");
        linkedHashSet.put(11, "Novembre");
        linkedHashSet.put(12, "Desembre");
    }

    public double calculadora(double a, double b){

        return a+b;
    }

    public String mostrarMes(int value) {

        if (linkedHashSet.containsKey(value)) {
            return linkedHashSet.get(value);
        } else {
            return value + " aquest mes no existeix.";
        }
    }
}
