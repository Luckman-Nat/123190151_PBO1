package bangunGeometri.bangunRuang;

public class Silinder extends BangunRuang{
    int jari,tinggi;
    double Phi;

    public Silinder(double phi, int jari, int tinggi) {
        Phi = phi;
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double Volume(){
        return Phi*Math.pow(jari,2)*tinggi;
    }

    @Override
    public double LuasSelimut(){
        return  2*Phi*jari*tinggi;
    }

    @Override
    public double LuasPermukaanTutup(){
        return  2*Phi*jari*(jari+tinggi);
    }

    @Override
    public double LuasPermukaanTanpaTutup(){
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
