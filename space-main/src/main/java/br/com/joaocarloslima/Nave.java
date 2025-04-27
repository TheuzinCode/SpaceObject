package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        ImageView imagem = new ImageView("file:src/main/java/br/com/joaocarloslima/images/ships/playerShip1_blue.png");
        setImagem(imagem);
    }

    public Tiro atirar(int poder) {
        Tiro tiro = new Tiro(getX(), getY(), 10, Direcao.CIMA, poder);
        return tiro;
    }
    

    public void mover() {
        super.mover();
        getImagem().setLayoutX(getX());
        getImagem().setLayoutY(getY());

        if (getX() < 0) {
            setX(0);
        }
        if (getX() > 640 - 50) {
            setX(590);
            
        }
    }
}
