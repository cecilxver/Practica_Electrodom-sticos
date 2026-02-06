public abstract class  Electrodomestico {
 private final String marca;
 private final String modelo;
private final double consumoBase;
private String NumeroSerie="0";
private boolean encendido=false;
Electrodomestico(String marca, String modelo, double consumoBase, String NumeroSerie ){
    this.marca=marca;
    this.modelo =modelo;
    this.consumoBase=consumoBase;
    this.NumeroSerie=NumeroSerie;
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
     *
     */
    public boolean apagar(){
    return encendido=false;
    }

    /**
     * Muestra el consumo base
     */
    public double getConsumoBase() {
        return consumoBase;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
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


    /**
     * Devuelve información del electrodoméstico
     * @return
     */
    public String toString() {
        String info="Marca: "+marca+" Modelo: "+modelo+" Consumo base: "+consumoBase+" Encendido: "+encendido;
return info;
    }

    /**
     * EXTRA: Devuelve la marca y al modelo
     */
    public final String getIdentificador(){
        String info="Marca: "+marca+"\nModelo: "+modelo;
        return info;
    }
    //El error que sale es:
    // 'getIdentificador()' cannot override 'getIdentificador()' in 'Electrodomestico'; overridden method is final

}
