package br.com.joaocarloslima;

import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {
    
    Random rn = new Random(); 
    int numeroInteiro = rn.nextInt(8) + 1;

    private int tamanho = numeroInteiro;
    private int poder = tamanho;

    public Meteoro(int y, int x, int velocidade, Direcao direcao ){
        super(y, x, velocidade, direcao);
        String path = "file:src/main/java/br/com/joaocarloslima/images/meteoro/meteoro" + poder + ".png";
        ImageView imagem = new ImageView("file:src/main/java/br/com/joaocarloslima/images/meteoro/meteoro" + poder + ".png");
        setImagem(imagem);

    }

    public void tomarTiro(Tiro tiro){
        poder -= tiro.getPoder();
    }

    public int getTamanho() {
        return tamanho;
    }



    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    public int getPoder() {
        return poder;
    }



    public void setPoder(int poder) {
        this.poder = poder;
    }
}
