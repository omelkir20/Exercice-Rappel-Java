public class Compte {

    private String titulaire;
    private double solde;

    public Compte(String titulaire) {
        this.titulaire = titulaire;
    }
    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }
    public void setTitulaire(String titulaire) {
        this.titulaire=titulaire;
    }

    public void setSolde(double solde) {
        this.solde=solde;
    }

    public void dediter(double mont) throws SoldeException{ 
        if (solde < mont) {
            throw new SoldeException("Solde insuffisante !!!");
        }
        this.solde = this.solde - mont; 
    }

    public void crediter(double montant) {  
        this.solde = this.solde + montant;  
    }
    
    @Override
    public String toString() {
        return "Bonjour " + titulaire + ", votre solde est " + solde;
    }
}
