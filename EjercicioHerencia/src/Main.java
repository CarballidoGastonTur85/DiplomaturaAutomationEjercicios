public class Main {

        //VEHICULO
    public static void main(String[] args) {
        Vehiculo vehículo = new Vehiculo("Toyota", "Corolla", 2020);
        System.out.println("--- Vehículo ---");
        System.out.println("Marca: " + vehículo.getMarca());
        System.out.println("Modelo: " + vehículo.getModelo());
        System.out.println("Año: " + vehículo.getAño());
        vehículo.acelerar();

        //COCHE
        Coche coche = new Coche("Ford", "Mustang", 2020, 5000);
        System.out.println("--- Coche ---");
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Año: " + coche.getAño());
        System.out.println("Cilindrada: " + coche.getCilindrada());
        coche.acelerar();

    }
}