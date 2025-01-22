package com.project.impot.main;

import com.project.impot.model.CaracteristiqueMaison;
import com.project.impot.model.Maison;

public class Main {
    public static void main (String[] args) {
        try {
            CaracteristiqueMaison[] cms = Maison.getCaracteristique("MAIS00001");

            for (CaracteristiqueMaison cm : cms) {
                System.out.println(cm.getId_caracteristique());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
