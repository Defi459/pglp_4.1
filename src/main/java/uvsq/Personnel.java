package uvsq;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel {

    private final String nom;
    private final String prenom;
    private final String fonction;
    private final java.time.LocalDate naissance;
    private final List<String> numerotel;

    public static class Builder {

        private final String nom;
        private final String prenom;
        private final String fonction;
        private java.time.LocalDate naissance = java.time.LocalDate.now();
        private List<String> numerotel = new ArrayList<>();

        public Builder ( String nom, String prenom, String fonction){
            this.nom = nom;
            this.prenom = prenom;
            this.fonction = fonction;
        }

        public Builder addphone(String tel){
            this.numerotel.add(tel);
            return this;
        }

        public Builder naissance(java.time.LocalDate time ){
            this.naissance = time;
            return this;
        }

        public Personnel build(){
            return new Personnel(this);
        }
    }

    private Personnel(Builder build){
        this.nom = build.nom;
        this.prenom = build.prenom;
        this.naissance = build.naissance;
        this.fonction = build.fonction;
        this.numerotel = build.numerotel;
    }




}
