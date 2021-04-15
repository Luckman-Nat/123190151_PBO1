package BangunBangun;

public class Segitiga implements BangunDatar{
    int tinggi,alas;

    public Segitiga(int tinggi, int alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    @Override
    public double luas(){
        return 0.5*alas*tinggi;
    }

    @Override
    public double keliling(){
        double miring;
        miring = Math.sqrt( Math.pow(tinggi,2) + Math.pow(alas,2) );
        return tinggi + miring + alas;
    }
}
