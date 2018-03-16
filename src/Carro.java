
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
 * essa classe é responsável por criar o personagem carro e suas variáveis de posição na tela e suas variáveis de movimento.
 */
public class Carro extends Rectangle{

    
    private int direita = 1;
    private int esquerda = 1;
    private int down = 1;
    private int up = 1;
    private int posiX ,posiY;
    public Carro carro;

    
     
 
    
    
    /**
    *
    * esse construtor é responsável por receber por receber algusn parâmetros.
    * 
     * @param posix é a posição em relação ao eixo X.
     * @param posiy é a posição em relação ao eixo Y.
     * @param width é a largura do carro.
     * @param height é a altura do carro.
    */
    
    
    public Carro(int posix, int posiy, int width, int height) {
        this.posiX = posix;
        this.posiY = posiy;
        this.setX(posiX);
        this.setY(posiY);
        this.setWidth(width);
        this.setHeight(height);
        this.setFill(new ImagePattern(new Image("imagens/carro.png")));
        

        
    }
    /**
    *
    *
     * @return  retorna a posiçao x.
    */

    public int getPosiX() {
        return posiX;
    }
    /**
     * 
     * @return retorna a posição y.
     */
    public int getPosiY() {
        return posiY;
    }
    
    /**
    *
    * esse método é responsável por realizar o movimento para a direita comparando as posições em x e setando 10 unidades
    * se verdadeiro a condição e seta também a imagem.
    */

    
    public void moverRight() {
        
        
            
            
        if (getX() < 750) {
            setX(getX()+10);
            this.setFill(new ImagePattern(new Image("imagens/carro.png")));
            
            
        }}
    
    /**
    *
    * esse método é responsável por realizar o movimento para a esquerda comparando as posições em x e setando 10 unidades
    * a menos se verdadeiro a condição e seta também a imagem.
    */
        
        
        public void moverLeft(){
        if (getX() > 0) {
            setX(getX()-10);
            this.setFill(new ImagePattern(new Image("imagens/esquerdacar.png")));
    }}
        
    /**
    *
    * esse método é responsável por realizar o movimento para baixo comparando as posições em y e setando 10 unidades
    * se verdadeiro a condição e seta também a imagem.
    */
        
        
        public void moverDown() {
        if (getY() < 280) {
            setY(getY() + 10);
            this.setFill(new ImagePattern(new Image("imagens/baixocar.png")));
    }}
        
        
    /**
    *
    * esse método é responsável por realizar o movimento para cima comparando as posições em y e setando 10 unidades
    * a menos se verdadeiro a condição e seta também a imagem.
    */
        
    public void moverUp() {
    if (getY() < 360) {
        setY(getY() - 10);
            this.setFill(new ImagePattern(new Image("imagens/cimacar.png")));
    }
    
    
    
}

}

        

