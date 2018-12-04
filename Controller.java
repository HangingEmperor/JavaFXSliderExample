package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller {

    @FXML
    Slider slider;
    @FXML
    Label txtSlider;

    @FXML
    public void onSliderChanged() {
        int sliderValue = (int) slider.getValue();
        System.out.println(sliderValue + " ");
        txtSlider.setText((float) slider.getValue() + " ");
    }
}
