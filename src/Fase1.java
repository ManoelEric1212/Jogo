
import java.util.ArrayList;
import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 *
 * @author Manoel Eric
 */

/**
 *
 * essa classe é responsável por instanciar todos os objetos da primeira fase.
 */
public class Fase1 extends Scene {

    boolean status;
    int posicaox = 100;
    int posicaoy = 100;
    private Rectangle telaDefundo;
    Carro carro;
    Personagem cj;
    Inimigo p1;
    Inimigo p2;
    Inimigo p3;
    Inimigo p4;
    Inimigo p5;
    Inimigo p6;
    Pane root;
    int statusMorte = 0;
    List<Inimigo> inimigos = new ArrayList();

    /**
     *
     * esse construtor é responsável por receber os objetos da primeira fase.
     * 
     * @param root é um nó raiz.
     * @param i é um instanciamento do objeto super.
     * @param i0 é o segundo parâmetro do objeto super.
     */
    public Fase1(Pane root, int i, int i0) {
        super(root, i, i0);
        this.root = root;
        resetaFase1();

    }

    /**
     *
     * esse método é responsável por resetar toda a fase 1 com seus respectivos objetos.
     */
    public void resetaFase1() {
        carro = new Carro(50, 50, 50, 50);
        cj = new Personagem(posicaox, posicaoy, 40, 40);
        p1 = new Inimigo(100, 200, 50, 50);
        p2 = new Inimigo(230, 250, 50, 50);
        p3 = new Inimigo(500, 210, 50, 50);
        p4 = new Inimigo(390, 100, 50, 50);
        p5 = new Inimigo(700, 100, 50, 50);
        p6 = new Inimigo(430, 120, 50, 50);

        telaDefundo = new Rectangle(0, 0, 800, 400);
        telaDefundo.setFill(new ImagePattern(new Image("gta/sexo.png")));
        root.getChildren().add(telaDefundo);

        inimigos.add(p1);
        inimigos.add(p2);
        inimigos.add(p3);
        inimigos.add(p4);
        inimigos.add(p5);
        inimigos.add(p6);

        root.getChildren().add(cj);
        root.getChildren().add(p1);
        root.getChildren().add(p2);
        root.getChildren().add(p3);
        root.getChildren().add(p4);
        root.getChildren().add(p5);
        root.getChildren().add(p6);
        root.getChildren().add(carro);

    }
    
    /**
    * esse método e responsável por fazer com que o carro ande a partir da comparação se o personagem(cj) está ou não na sua mesma posição.
    * 
    */
    

    public void andaCarro() {
        boolean statusCarro = carro.getBoundsInLocal().intersects(cj.getBoundsInLocal());
        if (statusCarro == true) {
            root.getChildren().remove(cj);

        }

    }

    /**
    * esse método é responsável por comparar se a posição do carro é a mesma se for verdadeiro ele seta uma imagem e o contador.
    * 
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
    * 
    * 
    * @return personagens
    */

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

}
