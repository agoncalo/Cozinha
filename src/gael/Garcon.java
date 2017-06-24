package gael;

public class Garcon {
    Cozinha cozinha = Cozinha.getInstance();
    public void notificarPedidoPronto(Pedido p) {}
    public void enviarPedido(String nome) {
        cozinha.addPedido(new Pedido(nome));
    }
}
