package BangunBangun;

public class Silinder extends BangunRuang{
    int jari,tinggi;
    double Phi;

    public Silinder(double phi, int jari, int tinggi) {
        Phi = phi;
        this.jari = jari;
        this.tinggi = tinggi;
    }

    double Volume(){
        return Phi*Math.pow(jari,2)*tinggi;
    }

    @Override
    double LuasSelimut(){
        return  2*Phi*jari*tinggi;
    }

    @Override
    double LuasPermukaanTutup(){
        return  2*Phi*jari*(jari+tinggi);
    }

    @Override
    double LuasPermukaanTanpaTutup(){
        return  Phi*jari*(jari+2*tinggi);
    }

    @Override
    public double luas() {
        return 2*Phi*Math.pow(jari,2);
    }

    @Override
    public double keliling() {
        return  2*Phi*jari;
    }
}
