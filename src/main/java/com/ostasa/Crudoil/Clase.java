package com.ostasa.Crudoil;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import org.springframework.boot.web.context.WebServerGracefulShutdownLifecycle;

public class Clase {
    Date Fecha;
    ArrayList<Gasolinera> gasol = new ArrayList<>();

    public ArrayList<Gasolinera> getGasol() {
        return gasol;
    }

    public void setGasol(ArrayList<Gasolinera> gasol) {
        this.gasol = gasol;
    }
}
class Gasolinera{
    @SerializedName("C.P.")
    String CP;
    String Dirección;
    String Horario;
    String Latitud;
    String Localidad;
    @SerializedName("Longitud (WGS84)")
    String Longitud;
    String Margen;
    String Municipio;
    @SerializedName("Precio Biodiesel")
    int PrecioBiodiesel;
    @SerializedName("Precio Bioetanol")
    int PrecioBioetanol;
    @SerializedName("Precio Gas Natural Comprimido")
    int PrecioGasNaturalComprimido;
    @SerializedName("Precio Gas Natural Licuado")
    int PrecioGasNaturalLicuado;
    @SerializedName("Precio Gases licuados del petróleo")
    int PrecioGaseslicuadosdelpetróleo;
    @SerializedName("Precio Gasoleo A")
    int PrecioGasoleoA;
    @SerializedName("Precio Gasoleo B")
    int PrecioGasoleoB;
    @SerializedName("Precio Gasoleo Premium")
    int PrecioGasoleoPremium;
    @SerializedName("Precio Gasolina 95 E10")
    int PrecioGasolina95E10;
    @SerializedName("Precio Gasolina 95 E5")
    int PrecioGasolina95E5;
    @SerializedName("Precio Gasolina 95 E5 Premium")
    int PrecioGasolina95E5Premium;
    @SerializedName("Precio Gasolina 98 E10")
    int PrecioGasolina98E10;
    @SerializedName("Precio Gasolina 98 E5")
    int PrecioGasolina98E5;
    @SerializedName("Precio Hidrogeno")
    int PrecioHidrogeno;
    String Provincia;
    String Remisión;
    String Rótulo;
    @SerializedName("Tipo Venta")
    String TipoVenta;
    @SerializedName("% BioEtanol")
    Double Bioetanol;
    @SerializedName("% Éster metílico")
    Double EsterMetilico;
    String IDEESS;
    String IDMunicipio;
    String IDProvincia;
    String IDCCAA;
}
