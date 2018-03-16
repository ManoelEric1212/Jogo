
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * essa classe é responsável por fazer o controle de todas as outras classes portanto senod uma aplicação onde algumas variáveis de 
 * música são inicializadas no pacote.
 */
public class Main extends Application {

    private final String gtamusic = getClass().getResource("song/musicafundo").toString();
    private final String gtamusic2 = getClass().getResource("song/sweet").toString();
    private final String gtamusic3 = getClass().getResource("song/perdeu").toString();
    private final String gtamusic4 = getClass().getResource("song/musicaganhou").toString();
    

    /**
     * esse método é responsável por iniciar todas as ações portanto todas as classes e métodos deverão nele ser instânciadas.
     * o método recebe também todos os eventos de cada classe do pacote trazendo variáveis, métodos de outras classes mas sendo inicializadas
     * somente no método start.
     * on
     * @param primaryStage são cenas sendo chamadas de outras classes.
     */
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        TelaMenu telamenu = new TelaMenu(root, 480, 310);
        primaryStage.setScene(telamenu);

        Pane root2 = new Pane();
        Fase1 fase1 = new Fase1(root2, 800, 400);
        Pane root3 = new Pane();
        Fase2 fase2 = new Fase2(root3, 800, 400);
        Pane root4 = new Pane();
        Perdeu perdeu = new Perdeu(root4, 800, 400);
        Pane root5 = new Pane();
        Instrucoes instru = new Instrucoes(root5,800,400);
        Pane root6 = new Pane();
        Instrucoes2 instru2 = new Instrucoes2(root6,800,400);
        Pane root7 = new Pane();
        Ganhou ganhou = new Ganhou(root7,800,400);
        
        
        
        AudioClip musicafundo = new AudioClip(gtamusic);
        AudioClip musicafase2 = new AudioClip(gtamusic2);
        AudioClip perdeum = new AudioClip(gtamusic3);
        AudioClip musicag = new AudioClip(gtamusic4);
        
        
        musicafundo.play();

        

        int StatusMorte = 0;

        telamenu.setOnKeyPressed((KeyEvent event) -> {

            if (event.getCode().equals(KeyCode.ENTER)) {
                fase1.resetaFase1();
                primaryStage.setScene(instru);
                Timeline time2 = new Timeline(new KeyFrame(Duration.seconds(5), y ->{
                  primaryStage.setScene(fase1);
                }));
                    time2.play();
                
            }
            if (event.getCode().equals(KeyCode.ESCAPE)) {
                primaryStage.close();
            }

        });

        fase2.setOnKeyPressed((KeyEvent event) -> {
            
            if(fase2.getInimigos().size() == 0){
                
                musicafase2.stop();
                musicag.play();
                primaryStage.setScene(ganhou);
                
                
                Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(7), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();
                    musicag.stop();
                    musicafundo.play();
                    
                    

            
            }
            
            
            if (event.getCode().equals(KeyCode.D)) {
                if (!fase2.obstaculos()) {
                    fase2.carro.moverRight();
                    fase2.atropelamento();

                } else {
                    musicafase2.stop();
                    perdeum.play();
                    primaryStage.setScene(perdeu);
                    
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        perdeum.stop();
                        musicafundo.play();
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }

            }

            if (event.getCode().equals(KeyCode.A)) {
                if (!fase2.obstaculos()) {
                    fase2.carro.moverLeft();
                    fase2.atropelamento();

                } else {
                    primaryStage.setScene(perdeu);
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }

            }
            if (event.getCode().equals(KeyCode.W)) {
                if (!fase2.obstaculos()) {
                    fase2.carro.moverUp();
                    fase2.atropelamento();
                } else {
                    primaryStage.setScene(perdeu);
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }

            }

            if (event.getCode().equals(KeyCode.S)) {
                if (!fase2.obstaculos()) {
                    fase2.carro.moverDown();
                    fase2.atropelamento();
                } else {
                    primaryStage.setScene(perdeu);
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }
            }

        });

        fase1.setOnKeyPressed((KeyEvent event) -> {
             if(fase1.getInimigos().size() == 0){
               fase2.resetaFase2();
               primaryStage.setScene(instru2);
               Timeline time = new Timeline(new KeyFrame(Duration.seconds(5), y ->{
                  primaryStage.setScene(fase2);
                  musicafundo.stop();
                  musicafase2.play();
               
               }));
               time.play();
             }

            if (event.getCode().equals(KeyCode.RIGHT)) {

                fase1.cj.moverRight();

            }

            if (event.getCode().equals(KeyCode.LEFT)) {

                fase1.cj.moverLeft();

            }
            if (event.getCode().equals(KeyCode.UP)) {

                fase1.cj.moverUp();

            }

            if (event.getCode().equals(KeyCode.DOWN)) {

                fase1.cj.moverDown();

            }

            if (event.getCode().equals(KeyCode.D)) {
                fase1.andaCarro();
                fase1.carro.moverRight();
                fase1.atropelamento();

            }

            if (event.getCode().equals(KeyCode.A)) {
                fase1.andaCarro();
                fase1.carro.moverLeft();
                fase1.atropelamento();

            }
            if (event.getCode().equals(KeyCode.W)) {
                fase1.andaCarro();
                fase1.carro.moverUp();
                fase1.atropelamento();

            }

            if (event.getCode().equals(KeyCode.S)) {
                fase1.andaCarro();
                fase1.carro.moverDown();
                fase1.atropelamento();
            }

        });

        primaryStage.setTitle("Grand Theft Auto- GTA");
        primaryStage.show();
    }

   /**
    * esse método é responsável por designar o main da aplicação sendo assim uma classe principal.
    * @param args 
    */

    public static void main(String[] args) {
        launch(args);
    }
}
