public class SmartTv {

    /// atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    /// metodos para ligar e desligar a TV
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    /// metodo cujo parametro definira novo canal
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    /// metodos para aumentar e diminuir canais
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    /// metodos para aumentar e diminuir o volume
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
}
