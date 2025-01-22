package com.project.impot.model;

import java.sql.Connection;
import bean.ClassMAPTable;
import bean.CGenUtil;

public class PointArrondissement extends ClassMAPTable {
    String id;
    double latitude;
    double longitude;
    String id_arrondissement;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getId_arrondissement() {
        return id_arrondissement;
    }

    public void setId_arrondissement(String id_arrondissement) {
        this.id_arrondissement = id_arrondissement;
    }

    @Override
    public String getAttributIDName() {
        return "id";
    }

    @Override
    public String getTuppleID() {
        return this.id;
    }

    public PointArrondissement() {
        this.setNomTable("POINT_ARRONDISSEMENT");
    }

    @Override
    public void construirePK(Connection c) throws Exception {
        this.preparePk("PTA", "seq_point_arrondissement.NEXTVAL");
        this.setId(makePK(c));
    }

    public static PointArrondissement[] getAll() throws Exception {
        PointArrondissement pa = new PointArrondissement();
        return (PointArrondissement[]) CGenUtil.rechercher(pa, null, null, "");
    }

    public static PointArrondissement getById(String id) throws Exception {
        PointArrondissement pa = new PointArrondissement();
        pa.setId(id);
        return (PointArrondissement) CGenUtil.rechercher(pa, null, null, "")[0];
    }
}