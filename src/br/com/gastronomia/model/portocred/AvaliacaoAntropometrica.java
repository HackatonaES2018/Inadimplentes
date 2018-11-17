package br.com.gastronomia.model.portocred;


import br.com.gastronomia.model.dietoterapia.AtendimentoNutricional;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "AvaliacaoAntropometrica")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvaliacaoAntropometrica {
    @Id
    private long id;

    @OneToOne
    @MapsId
    private AtendimentoNutricional atendimento;
    
    @Column(name = "altura",unique = false, nullable = false)
    private double altura;

    @Column(name = "peso",unique = false, nullable = false)
    private double peso;

    @Column(name = "punho",unique = false, nullable = true)
    private double punho;

    @Column(name = "femur",unique = false, nullable = true)
    private double femur;

    @Column(name = "abdominalJack",unique = false, nullable = true)
    private double abdominalJack;

    @Column(name = "torax",unique = false, nullable = true)
    private double torax;

    @Column(name = "coxa",unique = false, nullable = true)
    private double coxa;

    @Column(name = "abdominalGuedes",unique = false, nullable = true)
    private double abdominalGuedes;

    @Column(name = "triceps",unique = false, nullable = true)
    private double triceps;

    @Column(name = "suprailiaco",unique = false, nullable = true)
    private double suprailiaco;

    @Column(name = "bracoDirRelax",unique = false, nullable = true)
    private double bracoDirRelax;

    @Column(name = "bracoEsqRelax",unique = false, nullable = true)
    private double bracoEsqRelax;

    @Column(name = "anteBraco",unique = false, nullable = true)
    private double anteBraco;

    @Column(name = "punhoCirc",unique = false, nullable = false)
    private double punhoCirc;

    @Column(name = "pescoco",unique = false, nullable = true)
    private double pescoco;

    @Column(name = "ombro",unique = false, nullable = true)
    private double ombro;

    @Column(name = "peitoral",unique = false, nullable = true)
    private double peitoral;

    @Column(name = "cintura",unique = false, nullable = true)
    private double cintura;

    @Column(name = "abdomen",unique = false, nullable = true)
    private double abdomen;

    @Column(name = "quadril",unique = false, nullable = true)
    private double quadril;

    @Column(name = "panturrilhaDir",unique = false, nullable = true)
    private double panturrilhaDir;

    @Column(name = "panturrilhaEsq",unique = false, nullable = true)
    private double panturrilhaEsq;

    @Column(name = "coxaDir",unique = false, nullable = true)
    private double coxaDir;

    @Column(name = "coxaEsq",unique = false, nullable = true)
    private double coxaEsq;

    @Column(name = "coxaProximalDir",unique = false, nullable = true)
    private double coxaProximalDir;

    @Column(name = "coxaProximaEsq",unique = false, nullable = true)
    private double coxaProximalEsq;

    @Column(name = "status", unique = false, nullable = false)
    private Boolean status;

    public AvaliacaoAntropometrica() {
    }

    public AvaliacaoAntropometrica(AtendimentoNutricional atendimento, double altura, double peso, double punho, double femur, double abdominalJack, double torax, double coxa, double abdominalGuedes, double triceps, double suprailiaco, double bracoDirRelax, double bracoEsqRelax, double anteBraco, double pescoco, double ombro, double peitoral, double cintura, double abdomen, double quadril, double panturrilhaDir, double panturrilhaEsq, double coxaDir, double coxaEsq, double coxaProximalDir, double coxaProximalEsq, Boolean status) {
        this.atendimento = atendimento;
        this.altura = altura;
        this.peso = peso;
        this.punho = punho;
        this.femur = femur;
        this.abdominalJack = abdominalJack;
        this.torax = torax;
        this.coxa = coxa;
        this.abdominalGuedes = abdominalGuedes;
        this.triceps = triceps;
        this.suprailiaco = suprailiaco;
        this.bracoDirRelax = bracoDirRelax;
        this.bracoEsqRelax = bracoEsqRelax;
        this.anteBraco = anteBraco;
        this.pescoco = pescoco;
        this.ombro = ombro;
        this.peitoral = peitoral;
        this.cintura = cintura;
        this.abdomen = abdomen;
        this.quadril = quadril;
        this.panturrilhaDir = panturrilhaDir;
        this.panturrilhaEsq = panturrilhaEsq;
        this.coxaDir = coxaDir;
        this.coxaEsq = coxaEsq;
        this.coxaProximalDir = coxaProximalDir;
        this.coxaProximalEsq = coxaProximalEsq;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AtendimentoNutricional getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(AtendimentoNutricional atendimento) {
        this.atendimento = atendimento;
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

    public double getAbdominalJack() {
        return abdominalJack;
    }

    public void setAbdominalJack(double abdominalJack) {
        this.abdominalJack = abdominalJack;
    }

    public double getTorax() {
        return torax;
    }

    public void setTorax(double torax) {
        this.torax = torax;
    }

    public double getCoxa() {
        return coxa;
    }

    public void setCoxa(double coxa) {
        this.coxa = coxa;
    }

    public double getAbdominalGuedes() {
        return abdominalGuedes;
    }

    public void setAbdominalGuedes(double abdominalGuedes) {
        this.abdominalGuedes = abdominalGuedes;
    }

    public double getTriceps() {
        return triceps;
    }

    public void setTriceps(double triceps) {
        this.triceps = triceps;
    }

    public double getSuprailiaco() {
        return suprailiaco;
    }

    public void setSuprailiaco(double suprailiaco) {
        this.suprailiaco = suprailiaco;
    }

    public double getBracoDirRelax() {
        return bracoDirRelax;
    }

    public void setBracoDirRelax(double bracoDirRelax) {
        this.bracoDirRelax = bracoDirRelax;
    }

    public double getBracoEsqRelax() {
        return bracoEsqRelax;
    }

    public void setBracoEsqRelax(double bracoEsqRelax) {
        this.bracoEsqRelax = bracoEsqRelax;
    }

    public double getAnteBraco() {
        return anteBraco;
    }

    public void setAnteBraco(double anteBraco) {
        this.anteBraco = anteBraco;
    }

    public double getPunhoCirc() {
        return punhoCirc;
    }

    public void setPunhoCirc(double punhoCirc) {
        this.punhoCirc = punhoCirc;
    }

    public double getPescoco() {
        return pescoco;
    }

    public void setPescoco(double pescoco) {
        this.pescoco = pescoco;
    }

    public double getOmbro() {
        return ombro;
    }

    public void setOmbro(double ombro) {
        this.ombro = ombro;
    }

    public double getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(double peitoral) {
        this.peitoral = peitoral;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(double abdomen) {
        this.abdomen = abdomen;
    }

    public double getQuadril() {
        return quadril;
    }

    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }

    public double getPanturrilhaDir() {
        return panturrilhaDir;
    }

    public void setPanturrilhaDir(double panturrilhaDir) {
        this.panturrilhaDir = panturrilhaDir;
    }

    public double getPanturrilhaEsq() {
        return panturrilhaEsq;
    }

    public void setPanturrilhaEsq(double panturrilhaEsq) {
        this.panturrilhaEsq = panturrilhaEsq;
    }

    public double getCoxaDir() {
        return coxaDir;
    }

    public void setCoxaDir(double coxaDir) {
        this.coxaDir = coxaDir;
    }

    public double getCoxaEsq() {
        return coxaEsq;
    }

    public void setCoxaEsq(double coxaEsq) {
        this.coxaEsq = coxaEsq;
    }

    public double getCoxaProximalDir() {
        return coxaProximalDir;
    }

    public void setCoxaProximalDir(double coxaProximalDir) {
        this.coxaProximalDir = coxaProximalDir;
    }

    public double getCoxaProximalEsq() {
        return coxaProximalEsq;
    }

    public void setCoxaProximalEsq(double coxaProximalEsq) {
        this.coxaProximalEsq = coxaProximalEsq;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}