package BangunBangun;

public class Kubus extends BangunRuang{
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public double LuasAlas(){
        return sisi * sisi;
    }

    double KelilingAlas(){
        return  4*sisi;
    }

    double Volume(){
        return Math.pow(sisi,3);
    }

    @Override
    double LuasPermukaan(){
        return  6*Math.pow(sisi,2);
    }
}
