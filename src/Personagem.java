
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * essa classe é repsonsável por criar um personagem que herda de uma classe retângulo e recebe algumas variáveis iniciais
 * como posiçãox posiçãoy e as variáveis de referenciamento de posição.
 */
public class Personagem extends Rectangle{
    private int direita = 1;
    private int esquerda = 1;
    private int down = 1;
    private int up = 1;
    
    private int posicaoX = 100,posicaoY = 100;
    
    
    public Personagem cj;
   
    
    
    /**
     * 
     * @param posicaox seta a posição em relação ao eixo x.
     * @param posicaoy seta a posição em relação ao eixo y.
     * @param width é a largura do objeto.
     * @param height é a altura do objeto.
     */
    Personagem(int posicaox, int posicaoy, int width, int height) {
        //configurações
        this.setX(posicaox);
        this.setY(posicaoy);
        this.setWidth(width);
        this.setHeight(height);
        this.setFill(new ImagePattern(new Image("imagens/cima.png")));
        
    }

    /**
     * 
     * @return retorna uma posiçãox.
     */
    
    public int getPosicaoX() {
        return posicaoX;
    }
    
    /**
     * 
     * @return retorna uma posição y.
     */
    

    public int getPosicaoY() {
        return posicaoY;
    }
    
    /**
    *
    * esse método é responsável por realizar o movimento para a direita comparando as posições em x e setando 10 unidades
    * se verdadeiro a condição e seta também a imagem.
    */
    
    
    
    
        public void moverRight() {
            
            
        if (getX() < 750) {
            setX(getX()+10);
        switch (direita) {
            case 1:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita.png")));
                break;
            case 2:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita1.png")));
                break;
            case 3:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita.png")));
                break;
            case 4:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita2.png")));
                direita = 0;
                break;
        }//}
        
        direita++;
        }}
        
        
        /**
        *
        * esse método é responsável por realizar o movimento para a esquerda comparando as posições em x e setando 10 unidades
        * a menos se verdadeiro a condição e seta também a imagem.
        */
        
        
        
        public void moverLeft(){
        if (getX() > 0) {
            setX(getX()-10);
        switch (esquerda) {
            case 1:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda.png")));
                break;
            case 2:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda1.png")));
                break;
            case 3:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda.png")));
                break;
            case 4:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda2.png")));
                esquerda = 0;
                break;
        }
        
        esquerda++;
    }}
        
        /**
        *
        * esse método é responsável por realizar o movimento para baixo comparando as posições em y e setando 10 unidades
        * a menos se verdadeiro a condição e seta também a imagem.
        */
    
        
        
        public void moverDown() {
        if (getY() < 350) {
            setY(getY() + 10);
            switch (down){
             case 1:
                this.setFill(new ImagePattern(new Image("imagens/baixo.png")));
                break;
            case 2:

                this.setFill(new ImagePattern(new Image("imagens/baixo1.png")));
                break;
            case 3:

                this.setFill(new ImagePattern(new Image("imagens/baixo.png")));
                break;
            case 4:

                this.setFill(new ImagePattern(new Image("imagens/baixo2.png")));
                down = 0;
                break;
                  
        
       }
            down++;
    }}
        
        
        /**
        *
        * esse método é responsável por realizar o movimento para cima comparando as posições em y e setando 10 unidades
        * a menos se verdadeiro a condição e seta também a imagem.
        */
    
    public void moverUp() {
    if (getY() < 360) {
        setY(getY() - 10);
            switch (up){
             case 1:
                this.setFill(new ImagePattern(new Image("imagens/cima.png")));
                break;
            case 2:

                this.setFill(new ImagePattern(new Image("imagens/cima2.png")));
                break;
            case 3:

                this.setFill(new ImagePattern(new Image("imagens/cima.png")));
                break;
            case 4:

                this.setFill(new ImagePattern(new Image("imagens/cima3.png")));
                up = 0;
                break;
                  
        
       }
            up++;
    }}



        
            
            
        }
    

   

    
        

    
        
