package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Tiro extends Asset {
    
    private int poder;
    

    public Tiro(int x, int y, int velocidade, Direcao direcao, int poder){
        super(y, x, velocidade, direcao);
        this.poder = poder;
        String path = "file:src/main/java/br/com/joaocarloslima/images/laser/laser" + poder + ".png";
        ImageView imagem = new ImageView("file:src/main/java/br/com/joaocarloslima/images/laser/laser" + poder + ".png");
        setImagem(imagem);
    }

    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }
}
