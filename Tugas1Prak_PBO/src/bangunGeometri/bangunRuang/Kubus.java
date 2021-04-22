package bangunGeometri.bangunRuang;

public class Kubus extends BangunRuang{
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public double Volume(){
        return Math.pow(sisi,3);
    }

    @Override
    public double LuasPermukaan(){
        return  6*Math.pow(sisi,2);
    }

    public double luas() {
        return sisi*sisi;
    }

    public double keliling() {
        return 4*sisi;
    }
}
