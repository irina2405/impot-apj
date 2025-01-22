package com.project.impot.model;

import java.sql.Connection;
import bean.ClassMAPTable;
import bean.CGenUtil;

public class CaracteristiqueMaison extends ClassMAPTable {
    String id;
    String id_maison;
    String id_caracteristique;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_maison() {
        return id_maison;
    }

    public void setId_maison(String id_maison) {
        this.id_maison = id_maison;
    }

    public String getId_caracteristique() {
        return id_caracteristique;
    }

    public void setId_caracteristique(String id_caracteristique) {
        this.id_caracteristique = id_caracteristique;
    }

    @Override
    public String getAttributIDName() {
        return "id";
    }

    @Override
    public String getTuppleID() {
        return this.id;
    }

    public CaracteristiqueMaison() {
        this.setNomTable("CARACTERISTIQUE_MAISON");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("CM", "seq_caracteristique_maison.NEXTVAL");
        this.setId(makePK(c));
    }

    public static CaracteristiqueMaison[] getAll() throws Exception {
        CaracteristiqueMaison cm = new CaracteristiqueMaison();
        return (CaracteristiqueMaison[]) CGenUtil.rechercher(cm, null, null, "");
    }

    public static CaracteristiqueMaison getById(String id) throws Exception {
        CaracteristiqueMaison cm = new CaracteristiqueMaison();
        cm.setId(id);
        return (CaracteristiqueMaison) CGenUtil.rechercher(cm, null, null, "")[0];
    }
}