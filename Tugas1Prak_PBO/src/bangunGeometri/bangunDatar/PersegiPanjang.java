package bangunGeometri.bangunDatar;

public class PersegiPanjang implements BangunDatar {
    int panjang,lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas(){
        return panjang * lebar;
    }

    @Override
    public double keliling(){
        return (2*panjang)+(2*lebar);
    }
}
