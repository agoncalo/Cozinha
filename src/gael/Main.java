package gael;

import java.io.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by AntonioFilho on 24/06/17.
 */
public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = Cozinha.getInstance();
        File pedidos = new File("Pedidos.txt");
        BufferedReader reader;
        FileReader freader;
        try {
            freader = new FileReader(pedidos);
            reader = new BufferedReader(freader);
            String linha;
            while ((linha = reader.readLine()) != null) {
                cozinha.addPedido(new Pedido(linha));
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {}
            }
        } catch (IOException e) {}
    }
}
