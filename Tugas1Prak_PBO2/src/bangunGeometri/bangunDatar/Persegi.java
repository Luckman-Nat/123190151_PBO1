package bangunGeometri.bangunDatar;

public class Persegi implements BangunDatar {
    int sisi;
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling(){
        return  4*sisi;
    }
}
