package com.example.appelprojet.mertier;

import javax.persistence.*;

@Entity
public class Salle {
    /*----- Propriétés -----*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CodeS")
    private long idSalle;
    private String nomSalle;

    /*----- Constructeur -----*/

    public Salle() {
    }

    public Salle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    /*----- Getter/Setter -----*/

    public long getIdSalle() {return idSalle;}
    public void setIdSalle(long idSalle) {this.idSalle = idSalle;}
    public String getNomSalle() {return nomSalle;}
    public void setNomSalle(String nomSalle) {this.nomSalle = nomSalle;}

    @java.lang.Override
    public java.lang.String toString() {
        return "Salle{" +
                "idSalle=" + idSalle +
                ", nomSalle='" + nomSalle + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Salle salle = (Salle) object;
        return idSalle == salle.idSalle;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), idSalle);
    }
}
