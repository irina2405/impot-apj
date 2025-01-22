package com.project.impot.main;

import java.sql.Connection;

import com.project.impot.model.CaracteristiqueMaison;
import com.project.impot.model.Maison;

public class Main {
    public static void main (String[] args) {
        try {
            CaracteristiqueMaison[] cms = Maison.getCaracteristique("MAIS00001");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
