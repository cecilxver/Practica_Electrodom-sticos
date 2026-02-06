public class Main {
    public static void main(String[] args)  {
Lavadora Hisense= new Lavadora("Hisense","A23-2",0.0,230, "12"); //creamos el objeto
Hisense.encender(); //encendemos el objeto
Hisense.calcularConsumo();//comprobamos su consumo
Television Samsung= new Television("Samsung", "A-1232", 15.0,50, "52");
Samsung.encender();
Samsung.calcularConsumo();
AireAcondicionado Xiaomi= new AireAcondicionado("Samsung", "Ak-47", 23.5,20, "52");
Xiaomi.encender();
Xiaomi.apagar();
Xiaomi.calcularConsumo();
Casa Uno= new Casa(); //creamos una casa
Uno.addA(Hisense);//añadimos electrodomésticos a la casa
Uno.addA(Xiaomi);
Uno.addA(Samsung);
Uno.toString(); //mostramos los datos de la casa
System.out.println(Uno.misElectrodomesticos); //mostramos los electrodomésticos
Xiaomi.getIdentificador();

    }
}