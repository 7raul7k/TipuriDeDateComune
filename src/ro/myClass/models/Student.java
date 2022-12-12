package ro.myClass.models;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String nume;
    private String prenume;
    private int varsta;
    private double medie;
    private int anStudiu;

    public Student(String nume, String prenume, int varsta, double medie, int anStudiu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.medie = medie;
        this.anStudiu = anStudiu;
    }

    public String descriere(){
        String text = "";
        text += "Nume : " + nume;
        text += "\n Prenume: "+ prenume;
        text += "\n Varsta: " + varsta;
        text += "\n Medie: " + medie;
        text += "\n An Studiu: " + anStudiu;
        text += "\n=============================================\n";
        return text;
    }
    @Override
    public String toString(){
        return nume+","+prenume+","+varsta+","+medie+","+anStudiu+",";
    }
    @Override
    public boolean equals(Object obj){
        Student s = (Student) obj;
        if(this.nume.equals(s.getNume()) &&this.prenume.equals(s.getPrenume())&&this.varsta==s.varsta&& this.medie==s.medie && this.anStudiu==s.anStudiu){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student o) {
        if (this.varsta < o.varsta) {
            return 1;
        } else if (this.varsta > o.varsta) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }
}
