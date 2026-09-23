package padroescriacao.singleton;

public class SessaoUsuario {

    private SessaoUsuario() {}

    private static SessaoUsuario instance = new SessaoUsuario();

    public static SessaoUsuario getInstance() {
        return instance;
    }

    private String usuarioLogado;
    private String perfilAcesso;
    private String tokenAcesso;

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String getPerfilAcesso() {
        return perfilAcesso;
    }

    public void setPerfilAcesso(String perfilAcesso) {
        this.perfilAcesso = perfilAcesso;
    }

    public String getTokenAcesso() {
        return tokenAcesso;
    }

    public void setTokenAcesso(String tokenAcesso) {
        this.tokenAcesso = tokenAcesso;
    }
}
