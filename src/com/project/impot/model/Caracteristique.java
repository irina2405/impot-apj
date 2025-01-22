package com.project.impot.model;

import java.sql.Connection;
import bean.ClassMAPTable;
import bean.CGenUtil;

public class Caracteristique extends ClassMAPTable {
    String id;
    String nom;
    double coeff;
    String id_type_caracteristique;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCoeff() {
        return coeff;
    }

    public void setCoeff(double coeff) {
        this.coeff = coeff;
    }

    public String getId_type_caracteristique() {
        return id_type_caracteristique;
    }

    public void setId_type_caracteristique(String id_type_caracteristique) {
        this.id_type_caracteristique = id_type_caracteristique;
    }

    @Override
    public String getAttributIDName() {
        return "id";
    }

    @Override
    public String getTuppleID() {
        return this.id;
    }

    public Caracteristique() {
        this.setNomTable("CARACTERISTIQUE");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("CAR", "seq_caracteristique.NEXTVAL");
        this.setId(makePK(c));
    }

    public static Caracteristique[] getAll() throws Exception {
        Caracteristique c = new Caracteristique();
        return (Caracteristique[]) CGenUtil.rechercher(c, null, null, "");
    }

    public static Caracteristique getById(String id) throws Exception {
        Caracteristique c = new Caracteristique();
        c.setId(id);
        return (Caracteristique) CGenUtil.rechercher(c, null, null, "")[0];
    }
}