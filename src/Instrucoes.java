
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 * essa classe é repsonsável por criar uma nova cena.
 */
public class Instrucoes extends Scene{


    /**
    * esse construtor setará uma imagem de fundo.
    * @param root é o tipo do fundo da tela.
    * @param width é a largura da imagem.
    * @param height é a altura da imagem.
    */
    
    
    public Instrucoes(Pane root, double width, double height) {
        super(root, width, height);
        
        ImageView perdeu = new ImageView("imagens/instrucao.png");
        
        root.getChildren().addAll(perdeu);
        
    }
    
    
    
    
}
