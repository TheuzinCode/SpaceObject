package br.com.joaocarloslima;

import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {
    
    Random random = new Random();
    int rn = random.nextInt(8) + 1;

    private int tamanho = rn;
    
    private int poder = tamanho;

 

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        String path = "images/meteoro/meteoro" + tamanho + ".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);
    }

    public void tomarTiro(Tiro tiro){
        if (colidiuCom(tiro)) {
            setPoder(getPoder() - tiro.getPoder());
            if (getPoder() <= 0) {
                getImagem().setVisible(false);
            }
        }
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
