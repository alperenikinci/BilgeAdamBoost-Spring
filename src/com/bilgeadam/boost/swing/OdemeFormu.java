package com.bilgeadam.boost.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OdemeFormu {

	private JFrame frame;
	private JTextField txtTutar;
	
	KrediKarti krediKarti = new KrediKarti();
	MailOrder mailOrder = new MailOrder();
	Odeme odeme = new Odeme();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OdemeFormu window = new OdemeFormu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OdemeFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Odeme Yontemi : ");
		lblNewLabel.setBounds(41, 27, 107, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox cmbOdemeYontemi = new JComboBox();
		cmbOdemeYontemi.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "KrediKarti", "MailOrder"}));
		cmbOdemeYontemi.setBounds(158, 23, 107, 22);
		frame.getContentPane().add(cmbOdemeYontemi);
		
		JLabel lblNewLabel_1 = new JLabel("Tutar :");
		lblNewLabel_1.setBounds(41, 63, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtTutar = new JTextField();
		txtTutar.setBounds(158, 60, 107, 20);
		frame.getContentPane().add(txtTutar);
		txtTutar.setColumns(10);
		
		JLabel lblSonuc = new JLabel("Sonuc :");
		lblSonuc.setBounds(41, 216, 324, 14);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnOdemeYap = new JButton("OdemeYap");
		btnOdemeYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Double.valueOf(txtTutar.getText());
				//lblSonuc.setText("Seçili ödeme yöntemi : " + cmbOdemeYontemi.getSelectedItem().toString());
				
				if(cmbOdemeYontemi.getSelectedItem().toString().equalsIgnoreCase("KrediKarti")){
				lblSonuc.setText(krediKarti.OdemeYap(Double.valueOf(txtTutar.getText())));
				}
				else if (cmbOdemeYontemi.getSelectedItem().toString().equalsIgnoreCase("MailOrder")) {
					lblSonuc.setText(mailOrder.OdemeYap(Double.valueOf(txtTutar.getText())));
				}
		
				
			}
		});
		btnOdemeYap.setBounds(158, 113, 107, 23);
		frame.getContentPane().add(btnOdemeYap);
		
		
	}
}
