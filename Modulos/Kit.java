package Modulos;

import java.util.ArrayList;
import java.util.List;

public class Kit extends ModuloBase{
    protected List<Modulos> kit = new ArrayList<>();






    @Override
    public double getPrecio() {
        return 0;
    }

    @Override
    public int getCodigo() {
        return (int) (Math.random() * (999 - 1)) + 1;
    }
}
