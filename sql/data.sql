-- Insertion de données générées pour la table MAISON
INSERT INTO maison (id, nom, longueur, largeur, nb_etage, latitude, longitude, impot_base, impot_reel) 
VALUES ('MAIS00001', 'Maison A', 50.5, 30.3, 2, 48.856614, 2.352222, 500.00, 520.00);

INSERT INTO maison (id, nom, longueur, largeur, nb_etage, latitude, longitude, impot_base, impot_reel) 
VALUES ('MAIS00002', 'Maison B', 60.0, 40.5, 3, 43.604652, 1.444209, 600.00, 630.00);

INSERT INTO maison (id, nom, longueur, largeur, nb_etage, latitude, longitude, impot_base, impot_reel) 
VALUES ('MAIS00003', 'Maison C', 45.7, 25.9, 1, 45.764043, 4.835659, 400.00, 420.00);

INSERT INTO maison (id, nom, longueur, largeur, nb_etage, latitude, longitude, impot_base, impot_reel) 
VALUES ('MAIS00004', 'Maison D', 70.2, 50.0, 4, 44.837789, -0.57918, 700.00, 735.00);

INSERT INTO maison (id, nom, longueur, largeur, nb_etage, latitude, longitude, impot_base, impot_reel) 
VALUES ('MAIS00005', 'Maison E', 80.0, 55.0, 5, 48.573405, 7.752111, 800.00, 840.00);

INSERT INTO maison (id, nom, longueur, largeur, nb_etage, latitude, longitude, impot_base, impot_reel) 
VALUES ('MAIS00006', 'Maison F', 35.0, 20.0, 1, 47.218371, -1.553621, 350.00, 367.50);

-- Insertion dans la table maison
INSERT INTO maison (id, nom, longueur, largeur, nb_etage, latitude, longitude, impot_base, impot_reel) 
VALUES ('MAIS00001', 'Maison A', 50.5, 30.3, 2, 48.856614, 2.352222, 500.00, 520.00);

-- Insertion dans la table type_caracteristique
INSERT INTO type_caracteristique (id, nom) VALUES ('TCAR00001', 'Fenêtre');
INSERT INTO type_caracteristique (id, nom) VALUES ('TCAR00002', 'Mur');
INSERT INTO type_caracteristique (id, nom) VALUES ('TCAR00003', 'Toit');

-- Insertion dans la table caracteristique
INSERT INTO caracteristique (id, nom, coeff, id_type_caracteristique) VALUES ('CAR00001', 'Fenêtre en bois', 1.2, 'TCAR00001');
INSERT INTO caracteristique (id, nom, coeff, id_type_caracteristique) VALUES ('CAR00002', 'Fenêtre en PVC', 1.0, 'TCAR00001');
INSERT INTO caracteristique (id, nom, coeff, id_type_caracteristique) VALUES ('CAR00003', 'Mur en béton', 1.5, 'TCAR00002');
INSERT INTO caracteristique (id, nom, coeff, id_type_caracteristique) VALUES ('CAR00004', 'Mur en brique', 1.3, 'TCAR00002');
INSERT INTO caracteristique (id, nom, coeff, id_type_caracteristique) VALUES ('CAR00005', 'Toit en tôle', 1.1, 'TCAR00003');
INSERT INTO caracteristique (id, nom, coeff, id_type_caracteristique) VALUES ('CAR00006', 'Toit en tuile', 1.4, 'TCAR00003');

-- Insertion dans la table caracteristique_maison
INSERT INTO caracteristique_maison (id, id_maison, id_caracteristique) VALUES ('CM00001', 'MAIS00001', 'CAR00001');
INSERT INTO caracteristique_maison (id, id_maison, id_caracteristique) VALUES ('CM00002', 'MAIS00001', 'CAR00003');
INSERT INTO caracteristique_maison (id, id_maison, id_caracteristique) VALUES ('CM00003', 'MAIS00001', 'CAR00005');