public class Coche extends Vehiculo{
    private int cilindrada;

    public Coche(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    //GETTER Y SETTER
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar(){
        System.out.println("El coche está acelerando");
    }
}
