/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Mike Kara
 */
public class Recipient {

    private int quantite;
    private int capacite;

    public Recipient() {

    }

    public Recipient(int quantite, int capacite) {
        this.quantite = quantite;
        this.capacite = capacite;
    }

    public int getEspaceLibre() {
        return capacite - quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        if (quantite <= capacite) {
            this.quantite = quantite;
        }
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void mettreUnDans(Recipient autre) {
        if (!this.estVide() && !autre.estPlein()) {
            this.setQuantite(quantite - 1);
            autre.setQuantite(quantite + 1);
        }
    }

    public void remplir(Recipient autre) {
        if (autre.getEspaceLibre() <= quantite) {
            autre.setQuantite(autre.getCapacite());
            this.setQuantite(quantite - autre.getEspaceLibre());
        }
    }

    public void viderDans(Recipient autre) {
        if (autre.getEspaceLibre() >= quantite) {
            this.setQuantite(0);
            autre.setQuantite(autre.getQuantite() + quantite);
        }
    }

    public boolean estVide() {
        return (quantite == 0);
    }

    public boolean estPlein() {
        return (quantite == capacite);
    }

}
