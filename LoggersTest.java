import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggersTest {

  @Test
  public void deveRetornarArquivoEscrito() {
    Loggers.getInstance().setArquivoEscrito("Arquivo 1");
    assertEquals("Arquivo 1", Loggers.getInstance().getArquivoEscrito());
  }

  @Test
  public void deveRetornarMensagemEnviada() {
    Loggers.getInstance().setMensagemEnviada("Mensagem Teste");
    assertEquals("Mensagem Teste", Loggers.getInstance().getMensagemEnviada());
  }
}
