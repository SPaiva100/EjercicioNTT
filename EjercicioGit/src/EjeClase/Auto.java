package EjeClase;

public class Auto {
    private String marca;
    private double precio;
    private double vMax;

    public String getMarca() {
        return marca;
    }
    public double getPrecio() {
        return precio;
    }
    public double getvMax() {
        return vMax;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setvMax(double vMax) {
        this.vMax = vMax;
    }
    public void mostrarDatos(){
        if(marca!=null&&precio>0&&vMax>0)
            System.out.println("Marca : "+marca+"\nPrecio : $"+precio+"\nVelocidad máxima : "+vMax+" km/h");
        else
            System.out.println("Modifique los atributos del auto por favor");
    }
}
