package com.example.appelprojet.mertier;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("scolarite")
public class Scolarite extends Utilisateur{
    //    Priorietes

    //    Relations
    //    Scolarite-Justificatifs
    @OneToMany(mappedBy = "scolarite", fetch = FetchType.LAZY)
    private Set<Justificatif> justificatifs = new HashSet(0);

    //    Scolarite-Formations
    @OneToMany(mappedBy = "scolarite", fetch = FetchType.LAZY)
    private Set<Formation> formations = new HashSet(0);

    //    Contructeur
    public Scolarite() {
    }


    //    getter and setter

    public Set<Justificatif> getJustificatifs() {
        return justificatifs;
    }

    public void setJustificatifs(Set<Justificatif> justificatifs) {
        this.justificatifs = justificatifs;
    }

    //    toString

    //    equals and hashCode
    public int hashCode() {return super.hashCode();}

    @Override
    public boolean equals(Object o) {return super.equals(o);}
}