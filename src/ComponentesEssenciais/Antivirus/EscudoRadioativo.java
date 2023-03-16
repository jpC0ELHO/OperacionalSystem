package ComponentesEssenciais.Antivirus;

public abstract class EscudoRadioativo {

    protected String Tipo_virus;

    protected Integer numero_ameacas;

    protected String tipo_erro;
    protected String Atualizacoes;
    protected String analisar_programas;
    protected String realizar_varreduras;
    protected String VPN;
    protected boolean ativado;
    protected boolean desativado;


    //Construtor
    public EscudoRadioativo() {
    }

    //==============Getters and Setters==================
    public String getTipo_virus() {
        return Tipo_virus;
    }

    public void setTipo_virus(String tipo_virus) {
        Tipo_virus = tipo_virus;
    }

    public Integer getNumero_ameacas() {
        return numero_ameacas;
    }

    public void setNumero_ameacas(Integer numero_ameacas) {
        this.numero_ameacas = numero_ameacas;
    }

    public String getTipo_erro() {
        return tipo_erro;
    }

    public void setTipo_erro(String tipo_erro) {
        this.tipo_erro = tipo_erro;
    }

    public String getAtualizacoes() {
        return Atualizacoes;
    }

    public void setAtualizacoes(String atualizacoes) {
        Atualizacoes = atualizacoes;
    }

    public String getAnalisar_programas() {
        return analisar_programas;
    }

    public void setAnalisar_programas(String analisar_programas) {
        this.analisar_programas = analisar_programas;
    }

    public String getRealizar_varreduras() {
        return realizar_varreduras;
    }

    public void setRealizar_varreduras(String realizar_varreduras) {
        this.realizar_varreduras = realizar_varreduras;
    }

    public String getVPN() {
        return VPN;
    }

    public void setVPN(String VPN) {
        this.VPN = VPN;
    }

    public boolean isAtivado() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }

    public boolean isDesativado() {
        return desativado;
    }

    public void setDesativado(boolean desativado) {
        this.desativado = desativado;
    }
}
