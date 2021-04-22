package bangunGeometri.bangunRuang;

public class Balok extends BangunRuang{
    int panjang,lebar,tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

     public double Volume(){
        return panjang*lebar*tinggi;
    }

    @Override
    public double LuasPermukaan(){
        return  2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }


    public double luas() {
        return panjang*lebar;
    }


    public double keliling() {
        return  (2*panjang)+(2*lebar);
    }
}
