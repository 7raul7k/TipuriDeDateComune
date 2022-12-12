package ro.myClass.models;

import java.util.Comparator;

public class Masina implements Comparable<Masina> {
    private String owner;
    private String marca;
    private int an;
    private String tipCombustibil;

    public Masina(String owner, String marca, int an, String tipCombustibil) {
        this.owner = owner;
        this.marca = marca;
        this.an = an;
        this.tipCombustibil = tipCombustibil;
    }

    public String descriere(){
        String text = "";
        text += "Owner : " + owner;
        text += "\n Marca: " + marca;
        text += "\nAn fabricatie : " + an;
        text += "\n Tip combustibil: " + tipCombustibil;
        text += "\n====================================================\n";
        return text;
    }

    @Override
    public String toString(){
        return owner+","+marca+","+an+","+tipCombustibil;
    }

    @Override
    public boolean equals(Object obj){
        Masina m = (Masina) obj;
        if(this.owner.equals(m.getOwner())&&this.marca.equals(m.getMarca())&& this.an==m.getAn() && this.tipCombustibil.equals(m.getTipCombustibil())){
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Masina o) {
        if (this.an < o.getAn()) {
            return 1;
        } else if (this.an > o.getAn()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getTipCombustibil() {
        return tipCombustibil;
    }

    public void setTipCombustibil(String tipCombustibil) {
        this.tipCombustibil = tipCombustibil;
    }
}
