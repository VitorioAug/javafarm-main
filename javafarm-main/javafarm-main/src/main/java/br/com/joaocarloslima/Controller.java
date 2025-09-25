package br.com.joaocarloslima;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

    private Fazenda fazenda = new Fazenda();
    private List<ImageView> imageTerrenos = new ArrayList<>();
    private int sleepTime = 3000;

    @FXML
    private GridPane grid;
    @FXML
    private ToggleButton botaoBatata, botaoCenoura, botaoMorango, botaoColher;
    @FXML
    private ProgressBar ocupacaoDoCeleiro;
    @FXML
    private CheckBox ckbAcelerar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                ImageView imageView = new ImageView();
                imageView.setFitHeight(50);
                imageView.setFitWidth(50);
                grid.add(imageView, x, y);
                imageTerrenos.add(imageView);
            }
        }


        grid.setOnMouseClicked(e -> {
            int x = (int) (e.getX() / 50);
            int y = (int) (e.getY() / 50);

            try {
                Planta plantaSelecionada = null;
                if (botaoBatata.isSelected()) plantaSelecionada = new Batata();
                else if (botaoCenoura.isSelected()) plantaSelecionada = new Cenoura();
                else if (botaoMorango.isSelected()) plantaSelecionada = new Morango();

                if (plantaSelecionada != null) {
                    fazenda.plantar(x, y, plantaSelecionada);
                } else if (botaoColher.isSelected()) {
                    fazenda.colher(x, y);
                }

                atualizar();

            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText(ex.getMessage());
                alert.showAndWait();
            }
        });

        atualizar();
        clockThread();
    }


    public void atualizar() {

        ocupacaoDoCeleiro.setProgress(fazenda.getCeleiro().getProgresso());


        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                Terreno terreno = fazenda.getTerreno(x, y);
                ImageView imageView = imageTerrenos.get(x * 13 + y);
                if (terreno.getPlanta() != null) {
                    imageView.setImage(new Image(getClass()
                            .getResourceAsStream(terreno.getPlanta().getImagem())));
                } else {
                    imageView.setImage(null);
                }
            }
        }


        botaoBatata.setText("Batata x " + fazenda.getCeleiro().contarPorTipo("Batata"));
        botaoCenoura.setText("Cenoura x " + fazenda.getCeleiro().contarPorTipo("Cenoura"));
        botaoMorango.setText("Morango x " + fazenda.getCeleiro().contarPorTipo("Morango"));
    }


    public void ciclo() {
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                Terreno terreno = fazenda.getTerreno(x, y);
                if (terreno.getPlanta() != null) {
                    terreno.getPlanta().crescer();
                }
            }
        }
        atualizar();
    }


    public void acelerar() {
        sleepTime = ckbAcelerar.isSelected() ? 1000 : 3000;
    }


    public void clockThread() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(sleepTime);
                    Platform.runLater(this::ciclo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}

