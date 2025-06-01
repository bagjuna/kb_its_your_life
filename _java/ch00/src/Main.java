import javax.swing.text.View;
import java.awt.*;

// Dialog에 ScrollView,View
public class Main {
    public static void main(String[] args) {
        // Create a new dialog
        Dialog dialog = new Dialog();

        // Create a ScrollView
        ScrollView scrollView = new ScrollView();

        // Create a View to be added to the ScrollView
        View view = new View();

        // Add the View to the ScrollView
        scrollView.addView(view);

        // Add the ScrollView to the dialog
        dialog.setContent(scrollView);

        // Show the dialog
        dialog.show();
    }
}