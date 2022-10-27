package hu.petrik.emberektablazat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class emberekController {
    @FXML
    private TableColumn<Ember, String> nevoszlop;
    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, Integer> koroszlop;

    @FXML
    private void initialize(){
        nevoszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        koroszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
        Ember e1=new Ember("PSGOgli7",21);
        Ember e2=new Ember("Radics Attila",35);
        Ember e3=new Ember("Gáspár Laci",42);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }

}