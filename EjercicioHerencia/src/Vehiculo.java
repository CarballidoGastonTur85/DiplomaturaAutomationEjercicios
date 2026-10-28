public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    //CONSTRUCTOR
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    //GETTERS
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    //ACELERAR Y FRENAR
    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }
    public void frenar() {
        System.out.println("El vehículo está frenando");
    }
}
