public class SmartWatch extends SmartDevice{
    String tipoMalla;
    String appDepor;
    boolean medCardiaco;

    public SmartWatch(){
    }

    public SmartWatch(String modelo,String bateria, String tipopantalla, Float tamPantalla, boolean resisteAgua, boolean camara, boolean parlanteAltavoz, String cantMemoria, boolean gps, String conexion, String material, String carga, String color, String tipoMalla, String appDepor, boolean medCardiaco) {
        super(modelo,bateria, tipopantalla, tamPantalla, resisteAgua, camara, parlanteAltavoz, cantMemoria, gps, conexion, material, carga, color);
        this.tipoMalla = tipoMalla;
        this.appDepor = appDepor;
        this.medCardiaco = medCardiaco;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoMalla='" + tipoMalla + '\'' +
                ", appDepor='" + appDepor + '\'' +
                ", medCardiaco=" + medCardiaco +
                ", modelo='" + modelo + '\'' +
                ", bateria='" + bateria + '\'' +
                ", tipopantalla='" + tipopantalla + '\'' +
                ", tamPantalla=" + tamPantalla +
                ", resisteAgua=" + resisteAgua +
                ", camara=" + camara +
                ", parlanteAltavoz=" + parlanteAltavoz +
                ", cantMemoria='" + cantMemoria + '\'' +
                ", gps=" + gps +
                ", conexion='" + conexion + '\'' +
                ", material='" + material + '\'' +
                ", carga='" + carga + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
