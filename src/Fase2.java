
import java.util.ArrayList;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manoel Eric
 */
/**
 *
 * essa classe é responsável por instanciar todos os objetos da segunda fase criando variáveis de posição e objetos retângulos.
 */
public class Fase2 extends Scene {
    boolean status;
    int posicaox = 100;
    int  posicaoy = 100;
    private Rectangle telaDefundo;
    public Rectangle obstaculo;
    public Rectangle obstaculo2;
    public Rectangle obstaculo3;

    Carro carro;
    Personagem cj;
    Inimigo p1;
    Inimigo p2;
    Inimigo p3;
    Inimigo p4;
    Inimigo p5;
    Inimigo p6;
    Pane root;
    
    
    List<Inimigo> inimigos = new ArrayList();
    
        
    /**
     * 
     * @param root é um nó raiz  que serve de parâmetro para o construtor Fase2.
     * @param i é uma variável gerada automaticamente  que serve de parâmetro para o construtor Fase2.
     * @param i0 é uma variável gerada automaticamente  que serve de parâmetro para o construtor Fase2.
     */
    
    public Fase2(Pane root, int i, int i0) {
        super(root,i,i0);
        this.root =  root;
        resetaFase2();
    }
    
    /**
     * é um étodo que serve para resetar a fase instanciando e criando todos os objetos nele.
     */
    
    
    
    
    public void resetaFase2(){
        obstaculo = new Rectangle(100,50,50,220);
        obstaculo.setFill(new ImagePattern(new Image("imagens/obstaculo.png")));
        obstaculo2 = new Rectangle(240,104,50,220);
        obstaculo2.setFill(new ImagePattern(new Image("imagens/obstaculo.png")));
        obstaculo3 = new Rectangle(380,50,50,220);
        obstaculo3.setFill(new ImagePattern(new Image("imagens/obstaculo.png")));
        
        carro = new Carro(5,5,60,60);
        p2 = new Inimigo(600,250,50,50);
        p3 = new Inimigo(700,300,50,50);
        p4 = new Inimigo(590,100,50,50);
        p5 = new Inimigo(700,150,50,50);
        p6 = new Inimigo(730,120,50,50);
        
        
        telaDefundo = new Rectangle(0,0,800, 400);
        telaDefundo.setFill(new ImagePattern(new Image("gta/sexo.png")));
        root.getChildren().add(telaDefundo);
        
        inimigos.add(p2);
        inimigos.add(p3);
        inimigos.add(p4);
        inimigos.add(p5);
        inimigos.add(p6);
        
        root.getChildren().add(carro);
        root.getChildren().add(p2);
        root.getChildren().add(p3);
        root.getChildren().add(p4);
        root.getChildren().add(p5);
        root.getChildren().add(p6);
        root.getChildren().add(obstaculo);
        root.getChildren().add(obstaculo2);
        root.getChildren().add(obstaculo3);
        
    
    
    } 
    
    /**
     * Esse método é responsável por atropelar os inimigos de forma que comparando as posições por meio
     * de getBounds() retira elementos da lista criada com variável global servindo assim de contador de mortos.
     */
        
   public void atropelamento() {
        for (Inimigo inimigo : inimigos) {
            if (carro.getBoundsInParent().intersects(inimigo.getBoundsInLocal())) {
                inimigo.setFill(new ImagePattern(new Image("imagens/morto.png")));
                inimigos.remove(inimigo);

            }
        }
   }

    
    
    /**
     * esse método é responsável por comparar as posições do objeto carro com os objetos obstaculos que ao retornarem um
     * valor booleano true signifa que este o carro está na posição do obstáculo.
     * @return boolean
     */
    
    public boolean obstaculos(){
    
        boolean obst = carro.getBoundsInLocal().intersects(obstaculo.getBoundsInLocal());
        boolean obst2 = carro.getBoundsInLocal().intersects(obstaculo2.getBoundsInLocal());
        boolean obst3 = carro.getBoundsInLocal().intersects(obstaculo3.getBoundsInLocal());
        
        if(obst || obst2 || obst3){
            return true;
        }
        return false;
    
   
}
    /**
     * 
     * @return retorna o tamanho da lista.
     */

    public List<Inimigo> getInimigos() {
        return inimigos;
    }
    

}