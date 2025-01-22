package com.project.impot.model;

import java.sql.Connection;
import bean.ClassMAPTable;
import bean.CGenUtil;

public class Constante extends ClassMAPTable {
    String id;
    String cle;
    String valeur;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public String getAttributIDName() {
        return "id";
    }

    @Override
    public String getTuppleID() {
        return this.id;
    }

    public Constante() {
        this.setNomTable("CONSTANTE");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("CST", "seq_constante.NEXTVAL");
        this.setId(makePK(c));
    }

    public static Constante[] getAll() throws Exception {
        Constante c = new Constante();
        return (Constante[]) CGenUtil.rechercher(c, null, null, "");
    }

    public static Constante getById(String id) throws Exception {
        Constante c = new Constante();
        c.setId(id);
        return (Constante) CGenUtil.rechercher(c, null, null, "")[0];
    }
}
