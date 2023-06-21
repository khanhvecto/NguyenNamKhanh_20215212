package hust.soict.globalict.aims.screen;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.media.*;

public class MediaStore extends JPanel{
	private Media media;
	private Cart cart;
	
	public MediaStore(Media media, Cart cart) {
		this.media = media;
		this.cart = cart;
		ButtonListener btnListener = new ButtonListener();
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton addToCartBtn = new JButton("Add to cart");
		container.add(addToCartBtn);
		addToCartBtn.addActionListener(btnListener);
		if(media instanceof Playable) {
			JButton playBtn = new JButton("Play");
			container.add(playBtn);
			playBtn.addActionListener(btnListener);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			if(button.equals("Play")) {
				//Play media in a dialog window
				JDialog dialog = new JDialog();
				JLabel playingContent;
				if(media instanceof DigitalVideoDisc) {
					playingContent = new JLabel(((DigitalVideoDisc) media).play());
				} else {
					playingContent = new JLabel(((CompactDisc) media).play());
				}
				dialog.add(playingContent);
				dialog.setSize(100,100);
				dialog.setVisible(true);
			} else if(button.equals("Add to cart")) {
				cart.addMedia(media);
				JDialog dialog = new JDialog();
				dialog.add(new JLabel("The media added to cart"));
				dialog.setVisible(true);
			}
		}
	}
}
