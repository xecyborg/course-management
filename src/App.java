import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import auth.Auth;
import pages.SplashScreen;
import util.CustomImage;
import util.DataManager;
import util.DataRetriever;
import util.DatabaseManager;

public class App {

	private JFrame frmCourseManagement;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmCourseManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		initialize();
	}

	private void initialize() {
		frmCourseManagement = new JFrame();
		frmCourseManagement.setTitle("Course Management System");
		frmCourseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCourseManagement.getContentPane().setLayout(null);
		frmCourseManagement.setSize(1480, 720);
		frmCourseManagement.setResizable(false);

		CustomImage logo = new CustomImage("../resources/logo.png");

		new SplashScreen(frmCourseManagement, logo);

		try {
			DatabaseManager db = DatabaseManager.getInstance();
			new Auth(db);
			new DataRetriever();
			new DataManager();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"Can not connect to database!\nPlease make sure mySQL is correctly setup and running!",
					"Error 500: Server Communication Failed", JOptionPane.ERROR_MESSAGE);
			System.exit(500);
		}
	}
}
