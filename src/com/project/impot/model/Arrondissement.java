package com.project.impot.model;

import java.sql.Connection;
import bean.ClassMAPTable;
import bean.CGenUtil;

public class Arrondissement extends ClassMAPTable {
    String id;
    String nom;

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

    @Override
    public String getAttributIDName() {
        return "id";
    }

    @Override
    public String getTuppleID() {
        return this.id;
    }

    public Arrondissement() {
        this.setNomTable("ARRONDISSEMENT");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("ARR", "seq_arrondissement.NEXTVAL");
        this.setId(makePK(c));
    }

    public static Arrondissement[] getAll() throws Exception {
        Arrondissement a = new Arrondissement();
        return (Arrondissement[]) CGenUtil.rechercher(a, null, null, "");
    }

    public static Arrondissement getById(String id) throws Exception {
        Arrondissement a = new Arrondissement();
        a.setId(id);
        return (Arrondissement) CGenUtil.rechercher(a, null, null, "")[0];
    }
}
