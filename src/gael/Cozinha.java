package gael;

import java.util.ArrayList;

public class Cozinha {
    private static Cozinha ourInstance = new Cozinha();

    public static Cozinha getInstance() {
        return ourInstance;
    }

    private ArrayList<Pedido> listaDePedidos = new ArrayList<>();
    private ArrayList<Garcon> listaDeGarcon = new ArrayList<>();

    private Cozinha() {
    }

    public void addPedido(Pedido pedido) {
        listaDePedidos.add(pedido);
    }

    public void finalizarPedido(Pedido pedido) {
        listaDePedidos.remove(pedido);
        for (Garcon g : listaDeGarcon) {
            g.notificarPedidoPronto(pedido);
        }
    }
}