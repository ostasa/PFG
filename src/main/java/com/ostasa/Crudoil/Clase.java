package com.ostasa.Crudoil;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Clase {
    Date Fecha;
    ArrayList<Gasolinera> gasol = new ArrayList<>();

    public ArrayList<Gasolinera> getGasol() {
        return gasol;
    }

    public void setGasol(ArrayList<Gasolinera> gasol) {
        this.gasol = gasol;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
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
    public String getCP() {
        return CP;
    }
    public void setCP(String cP) {
        CP = cP;
    }
    public String getDirección() {
        return Dirección;
    }
    public void setDirección(String dirección) {
        Dirección = dirección;
    }
    public String getHorario() {
        return Horario;
    }
    public void setHorario(String horario) {
        Horario = horario;
    }
    public String getLatitud() {
        return Latitud;
    }
    public void setLatitud(String latitud) {
        Latitud = latitud;
    }
    public String getLocalidad() {
        return Localidad;
    }
    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }
    public String getLongitud() {
        return Longitud;
    }
    public void setLongitud(String longitud) {
        Longitud = longitud;
    }
    public String getMargen() {
        return Margen;
    }
    public void setMargen(String margen) {
        Margen = margen;
    }
    public String getMunicipio() {
        return Municipio;
    }
    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }
    public int getPrecioBiodiesel() {
        return PrecioBiodiesel;
    }
    public void setPrecioBiodiesel(int precioBiodiesel) {
        PrecioBiodiesel = precioBiodiesel;
    }
    public int getPrecioBioetanol() {
        return PrecioBioetanol;
    }
    public void setPrecioBioetanol(int precioBioetanol) {
        PrecioBioetanol = precioBioetanol;
    }
    public int getPrecioGasNaturalComprimido() {
        return PrecioGasNaturalComprimido;
    }
    public void setPrecioGasNaturalComprimido(int precioGasNaturalComprimido) {
        PrecioGasNaturalComprimido = precioGasNaturalComprimido;
    }
    public int getPrecioGasNaturalLicuado() {
        return PrecioGasNaturalLicuado;
    }
    public void setPrecioGasNaturalLicuado(int precioGasNaturalLicuado) {
        PrecioGasNaturalLicuado = precioGasNaturalLicuado;
    }
    public int getPrecioGaseslicuadosdelpetróleo() {
        return PrecioGaseslicuadosdelpetróleo;
    }
    public void setPrecioGaseslicuadosdelpetróleo(int precioGaseslicuadosdelpetróleo) {
        PrecioGaseslicuadosdelpetróleo = precioGaseslicuadosdelpetróleo;
    }
    public int getPrecioGasoleoA() {
        return PrecioGasoleoA;
    }
    public void setPrecioGasoleoA(int precioGasoleoA) {
        PrecioGasoleoA = precioGasoleoA;
    }
    public int getPrecioGasoleoB() {
        return PrecioGasoleoB;
    }
    public void setPrecioGasoleoB(int precioGasoleoB) {
        PrecioGasoleoB = precioGasoleoB;
    }
    public int getPrecioGasoleoPremium() {
        return PrecioGasoleoPremium;
    }
    public void setPrecioGasoleoPremium(int precioGasoleoPremium) {
        PrecioGasoleoPremium = precioGasoleoPremium;
    }
    public int getPrecioGasolina95E10() {
        return PrecioGasolina95E10;
    }
    public void setPrecioGasolina95E10(int precioGasolina95E10) {
        PrecioGasolina95E10 = precioGasolina95E10;
    }
    public int getPrecioGasolina95E5() {
        return PrecioGasolina95E5;
    }
    public void setPrecioGasolina95E5(int precioGasolina95E5) {
        PrecioGasolina95E5 = precioGasolina95E5;
    }
    public int getPrecioGasolina95E5Premium() {
        return PrecioGasolina95E5Premium;
    }
    public void setPrecioGasolina95E5Premium(int precioGasolina95E5Premium) {
        PrecioGasolina95E5Premium = precioGasolina95E5Premium;
    }
    public int getPrecioGasolina98E10() {
        return PrecioGasolina98E10;
    }
    public void setPrecioGasolina98E10(int precioGasolina98E10) {
        PrecioGasolina98E10 = precioGasolina98E10;
    }
    public int getPrecioGasolina98E5() {
        return PrecioGasolina98E5;
    }
    public void setPrecioGasolina98E5(int precioGasolina98E5) {
        PrecioGasolina98E5 = precioGasolina98E5;
    }
    public int getPrecioHidrogeno() {
        return PrecioHidrogeno;
    }
    public void setPrecioHidrogeno(int precioHidrogeno) {
        PrecioHidrogeno = precioHidrogeno;
    }
    public String getProvincia() {
        return Provincia;
    }
    public void setProvincia(String provincia) {
        Provincia = provincia;
    }
    public String getRemisión() {
        return Remisión;
    }
    public void setRemisión(String remisión) {
        Remisión = remisión;
    }
    public String getRótulo() {
        return Rótulo;
    }
    public void setRótulo(String rótulo) {
        Rótulo = rótulo;
    }
    public String getTipoVenta() {
        return TipoVenta;
    }
    public void setTipoVenta(String tipoVenta) {
        TipoVenta = tipoVenta;
    }
    public Double getBioetanol() {
        return Bioetanol;
    }
    public void setBioetanol(Double bioetanol) {
        Bioetanol = bioetanol;
    }
    public Double getEsterMetilico() {
        return EsterMetilico;
    }
    public void setEsterMetilico(Double esterMetilico) {
        EsterMetilico = esterMetilico;
    }
    public String getIDEESS() {
        return IDEESS;
    }
    public void setIDEESS(String iDEESS) {
        IDEESS = iDEESS;
    }
    public String getIDMunicipio() {
        return IDMunicipio;
    }
    public void setIDMunicipio(String iDMunicipio) {
        IDMunicipio = iDMunicipio;
    }
    public String getIDProvincia() {
        return IDProvincia;
    }
    public void setIDProvincia(String iDProvincia) {
        IDProvincia = iDProvincia;
    }
    public String getIDCCAA() {
        return IDCCAA;
    }
    public void setIDCCAA(String iDCCAA) {
        IDCCAA = iDCCAA;
    }
}
