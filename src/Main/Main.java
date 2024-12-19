package Main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
	// Variável de instância para a janela
	public static JFrame Janela = new JFrame("Naylor Gerenciador");
	public static JPanel Input = new JPanel();

	public static void main(String[] args) {
		Controler(); // Chama o método para adicionar os componentes
		
}

	public static void Controler() {
		Janela.setSize(250, 150); // Tamanho da janela
		Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Fechar ao clicar no X
		Input.setLayout(new FlowLayout());// Type of Input
		// Definindo limete de caracters
		JTextField Email = new JTextField(15);
		JTextField Passaword = new JPasswordField(15);
		
		// Fields
		Input.add(new JLabel("Email:"));
		Input.add(Email);
		Input.add(new JLabel("Passaword:"));
		Input.add(Passaword);
		JButton Button = new JButton("Login");
		Input.add(Button);
		
		
		
		
		
		Janela.add(Input); // Adicionando o painel ao JFrame
		Janela.setVisible(true); // Tornar a janela visível

	}
};
