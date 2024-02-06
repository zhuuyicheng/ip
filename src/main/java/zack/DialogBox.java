package zack;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * The DialogBox class represents a custom JavaFX HBox for displaying dialog messages.
 * It combines a Label for text and an ImageView for displaying a user's or a bot's profile picture.
 */
public class DialogBox extends HBox {

    private Label text; // The Label for displaying the text message.
    private ImageView displayPicture; // The ImageView for displaying the user's or bot's profile picture.

    /**
     * Constructs a new DialogBox with a given Label and ImageView.
     *
     * @param l The Label containing the text message to be displayed.
     * @param iv The ImageView containing the user's or bot's profile picture.
     */
    public DialogBox(Label l, ImageView iv) {
        text = l;
        displayPicture = iv;

        // Enable text wrapping for long messages.
        text.setWrapText(true);

        // Set dimensions for the profile picture.
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);

        // Align the dialog box to the top right corner.
        this.setAlignment(Pos.TOP_RIGHT);

        // Add the text and profile picture to the dialog box.
        this.getChildren().addAll(text, displayPicture);
    }
}
