import java.util.ArrayList;
import java.util.List;

public class Casa {
    public static List<Electrodomestico> misElectrodomesticos = new ArrayList<>();

    /**
     * Comprueba que no existan varios electrodométicos con mismo número de serie
     * @param E Electrodoméstico que se añade
     */
    public void addA(Electrodomestico E){
    boolean existe=false; //creamos un boolean para comprobar que existe
    for (Electrodomestico A:misElectrodomesticos){ //recorremos la lista
        if (A.getNumeroSerie().equals(E.getNumeroSerie())){ //si el número de la serie es igual al de E
            existe=true;//volvemos al boolean true
        }

    }
if (existe){
    System.out.println("No se pudo añadir");
}else {
    misElectrodomesticos.add(E);//como no es igual, añadimos el objeto a la lista
    System.out.println("Añadido correctamente");
}
}

    /**
     * Muestra información de la casa
     * @return
     */

    public String toString(){
        double sumaConsumo = 0;
        for (int i = 0; i <misElectrodomesticos.size() ; i++) { //este bucle sirve para recorrer cada elemento
            //y que muestre la información y haga la suma con cada uno
            System.out.println(misElectrodomesticos.get(i).toString()); //mostramos la info de cada uno
            sumaConsumo+=misElectrodomesticos.get(i).calcularConsumo(); //calculamos el consumo por cada uno, y se va sumando

        }
        String sumaConsumoS="La suma es: "+sumaConsumo; //hacemos el String que se debe devolver
        System.out.println(sumaConsumoS); //mostramos la suma
        return sumaConsumoS;
    }
}
