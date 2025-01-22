package com.project.impot.model;

import java.sql.Connection;
import bean.ClassMAPTable;
import bean.CGenUtil;

public class Paiement extends ClassMAPTable {
    String id;
    java.sql.Date date_paiement;
    String id_maison;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public java.sql.Date getDate_paiement() {
        return date_paiement;
    }

    public void setDate_paiement(java.sql.Date date_paiement) {
        this.date_paiement = date_paiement;
    }

    public String getId_maison() {
        return id_maison;
    }

    public void setId_maison(String id_maison) {
        this.id_maison = id_maison;
    }

    @Override
    public String getAttributIDName() {
        return "id";
    }

    @Override
    public String getTuppleID() {
        return this.id;
    }

    public Paiement() {
        this.setNomTable("PAIEMENT");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("PAI", "seq_paiement.NEXTVAL");
        this.setId(makePK(c));
    }

    public static Paiement[] getAll() throws Exception {
        Paiement p = new Paiement();
        return (Paiement[]) CGenUtil.rechercher(p, null, null, "");
    }

    public static Paiement getById(String id) throws Exception {
        Paiement p = new Paiement();
        p.setId(id);
        return (Paiement) CGenUtil.rechercher(p, null, null, "")[0];
    }
}