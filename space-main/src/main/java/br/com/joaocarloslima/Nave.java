package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public static Object atirar;


    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(y, x, velocidade, direcao);
        String path = "file:src/main/resources/br/com/joaocarloslima/images/ships/playerShip1_blue.png";
        ImageView imagem = new ImageView("file:src/main/resources/br/com/joaocarloslima/images/ships/playerShip1_blue.png");
        setImagem(imagem);
    }

    public Tiro atirar(int poder) {
        Tiro novoTiro = new Tiro(this.getX(), this.getY(), this.getVelocidade(), getDirecao(), poder);
        return novoTiro;
    }


    @Override
    public void mover(){
        Math.min(0, getX());
        Math.max(getX(), getX()- 50);
    }
}
