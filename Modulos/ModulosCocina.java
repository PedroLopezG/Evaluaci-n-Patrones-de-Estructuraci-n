package Modulos;

public class ModulosCocina extends ModuloBase{
    private final double precio = 89.99;

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getCodigo() {
        return (int) (Math.random() * (999 - 1)) + 1;
    }
}
