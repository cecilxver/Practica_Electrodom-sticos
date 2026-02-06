public class AireAcondicionado extends Electrodomestico {
    private int temperaturaObjetivo;
    AireAcondicionado(String marca, String modelo, double consumoBase, int temperaturaObjetivo, String NumeroSerie){
        super(marca,modelo,consumoBase, NumeroSerie);
        this.temperaturaObjetivo=temperaturaObjetivo;
    }

    public int getTemperaturaObjetivo() {
        return temperaturaObjetivo;
    }

    /**
     * Calcula el consumo del aire acondicionado
     */
    @Override
    public double calcularConsumo() {
        double consumo;
        if (!isEncendido()){
consumo=0.0;
        } else if (temperaturaObjetivo <22) {
            consumo=getConsumoBase()*1.5;
        }else {
            consumo=getConsumoBase();
        }
        System.out.println("Consumo: "+consumo);
        return consumo;
    }
}
