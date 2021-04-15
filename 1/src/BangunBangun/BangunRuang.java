package BangunBangun;

public abstract class BangunRuang {
    abstract double LuasAlas();
    abstract double KelilingAlas();
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
