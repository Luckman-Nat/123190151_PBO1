package BangunBangun;

public class Balok extends BangunRuang{
    int panjang,lebar,tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double Volume(){
        return panjang*lebar*tinggi;
    }

    @Override
    double LuasPermukaan(){
        return  2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }


    public double luas() {
        return panjang*lebar;
    }


    public double keliling() {
        return  (2*panjang)+(2*lebar);
    }
}
