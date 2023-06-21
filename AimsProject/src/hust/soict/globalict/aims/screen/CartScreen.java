package hust.soict.globalict.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import hust.soict.globalict.aims.cart.Cart.Cart;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;

public class CartScreen extends JFrame{
	private Cart cart;
	
	public CartScreen(Cart cart) {
		super();
		
		this.cart = cart;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/globalict/aims/screen/Cart.fxml"));
					CartScreenController controller = new CartScreenController(cart);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
