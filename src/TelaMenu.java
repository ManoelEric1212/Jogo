
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;



/**
 *
 * @author Manoel Eric
 * 
 */

/**
 * 
 * essa classe é responsável por criar a tela de menu do jogo onde esta recebe outras Classe do javafx e adiciona objetos
 *tela
 */
public class TelaMenu extends Scene{
    Label  tx1 = new Label("Pressione ENTER, para jogar e ESC para sair !");
    Rectangle telaDefundo;
    /**
     * 
     * @param root é uma variável super gerada automaticamento.
     * @param width é uma variável que serve de parâmetro da largura.
     * @param height é uma variável que serve de parâmetro da altura.
     */
    public TelaMenu(Pane root, double width, double height) {
        super(root, width, height);
        tx1.setLayoutX(110);
        tx1.setLayoutY(280);
        tx1.setTextFill(Color.RED);
        tx1.setScaleX(1.2); // Aumenta letra
        tx1.setScaleY(1.2);
        telaDefundo = new Rectangle(1.7,0,482, 318);
                
        telaDefundo.setFill(new ImagePattern(new Image("gta/gta1pc.png")));
        
        root.getChildren().addAll(telaDefundo,tx1);
        
    }
    
}
