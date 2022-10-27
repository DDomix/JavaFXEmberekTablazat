package hu.petrik.emberektablazat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class emberekController {
    @FXML
    private TableColumn<Ember, String> nevoszlop;
    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, Integer> koroszlop;
    @FXML
    private Spinner<Integer> kormezo;
    @FXML
    private Button hozzaadClick;
    @FXML
    private TextField nevmezo;


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
        SpinnerValueFactory<Integer> gradesValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,25);
        this.kormezo.setValueFactory(gradesValueFactory);
        kormezo.setEditable(true);

    }

    public void hozzaadClick(ActionEvent actionEvent) {

        if (nevmezo.getText().isEmpty()){
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Hiba!");
            alert.setContentText("Nem adtál meg nevet");
            alert.show();

        }
        else if (emberek.getItems().stream().anyMatch(x ->x.getNev().equals(nevmezo.getText()))){
            Alert alert1=new Alert(Alert.AlertType.WARNING);
            alert1.setTitle("Hiba!");
            alert1.setContentText("Az adott ember már szerepel a táblázatban");
            alert1.show();
        }
        else {
            String nev=nevmezo.getText();
            int kor=kormezo.getValue();
            Ember ember =new Ember(nev,kor);
            emberek.getItems().add(ember);
        }
    }
}