package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.MyBotonera;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FramePrincipal extends JFrame {

	private JPanel contentPane;
	protected MyBotonera panelTresEnRaya;
	private JPanel panelBotones;
	private JPanel panelInfo;
	private JLabel lblNumeroMovimientosJX;
	private JLabel lblNumeroMovimientosJO;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		panelInfo = new JPanel();
		contentPane.add(panelInfo);
		panelInfo.setLayout(null);
		
		JLabel lblMovimientosJX = new JLabel("Movimientos JX:");
		lblMovimientosJX.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMovimientosJX.setBounds(22, 93, 179, 86);
		panelInfo.add(lblMovimientosJX);
		
		JLabel lblMovimientosJo = new JLabel("Movimientos JO:");
		lblMovimientosJo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMovimientosJo.setBounds(22, 255, 179, 86);
		panelInfo.add(lblMovimientosJo);
		
		lblNumeroMovimientosJX = new JLabel("0");
		lblNumeroMovimientosJX.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroMovimientosJX.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNumeroMovimientosJX.setBounds(188, 93, 72, 86);
		panelInfo.add(lblNumeroMovimientosJX);
		
		lblNumeroMovimientosJO = new JLabel("0");
		lblNumeroMovimientosJO.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroMovimientosJO.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNumeroMovimientosJO.setBounds(188, 255, 72, 86);
		panelInfo.add(lblNumeroMovimientosJO);
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones);
		
		panelTresEnRaya = new MyBotonera();
		contentPane.add(panelTresEnRaya);
		panelTresEnRaya.setLayout(new GridLayout(3, 3, 4, 3));
		
		
	}

	public MyBotonera getPanelTresEnRaya() {
	
		return panelTresEnRaya;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public JPanel getPanelInfo() {
		return panelInfo;
	}

	public JLabel getLblNumeroMovimientosJX() {
		return lblNumeroMovimientosJX;
	}

	public JLabel getLblNumeroMovimientosJO() {
		return lblNumeroMovimientosJO;
	}
}
