package Lista06.Q15;

class SmartTV implements ConectavelWifi, ConectavelBluetooth {

    public void conectarWifi() {
        System.out.println("SmartTV conectada ao Wi-Fi");
    }

    public void conectarBluetooth() {
        System.out.println("SmartTV conectada ao Bluetooth");
    }

}
