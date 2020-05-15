package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;

import Logica.*;
public class GameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();	
				}	
			}
		});
	}
	
	/**
	 * Variables
	 */
	
	public Juego  juego = new Juego();
	String 
		vidHeroe = juego.heroe.getVida(),		vidVillano = juego.villano.getVida(),
		atkHeroe = juego.heroe.getDefensa(),	atkVillano = juego.villano.getAtaque(),
		defHeroe = juego.heroe.getDefensa(), 	defVillano = juego.villano.getDefensa(),
		potHeroe = juego.heroe.getPotencial(),	potVillano = juego.villano.getPotencial(),
		punHeroe = juego.heroe.getPuntos(),		punVillano = juego.villano.getPuntos(),
		msg, num;
	
	/**
	 * 
	 * Create the frame.
	 */
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel heroe = new JPanel();
		heroe.setBackground(new Color(245, 245, 245));
		heroe.setBounds(27, 24, 358, 412);
		contentPane.add(heroe);
		heroe.setLayout(null);
		
		JPanel banner = new JPanel();
		banner.setLayout(null);
		banner.setBackground(Color.ORANGE);
		banner.setBounds(36, 44, 286, 100);
		heroe.add(banner);
		
		JPanel aPWR = new JPanel();
		aPWR.setBackground(new Color(237, 237, 237));
		aPWR.setLayout(null);
		aPWR.setBounds(36, 164, 286, 42);
		heroe.add(aPWR);
		
		JLabel iaPWR = new JLabel("");
		iaPWR.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/damageDealt.png")));
		iaPWR.setBounds(10, 13, 16, 16);
		aPWR.add(iaPWR);
		
		JLabel lbaPWR = new JLabel("Poder de Ataque");
		lbaPWR.setFont(new Font("Arial", Font.PLAIN, 17));
		lbaPWR.setBounds(36, 13, 176, 19);
		aPWR.add(lbaPWR);
		
		JLabel pntsaPWR = new JLabel(atkHeroe);
		pntsaPWR.setFont(new Font("Arial", Font.PLAIN, 17));
		pntsaPWR.setBounds(222, 13, 33, 14);
		aPWR.add(pntsaPWR);
		
		JPanel dRED = new JPanel();
		dRED.setBackground(new Color(237, 237, 237));
		dRED.setLayout(null);
		dRED.setBounds(36, 225, 286, 42);
		heroe.add(dRED);
		
		JLabel idRED = new JLabel("");
		idRED.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/block.png")));
		idRED.setBounds(10, 13, 16, 16);
		dRED.add(idRED);
		
		JLabel lbdRED = new JLabel("Reducci\u00F3n de Da\u00F1os");
		lbdRED.setFont(new Font("Arial", Font.PLAIN, 17));
		lbdRED.setBounds(36, 13, 176, 19);
		dRED.add(lbdRED);
		
		JLabel pntsdRED = new JLabel(defHeroe);
		pntsdRED.setBounds(222, 13, 33, 14);
		dRED.add(pntsdRED);
		pntsdRED.setFont(new Font("Arial", Font.PLAIN, 17));
		
		JPanel hPOT = new JPanel();
		hPOT.setBackground(new Color(237, 237, 237));
		hPOT.setLayout(null);
		hPOT.setBounds(36, 286, 286, 42);
		heroe.add(hPOT);
		
		JLabel ihPOT = new JLabel("");
		ihPOT.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/wisdom.png")));
		ihPOT.setBounds(10, 13, 16, 16);
		hPOT.add(ihPOT);
		
		JLabel lbhPOT = new JLabel("Potencial de Habilidad");
		lbhPOT.setFont(new Font("Arial", Font.PLAIN, 17));
		lbhPOT.setBounds(36, 13, 176, 19);
		hPOT.add(lbhPOT);
		
		JLabel pntshPOT = new JLabel(potHeroe);
		pntshPOT.setFont(new Font("Arial", Font.PLAIN, 17));
		pntshPOT.setBounds(222, 13, 33, 14);
		hPOT.add(pntshPOT);
		
		JPanel hPOI = new JPanel();
		hPOI.setBackground(new Color(237, 237, 237));
		
		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/190.png")));
		imagen.setBounds(0, 0, 100, 100);
		banner.add(imagen);
		
		JLabel nombre = new JLabel("Heroe");
		nombre.setForeground(Color.WHITE);
		nombre.setFont(new Font("Segoe UI", Font.BOLD, 13));
		nombre.setVerticalAlignment(SwingConstants.TOP);
		nombre.setBounds(104, 11, 172, 37);
		banner.add(nombre);
		
		JLabel LP = new JLabel(vidHeroe);
		LP.setFont(new Font("Segoe UI", Font.BOLD, 16));
		LP.setForeground(Color.WHITE);
		LP.setVerticalAlignment(SwingConstants.TOP);
		LP.setBounds(240, 70, 46, 30);
		banner.add(LP);
		hPOI.setLayout(null);
		hPOI.setBounds(36, 347, 286, 42);
		heroe.add(hPOI);
		
		JLabel iPOI = new JLabel("");
		iPOI.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/initiative.png")));
		iPOI.setBounds(10, 13, 16, 16);
		hPOI.add(iPOI);
		
		JLabel lbiPOI = new JLabel("Puntos de Habilidad");
		lbiPOI.setFont(new Font("Arial", Font.PLAIN, 17));
		lbiPOI.setBounds(36, 13, 176, 19);
		hPOI.add(lbiPOI);
		
		JLabel pntshPOI = new JLabel(punHeroe);
		pntshPOI.setFont(new Font("Arial", Font.PLAIN, 17));
		pntshPOI.setBounds(222, 13, 33, 14);
		hPOI.add(pntshPOI);
		
		JPanel nInfo = new JPanel();
		nInfo.setBackground(new Color(216, 229, 241));
		nInfo.setBounds(74, 449, 264, 96);
		contentPane.add(nInfo);
		nInfo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("+7");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 48));
		lblNewLabel.setBackground(new Color(153, 204, 255));
		nInfo.add(lblNewLabel);
		
		JPanel villano = new JPanel();
		villano.setLayout(null);
		villano.setBackground(new Color(245, 245, 245));
		villano.setBounds(412, 24, 358, 412);
		contentPane.add(villano);
		
		JPanel banner_1 = new JPanel();
		banner_1.setLayout(null);
		banner_1.setBackground(new Color(153, 51, 51));
		banner_1.setBounds(36, 44, 286, 100);
		villano.add(banner_1);
		
		JLabel imagen_1 = new JLabel("");
		imagen_1.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/50.png")));
		imagen_1.setBounds(0, 0, 100, 100);
		banner_1.add(imagen_1);
		
		JLabel lblVillano = new JLabel("Villano");
		lblVillano.setVerticalAlignment(SwingConstants.TOP);
		lblVillano.setForeground(Color.WHITE);
		lblVillano.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblVillano.setBounds(104, 11, 172, 37);
		banner_1.add(lblVillano);
		
		JLabel LP_1 = new JLabel(vidVillano);
		LP_1.setVerticalAlignment(SwingConstants.TOP);
		LP_1.setForeground(Color.WHITE);
		LP_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		LP_1.setBounds(240, 70, 46, 30);
		banner_1.add(LP_1);
		
		JPanel aPWR_1 = new JPanel();
		aPWR_1.setLayout(null);
		aPWR_1.setBackground(new Color(237, 237, 237));
		aPWR_1.setBounds(36, 164, 286, 42);
		villano.add(aPWR_1);
		
		JLabel iaPWR_1 = new JLabel("");
		iaPWR_1.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/damageDealt.png")));
		iaPWR_1.setBounds(10, 13, 16, 16);
		aPWR_1.add(iaPWR_1);
		
		JLabel lbaPWR_1 = new JLabel("Poder de Ataque");
		lbaPWR_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lbaPWR_1.setBounds(36, 13, 176, 19);
		aPWR_1.add(lbaPWR_1);
		
		JLabel pntsaPWR_1 = new JLabel(atkVillano);
		pntsaPWR_1.setFont(new Font("Arial", Font.PLAIN, 17));
		pntsaPWR_1.setBounds(222, 13, 33, 14);
		aPWR_1.add(pntsaPWR_1);
		
		JPanel dRED_1 = new JPanel();
		dRED_1.setLayout(null);
		dRED_1.setBackground(new Color(237, 237, 237));
		dRED_1.setBounds(36, 225, 286, 42);
		villano.add(dRED_1);
		
		JLabel idRED_1 = new JLabel("");
		idRED_1.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/block.png")));
		idRED_1.setBounds(10, 13, 16, 16);
		dRED_1.add(idRED_1);
		
		JLabel lbdRED_1 = new JLabel("Reducci\u00F3n de Da\u00F1os");
		lbdRED_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lbdRED_1.setBounds(36, 13, 176, 19);
		dRED_1.add(lbdRED_1);
		
		JLabel pntsdRED_1 = new JLabel(defVillano);
		pntsdRED_1.setFont(new Font("Arial", Font.PLAIN, 17));
		pntsdRED_1.setBounds(222, 13, 33, 14);
		dRED_1.add(pntsdRED_1);
		
		JPanel hPOT_1 = new JPanel();
		hPOT_1.setLayout(null);
		hPOT_1.setBackground(new Color(237, 237, 237));
		hPOT_1.setBounds(36, 286, 286, 42);
		villano.add(hPOT_1);
		
		JLabel ihPOT_1 = new JLabel("");
		ihPOT_1.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/wisdom.png")));
		ihPOT_1.setBounds(10, 13, 16, 16);
		hPOT_1.add(ihPOT_1);
		
		JLabel lbhPOT_1 = new JLabel("Potencial de Habilidad");
		lbhPOT_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lbhPOT_1.setBounds(36, 13, 176, 19);
		hPOT_1.add(lbhPOT_1);
		
		JLabel pntshPOT_1 = new JLabel(potVillano);
		pntshPOT_1.setFont(new Font("Arial", Font.PLAIN, 17));
		pntshPOT_1.setBounds(222, 13, 33, 14);
		hPOT_1.add(pntshPOT_1);
		
		JPanel hPOI_1 = new JPanel();
		hPOI_1.setLayout(null);
		hPOI_1.setBackground(new Color(237, 237, 237));
		hPOI_1.setBounds(36, 347, 286, 42);
		villano.add(hPOI_1);
		
		JLabel iPOI_1 = new JLabel("");
		iPOI_1.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/initiative.png")));
		iPOI_1.setBounds(10, 13, 16, 16);
		hPOI_1.add(iPOI_1);
		
		JLabel lbiPOI_1 = new JLabel("Puntos de Habilidad");
		lbiPOI_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lbiPOI_1.setBounds(36, 13, 176, 19);
		hPOI_1.add(lbiPOI_1);
		
		JLabel pntshPOI_1 = new JLabel(punVillano);
		pntshPOI_1.setFont(new Font("Arial", Font.PLAIN, 17));
		pntshPOI_1.setBounds(222, 13, 33, 14);
		hPOI_1.add(pntshPOI_1);
		
		JPanel lInfo = new JPanel();
		lInfo.setBackground(new Color(216, 229, 241));
		lInfo.setBounds(459, 447, 264, 96);
		contentPane.add(lInfo);
		lInfo.setLayout(new BorderLayout(50, 50));
		
		JLabel lbInfoMSG = new JLabel(msg);
		lbInfoMSG.setFont(new Font("Arial", Font.PLAIN, 17));
		lbInfoMSG.setHorizontalAlignment(SwingConstants.CENTER);
		lInfo.add(lbInfoMSG, BorderLayout.CENTER);
		
		JButton btnTurno = new JButton("");
		btnTurno.setBorderPainted(false);
		btnTurno.setContentAreaFilled(false);
		btnTurno.setIcon(new ImageIcon(GameFrame.class.getResource("/imagenes/Flecha.png")));
		btnTurno.setBounds(374, 469, 52, 52);
		contentPane.add(btnTurno);
		
		JButton btnIPN = new JButton("IPN");
		btnIPN.setFont(new Font("Arial", Font.PLAIN, 14));
		btnIPN.setBounds(28, 555, 165, 47);
		contentPane.add(btnIPN);
		
		JButton btnDEF = new JButton("DEF");
		btnDEF.setFont(new Font("Arial", Font.PLAIN, 14));
		btnDEF.setBounds(221, 555, 165, 47);
		btnDEF.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        btnDEF.setBackground(Color.GREEN);
		        msg="aumenta la defensa";
		        lbInfoMSG.setText(msg);
		        lbInfoMSG.validate();
		        
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        btnDEF.setBackground(UIManager.getColor("control"));
		    }
		});
		contentPane.add(btnDEF);
		
		
		JButton btnBNS = new JButton("BNS");
		btnBNS.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBNS.setBounds(121, 624, 165, 47);
		contentPane.add(btnBNS);
		
		JButton btnATK = new JButton("ATK");
		btnATK.setFont(new Font("Arial", Font.PLAIN, 14));
		btnATK.setBounds(413, 555, 165, 47);
		contentPane.add(btnATK);
		
		JButton btnHEX = new JButton("HEX");
		btnHEX.setFont(new Font("Arial", Font.PLAIN, 14));
		btnHEX.setBounds(606, 555, 165, 47);
		contentPane.add(btnHEX);
		
		JButton btnMls = new JButton("MLS");
		btnMls.setFont(new Font("Arial", Font.PLAIN, 14));
		btnMls.setBounds(506, 624, 165, 47);
		contentPane.add(btnMls);
	}
}
