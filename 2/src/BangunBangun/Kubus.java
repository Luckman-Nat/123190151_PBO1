package BangunBangun;

public class Kubus extends BangunRuang{
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    double Volume(){
        return Math.pow(sisi,3);
    }

    @Override
    double LuasPermukaan(){
        return  6*Math.pow(sisi,2);
    }

    @Override
    public double luas() {
        return sisi*sisi;
    }

    @Override
    public double keliling() {
        return 4*sisi;
    }
}
