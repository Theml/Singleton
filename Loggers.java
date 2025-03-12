public class Loggers {
    
    private Loggers() {}
    private static Loggers instace = new Loggers();
    public static Loggers getInstace() {
        return instace;
    }

    private String arquivoEscrito;
    private String mensagemEnviada;

    public String getArquivoEscrito() {
        return arquivoEscrito;
    }

    public void setArquivoEscrito(String arquivoEscrito){
        this.arquivoEscrito = arquivoEscrito;
    }

    public String getMensagemEnviada() {
        return mensagemEnviada;
    }

    public void setMensagemEnviada(String mensagemEnviada){
        this.mensagemEnviada = mensagemEnviada;
    }
}
