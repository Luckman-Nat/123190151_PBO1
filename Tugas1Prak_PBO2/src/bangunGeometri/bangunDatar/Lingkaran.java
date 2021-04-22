package bangunGeometri.bangunDatar;

public class Lingkaran implements BangunDatar {
    int jari;
    double Phi;

    public Lingkaran(int jari, double Phi) {
        this.jari = jari;
        this.Phi = Phi;
    }
    @Override
    public double luas(){
        return Phi* Math.pow(jari,2);
    }

    @Override
    public double keliling(){
        return 2*Phi*jari;
    }
}
