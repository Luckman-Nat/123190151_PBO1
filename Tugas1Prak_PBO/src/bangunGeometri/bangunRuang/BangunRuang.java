package bangunGeometri.bangunRuang;

import bangunGeometri.bangunDatar.BangunDatar;

public abstract class BangunRuang implements BangunDatar {
    public abstract double Volume();
    public double LuasPermukaan(){
        return 0;
    }
    public double LuasSelimut(){
        return 0;
    }
    public double LuasPermukaanTutup(){
        return 0;
    }
    public double LuasPermukaanTanpaTutup(){
        return 0;
    }
}
