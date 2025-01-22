-- Séquence pour la table maison
CREATE SEQUENCE seq_maison
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Séquence pour la table type_caracteristique
CREATE SEQUENCE seq_type_caracteristique
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Séquence pour la table caracteristique
CREATE SEQUENCE seq_caracteristique
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Séquence pour la table paiement
CREATE SEQUENCE seq_paiement
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Séquence pour la table constante
CREATE SEQUENCE seq_constante
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Séquence pour la table arrondissement
CREATE SEQUENCE seq_arrondissement
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Séquence pour la table point_arrondissement
CREATE SEQUENCE seq_point_arrondissement
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Séquence pour la table caracteristique_maison
CREATE SEQUENCE seq_caracteristique_maison
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;
