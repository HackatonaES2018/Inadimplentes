package br.com.gastronomia.dto;

public class AvaliacaoAntropometricaDTO {
    private long idAtendimento;
    private double altura;
    private double peso;
    private double jpAbdominal;
    private double jpTorax;
    private double jpCoxa;
    private double gAbdominal;
    private double gTriceps;
    private double gSuprailiaco;

    private double bracoDirRelaxCirc;
    private double bracoEsqRelaxCirc;
    private double antebracoCirc;
    private double punhoCirc;
    private double pescocoCirc;
    private double ombroCirc;
    private double peitoralCirc;
    private double cinturaCirc;
    private double abdomenCirc;
    private double quadrilCirc;

    private double panturrilhaDirCirc;
    private double panturrilhaEsqCirc;
    private double coxaDirCirc;
    private double coxaEsqCirc;
    private double coxaProximalDirCirc;
    private double coxaProximalEsqCirc;

    private double punho;
    private double femur;

    private Boolean status;

    public AvaliacaoAntropometricaDTO() {
        // empty
    }

    public long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public double getPunhoCirc() {
        return punhoCirc;
    }

    public void setPunhoCirc(double punhoCirc) {
        this.punhoCirc = punhoCirc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPunho() {
        return punho;
    }

    public void setPunho(double punho) {
        this.punho = punho;
    }

    public double getFemur() {
        return femur;
    }

    public void setFemur(double femur) {
        this.femur = femur;
    }

    public double getJpAbdominal() {
        return jpAbdominal;
    }

    public void setJpAbdominal(double jpAbdominal) {
        this.jpAbdominal = jpAbdominal;
    }

    public double getJpTorax() {
        return jpTorax;
    }

    public void setJpTorax(double jpTorax) {
        this.jpTorax = jpTorax;
    }

    public double getJpCoxa() {
        return jpCoxa;
    }

    public void setJpCoxa(double jpCoxa) {
        this.jpCoxa = jpCoxa;
    }

    public double getgAbdominal() {
        return gAbdominal;
    }

    public void setgAbdominal(double gAbdominal) {
        this.gAbdominal = gAbdominal;
    }

    public double getgTriceps() {
        return gTriceps;
    }

    public void setgTriceps(double gTriceps) {
        this.gTriceps = gTriceps;
    }

    public double getgSuprailiaco() {
        return gSuprailiaco;
    }

    public void setgSuprailiaco(double gSuprailiaco) {
        this.gSuprailiaco = gSuprailiaco;
    }

    public double getBracoDirRelaxCirc() {
        return bracoDirRelaxCirc;
    }

    public void setBracoDirRelaxCirc(double bracoDirRelaxCirc) {
        this.bracoDirRelaxCirc = bracoDirRelaxCirc;
    }

    public double getBracoEsqRelaxCirc() {
        return bracoEsqRelaxCirc;
    }

    public void setBracoEsqRelaxCirc(double bracoEsqRelaxCirc) {
        this.bracoEsqRelaxCirc = bracoEsqRelaxCirc;
    }

    public double getAntebracoCirc() {
        return antebracoCirc;
    }

    public void setAntebracoCirc(double antebracoCirc) {
        this.antebracoCirc = antebracoCirc;
    }

    public double getPescocoCirc() {
        return pescocoCirc;
    }

    public void setPescocoCirc(double pescoso) {
        this.pescocoCirc = pescocoCirc;
    }

    public double getOmbroCirc() {
        return ombroCirc;
    }

    public void setOmbroCirc(double ombroCirc) {
        this.ombroCirc = ombroCirc;
    }

    public double getPeitoralCirc() {
        return peitoralCirc;
    }

    public void setPeitoralCirc(double peitoralCirc) {
        this.peitoralCirc = peitoralCirc;
    }

    public double getCinturaCirc() {
        return cinturaCirc;
    }

    public void setCinturaCirc(double cinturaCirc) {
        this.cinturaCirc = cinturaCirc;
    }

    public double getAbdomenCirc() {
        return abdomenCirc;
    }

    public void setAbdomenCirc(double abdomenCirc) {
        this.abdomenCirc = abdomenCirc;
    }

    public double getQuadrilCirc() {
        return quadrilCirc;
    }

    public void setQuadrilCirc(double quadrilCirc) {
        this.quadrilCirc = quadrilCirc;
    }

    public double getPanturrilhaDirCirc() {
        return panturrilhaDirCirc;
    }

    public void setPanturrilhaDirCirc(double panturrilhaDirCirc) {
        this.panturrilhaDirCirc = panturrilhaDirCirc;
    }

    public double getPanturrilhaEsqCirc() {
        return panturrilhaEsqCirc;
    }

    public void setPanturrilhaEsqCirc(double panturrilhaEsqCirc) {
        this.panturrilhaEsqCirc = panturrilhaEsqCirc;
    }

    public double getCoxaDirCirc() {
        return coxaDirCirc;
    }

    public void setCoxaDirCirc(double coxaDirCirc) {
        this.coxaDirCirc = coxaDirCirc;
    }

    public double getCoxaEsqCirc() {
        return coxaEsqCirc;
    }

    public void setCoxaEsqCirc(double coxaEsqCirc) {
        this.coxaEsqCirc = coxaEsqCirc;
    }

    public double getCoxaProximalDirCirc() {
        return coxaProximalDirCirc;
    }

    public void setCoxaProximalDirCirc(double coxaProximalDirCirc) {
        this.coxaProximalDirCirc = coxaProximalDirCirc;
    }

    public double getCoxaProximalEsqCirc() {
        return coxaProximalEsqCirc;
    }

    public void setCoxaProximalEsqCirc(double coxaProximalEsqCirc) {
        this.coxaProximalEsqCirc = coxaProximalEsqCirc;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
