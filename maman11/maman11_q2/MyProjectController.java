/**
 * this class controlls and runs the button to draw random black squirs on the canvas
 * @author (Faigy Shternel)
 * @version (16.3.2022)
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;


public class MyProjectController {

    @FXML
    private Button btn;

    @FXML
    private Canvas canv;
    private GraphicsContext gc;

    public void initialize() {
        gc = canv.getGraphicsContext2D();

    }


    @FXML
    void pressed(ActionEvent event) {

        GraphicsContext gc = canv.getGraphicsContext2D();
        gc.clearRect(0, 0, canv.getWidth(), canv.getHeight());
        for (int i = 0; i < canv.getWidth(); i = i+10) {
            for (int j = 0; j < canv.getHeight();j = j+10) {
                gc.strokeRect(i, j,10,10);
            }
        }
        int howManyFill = 0;
        int c = (int)((canv.getWidth()*canv.getHeight()/1000));
        while (howManyFill < c)
        {
            Random randWidth = new Random();
            Random randHeight = new Random();
            int x = ((int)randHeight.nextInt((int)canv.getWidth())/10);
            int y =((int)randHeight.nextInt((int)canv.getHeight())/10);
            //if()
            gc.fillRect(x*10, y*10, 10, 10);
            howManyFill++;
        }

        //

    }

}
