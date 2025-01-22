package com.project.impot.model;

import java.sql.Connection;

import bean.CGenUtil;
import bean.ClassMAPTable;

public class Maison extends ClassMAPTable {
    String id;
    String nom;
    double longueur;
    double largeur;
    int nb_etage;
    double latitude;
    double longitude;
    double impot_base;
    double impot_reel;

    public String getId() {
        return id;
    }

    public void setId(String id_maison) {
        this.id = id_maison;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public int getNb_etage() {
        return nb_etage;
    }

    public void setNb_etage(int nb_etage) {
        this.nb_etage = nb_etage;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getImpot_base() {
        return impot_base;
    }

    public void setImpot_base(double impot_base) {
        this.impot_base = impot_base;
    }

    public double getImpot_reel() {
        return impot_reel;
    }

    public void setImpot_reel(double impot_reel) {
        this.impot_reel = impot_reel;
    }

    @Override
    public String getAttributIDName() {
        return "id_maison";
    }

    @Override
    public String getTuppleID() {
        return this.id;
    }

    public Maison() {
        this.setNomTable("MAISON");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("MAS", "seq_maison.NEXTVAL");
        this.setId(makePK(c));
    }

    public static Maison[] getAll() throws Exception {
        Maison m = new Maison();
        Maison[] res = (Maison[]) CGenUtil.rechercher(m, null, null, "");
        return res;
    }

    public static Maison getById(String id_maison) throws Exception {
        Maison m = new Maison();
        m.setId(id_maison);
        m = (Maison) CGenUtil.rechercher(m, null, null, "")[0];
        return m;
    }

    public void insert(Connection connection) throws Exception {
        this.insertToTable(connection);
    }

    public void insert() throws Exception {
        this.insertToTable();
    }

    public static CaracteristiqueMaison[] getCaracteristique (String idMaison, Connection connection) throws Exception {
        CaracteristiqueMaison cm = new CaracteristiqueMaison();
        return ((CaracteristiqueMaison[]) CGenUtil.rechercher(cm, "SELECT * FROM caracteristique_maison WHERE id_maison = '" + idMaison + "'", connection));
    }

    public static CaracteristiqueMaison[] getCaracteristique (String idMaison) throws Exception {
        CaracteristiqueMaison cm = new CaracteristiqueMaison();
        return ((CaracteristiqueMaison[]) CGenUtil.rechercher(cm, "SELECT * FROM caracteristique_maison WHERE id_maison = '" + idMaison + "'"));
    }
}
