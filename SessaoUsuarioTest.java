package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessaoUsuarioTest {

    @Test
    void deveRetornarUsuarioLogado() {
        SessaoUsuario.getInstance().setUsuarioLogado("renan.silva");
        assertEquals("renan.silva", SessaoUsuario.getInstance().getUsuarioLogado());
    }

    @Test
    void deveRetornarPerfilAcesso() {
        SessaoUsuario.getInstance().setPerfilAcesso("ADMIN");
        assertEquals("ADMIN", SessaoUsuario.getInstance().getPerfilAcesso());
    }

    @Test
    void deveRetornarTokenAcesso() {
        SessaoUsuario.getInstance().setTokenAcesso("token-jwt-123456");
        assertEquals("token-jwt-123456", SessaoUsuario.getInstance().getTokenAcesso());
    }

    @Test
    void deveGarantirInstanciaUnica() {
        SessaoUsuario instancia1 = SessaoUsuario.getInstance();
        SessaoUsuario instancia2 = SessaoUsuario.getInstance();
        assertSame(instancia1, instancia2);
    }
}
