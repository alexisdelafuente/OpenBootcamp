public class SmartDevice {
    //Atributos
    protected String modelo;
    protected String bateria;
    protected String tipopantalla;
    protected Float tamPantalla;
    protected boolean resisteAgua;
    protected boolean camara;
    protected boolean parlanteAltavoz;
    protected String cantMemoria;
    protected boolean gps;
    protected String conexion;
    protected String material;
    protected String carga;
    protected String color;

    //2.CONSTRUCTORES
    public SmartDevice(){}

    public SmartDevice(String modelo,String bateria, String tipopantalla, Float tamPantalla, boolean resisteAgua, boolean camara, boolean parlanteAltavoz, String cantMemoria, boolean gps, String conexion, String material, String carga,String color) {
        this.modelo=modelo;
        this.bateria = bateria;
        this.tipopantalla = tipopantalla;
        this.tamPantalla = tamPantalla;
        this.resisteAgua = resisteAgua;
        this.camara = camara;
        this.parlanteAltavoz = parlanteAltavoz;
        this.cantMemoria = cantMemoria;
        this.gps = gps;
        this.conexion = conexion;
        this.material = material;
        this.carga = carga;
        this.color=color;

    }
}
