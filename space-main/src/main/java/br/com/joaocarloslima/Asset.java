package br.com.joaocarloslima;

import javafx.scene.image.ImageView;


public abstract class Asset {

    private int y;
    private int x;
    private int velocidade;
    private Direcao direcao;
    private ImageView imagem;

   
    public void mover(){
    
           if (direcao == Direcao.CIMA) {
            y -= velocidade;  
        } else if (direcao == Direcao.BAIXO) {
            y += velocidade;  
        } else if (direcao == Direcao.ESQUERDA) {
            x -= velocidade;  
        } else if (direcao == Direcao.DIREITA) {
            x += velocidade;  
        }
    };


    public boolean colidiuCom(Asset asset){

        return x < asset.getX() + 50 && 
               x +50 > asset.getX() && 
               y < asset.getY() + 50 &&
               y + 50 > asset.getY();
    }
    


    public Asset(int y, int x, int velocidade, Direcao direcao) {
        this.y = y;
        this.x = x;
        this.velocidade = velocidade;
        this.direcao = direcao;
 
    }



    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


    public Direcao getDirecao() {
        return direcao;
    }


    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

} 
