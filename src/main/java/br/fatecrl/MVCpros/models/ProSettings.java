package br.fatecrl.MVCpros.models;

public class ProSettings {
    private String nome;
    private String mouse;
    private String teclado;
    private String monitor;
    private String fone;
    private String mousepad;
    private double sensibilidade;

    public ProSettings(String nome, String mouse, String teclado, String monitor, String fone, String mousepad, double sensibilidade) {
        this.nome = nome;
        this.mouse = mouse;
        this.teclado = teclado;
        this.monitor = monitor;
        this.fone = fone;
        this.mousepad = mousepad;
        this.sensibilidade = sensibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getMousepad() {
        return mousepad;
    }

    public void setMousepad(String mousepad) {
        this.mousepad = mousepad;
    }

    public double getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(double sensibilidade) {
        this.sensibilidade = sensibilidade;
    }
}
