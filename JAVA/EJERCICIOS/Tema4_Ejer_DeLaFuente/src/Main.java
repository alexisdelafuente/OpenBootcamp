public class Main {
    public static void main(String[] args) {

        SmartPhone samsungS22 = new SmartPhone("samsung s22","4.000mAh","Amoled x2",6.8f,true,true,true,"256gb",true,"5G","aluminio","carga rapida e inalambrica","octa-core 2.5 gzh","108 megapixeles","48 megapixeles","violeta");

        SmartWatch galaxyWatch = new SmartWatch("galaxywatch","430mAh","Amoled",1.3f,true,false,false,"2gb ram",true,"mediante movil","aluminio","inalambrica","negro","cuerina","incluye 10 app variadas de deportes",true);

        System.out.println("--> " + samsungS22);
        System.out.println(" ");
        System.out.println("--> "+ galaxyWatch);

    }
}
