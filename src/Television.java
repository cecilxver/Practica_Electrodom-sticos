public class Television extends Electrodomestico{
    private int pulgadas;
    Television(String marca, String modelo, double consumoBase,int pulgadas){
        this.pulgadas=pulgadas;
        super(marca,modelo,consumoBase);
    }

    @Override
    public double calcularConsumo() {
        double consumo;
        if(isEncendido()){
            consumo=0;
        } else if (pulgadas>40) {
            consumo=getConsumoBase()*1.3;
        }else {
            consumo=getConsumoBase();

        }
        System.out.println("Consumo: "+consumo);
        return consumo;
    }
}
