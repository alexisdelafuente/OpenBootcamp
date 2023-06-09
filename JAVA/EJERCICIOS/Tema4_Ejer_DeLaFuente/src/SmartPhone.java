public class SmartPhone extends SmartDevice {
    String procesador;
    String camaraTrasera;
    String camaraFrontal;

    public SmartPhone(){
    }


    public SmartPhone(String modelo, String bateria, String tipopantalla, Float tamPantalla, boolean resisteAgua, boolean camara, boolean parlanteAltavoz, String cantMemoria, boolean gps, String conexion, String material, String carga, String procesador, String camaraTrasera, String camaraFrontal, String color) {
        super(modelo,bateria, tipopantalla, tamPantalla, resisteAgua, camara, parlanteAltavoz, cantMemoria, gps, conexion, material, carga, color );
        this.procesador = procesador;
        this.camaraTrasera = camaraTrasera;
        this.camaraFrontal = camaraFrontal;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "procesador='" + procesador + '\'' +
                ", camaraTrasera='" + camaraTrasera + '\'' +
                ", camaraFrontal='" + camaraFrontal + '\'' +
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
