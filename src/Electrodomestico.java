public abstract class  Electrodomestico {
 private final String marca;
 private final String modelo;
private final double consumoBase;
private boolean encendido=false;
Electrodomestico(String marca, String modelo, double consumoBase){
    this.marca=marca;
    this.modelo =modelo;
    this.consumoBase=consumoBase;
}

    /**
     * Comprueba si está encendido.
     * @return
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * Enciende
     * @return
     */
    public boolean encender(){
    return encendido=true;
    }

    /**
     * Apaga
     * @return
     */
    public boolean apagar(){
    return encendido=false;
    }

    /**
     * Muestra el consumo base
     * @return
     */
    public double getConsumoBase() {
        return consumoBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    /**
     * Calcula consumo
     * @return
     */
    public abstract double calcularConsumo();


    public String toString() {
        String info="Marca: "+marca+" Modelo: "+modelo+" Consumo base: "+consumoBase+" Encendido: "+encendido;
return info;
    }
}
