package br.com.joaocarloslima;


import java.util.ArrayList;
import java.util.List;

public class Jogo {
    
    List<Asset> assets = new ArrayList<>();

    Nave nave = new Nave(280 ,400, 10, Direcao.DIREITA);

    private int pontos;
    private int nivel;


    public int getPontos() {
        return pontos;
    }


    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


    public int getNivel() {
        return nivel;
    }


    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public Tiro atirar() {
        Tiro novoTiro = new Tiro(nave.getX(), nave.getY(), 5 , nave.getDirecao(), 5);
        assets.add(novoTiro); 
        return novoTiro;
    }


    public Meteoro criarMeteoro(){
        Meteoro meteoro = new Meteoro(5, 5, 5,Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }


    public void pontuar(){


        pontos += 1;

        if(pontos >= 10){
           nivel += 1; 
        }

        if(nivel >= 4 ){
            nivel = 4;
        }
    }
}

