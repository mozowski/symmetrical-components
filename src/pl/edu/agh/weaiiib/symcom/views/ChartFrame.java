package pl.edu.agh.weaiiib.symcom.views;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class ChartFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6990506460934749279L;

	public ChartFrame(String title, int x, int y) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(x, y);
		this.setSize(400, 400);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/pl/edu/agh/weaiiib/symcom/resources/lightning-icon.png")));
	}
}
