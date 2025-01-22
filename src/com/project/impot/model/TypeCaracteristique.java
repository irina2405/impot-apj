package com.project.impot.model;

import java.sql.Connection;

import bean.CGenUtil;
import bean.ClassMAPTable;

public class TypeCaracteristique extends ClassMAPTable {
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

    public TypeCaracteristique() {
        this.setNomTable("TYPE_CARACTERISTIQUE");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("TPC", "seq_type_caracteristique.NEXTVAL");
        this.setId(makePK(c));
    }

    public static TypeCaracteristique[] getAll() throws Exception {
        TypeCaracteristique t = new TypeCaracteristique();
        return (TypeCaracteristique[]) CGenUtil.rechercher(t, null, null, "");
    }

    public static TypeCaracteristique getById(String id) throws Exception {
        TypeCaracteristique t = new TypeCaracteristique();
        t.setId(id);
        return (TypeCaracteristique) CGenUtil.rechercher(t, null, null, "")[0];
    }
}