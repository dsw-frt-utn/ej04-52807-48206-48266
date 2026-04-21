package domain;

import java.time.LocalDate;

public class VehiculoCombustible extends Vehiculo {

    private double kilometrosPorLitro;
    private double litrosExtra;

    // Constructor completo
    public VehiculoCombustible(String patente, String marca, String modelo,
                               int anio, double capacidadCarga,
                               Sucursal sucursal,
                               double kilometrosPorLitro,
                               double litrosExtra) {

        super(VehiculoTipo.COMBUSTIBLE, patente, marca, modelo, anio, capacidadCarga, sucursal);

        this.kilometrosPorLitro = kilometrosPorLitro;
        this.litrosExtra = litrosExtra;
    }

    // Constructor usado desde formulario
    public VehiculoCombustible(String patente, String sucursal,
                               double capacidad, int anio,
                               double kmLitro, double litrosExtra) {

        super(VehiculoTipo.COMBUSTIBLE, patente, "", "", anio,
              capacidad, new Sucursal(sucursal));

        this.kilometrosPorLitro = kmLitro;
        this.litrosExtra = litrosExtra;
    }

    // Constructor básico
    public VehiculoCombustible(String patente, String sucursal,
                               double capacidad, int anio) {

        super(VehiculoTipo.COMBUSTIBLE, patente, "", "", anio,
              capacidad, new Sucursal(sucursal));

        this.kilometrosPorLitro = 12;
        this.litrosExtra = 2;
    }

    public double getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

    @Override
    public double calcularConsumo(double kilometros) {

        double extras = 0;

        if (LocalDate.now().getYear() - anio > 5) {
            extras = (kilometros / 15) * litrosExtra;
        }

        return (kilometros / kilometrosPorLitro) + extras;
    }
}