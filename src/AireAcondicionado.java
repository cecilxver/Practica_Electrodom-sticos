public class AireAcondicionado extends Electrodomestico {
    private int temperaturaObjetivo;
    AireAcondicionado(String marca, String modelo, double consumoBase, int temperaturaObjetivo){
        super(marca,modelo,consumoBase);
        this.temperaturaObjetivo=temperaturaObjetivo;
    }

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
