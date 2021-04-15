package BangunBangun;

public abstract class BangunRuang implements BangunDatar {
    abstract double Volume();
    double LuasPermukaan(){
        return 0;
    }
    double LuasSelimut(){
        return 0;
    }
    double LuasPermukaanTutup(){
        return 0;
    }
    double LuasPermukaanTanpaTutup(){
        return 0;
    }
}
