public class Lavadora extends Electrodomestico {
    private int cargaKg;
    Lavadora(String marca, String modelo, double consumoBase,int cargaKg, String NumeroSerie){
        this.cargaKg=cargaKg;
        super(marca,modelo,consumoBase, NumeroSerie);
    }

    /**
     * Calcula el consumo
     */
    public double calcularConsumo() {
        double consumo;
        if (isEncendido()){
         consumo=getConsumoBase()+(cargaKg*0.2);
        }else{
             consumo=getConsumoBase();
        }
        System.out.println("Consumo: "+consumo);
        return consumo;
    }

}
