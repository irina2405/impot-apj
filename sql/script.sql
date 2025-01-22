CREATE USER impot IDENTIFIED BY impot;
GRANT ALL PRIVILEGES TO impot;
CONNECT impot/impot;

CREATE TABLE maison(
   id VARCHAR2(255),
   nom VARCHAR2(100) NOT NULL,
   longueur NUMBER(15,2) NOT NULL,
   largeur NUMBER(15,2) NOT NULL,
   nb_etage NUMBER(10) NOT NULL,
   latitude NUMBER(9,6) NOT NULL,
   longitude NUMBER(9,6) NOT NULL,
   impot_base NUMBER(15,2) DEFAULT 0,
   impot_reel NUMBER(15,2) DEFAULT 0,
   PRIMARY KEY(id)
);

CREATE TABLE type_caracteristique(
   id VARCHAR2(255),
   nom VARCHAR2(50) NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE caracteristique(
   id VARCHAR2(255),
   nom VARCHAR2(50) NOT NULL,
   coeff NUMBER(15,2) NOT NULL,
   id_type_caracteristique VARCHAR2(255) NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(id_type_caracteristique) REFERENCES type_caracteristique(id)
);

CREATE TABLE paiement(
   id VARCHAR2(255),
   date_paiement DATE NOT NULL,
   id_maison VARCHAR2(255) NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(id_maison) REFERENCES maison(id)
);

CREATE TABLE constante(
   id VARCHAR2(255),
   cle CLOB NOT NULL,
   valeur CLOB NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE arrondissement(
   id VARCHAR2(255),
   nom VARCHAR2(50) NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE point_arrondissement(
   id VARCHAR2(255),
   latitude NUMBER(9,6) NOT NULL,
   longitude NUMBER(9,6) NOT NULL,
   id_arrondissement VARCHAR2(255) NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(id_arrondissement) REFERENCES arrondissement(id)
);

CREATE TABLE caracteristique_maison(
   id VARCHAR2(255) NOT NULL,
   id_maison VARCHAR2(255),
   id_caracteristique VARCHAR2(255),
   PRIMARY KEY(id),
   FOREIGN KEY(id_maison) REFERENCES maison(id),
   FOREIGN KEY(id_caracteristique) REFERENCES caracteristique(id)
);