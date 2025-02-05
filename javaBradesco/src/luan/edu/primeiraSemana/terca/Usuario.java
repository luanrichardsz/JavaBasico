package luan.edu.primeiraSemana.terca;

public class Usuario {
    public static void main(String [] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println( "TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.mudarCanal(2);
        System.out.println("Canal Atual: " + smartTV.canal);

        smartTV.ligar();
        System.out.println( "Agora, TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println( "Agora, TV Ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("Volume Atual: " + smartTV.volume);
    }
}
