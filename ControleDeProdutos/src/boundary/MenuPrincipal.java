package boundary;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel menuLateral;
	private FormAdicionar formAdicionar;
	private FormEditar formEditar;
	private FormExcluir formExcluir;
	private FormListar formListar;
	private String formAtivo;

	private JButton btnListarProd;
	private JButton btnAdicionarProd;
	private JButton btnEditarProd;
	private JButton btnExcluirProd;

	private void instanciarMenuLateral() {
		menuLateral = new JPanel();
		menuLateral.setSize(200, 300);
		menuLateral.setLayout(new GridLayout(4, 1));
		menuLateral.setVisible(true);

		menuLateral.add(btnListarProd);
		menuLateral.add(btnAdicionarProd);
		menuLateral.add(btnEditarProd);
		menuLateral.add(btnExcluirProd);

	}

	private void instarciarForms() {
		formAdicionar = new FormAdicionar();
		formEditar = new FormEditar();
		formExcluir = new FormExcluir();
		formListar = new FormListar();

		formAtivo = "Listar";
	}

	private void instanciarButtons() {
		btnListarProd = new JButton("Listar Produtos");
		btnAdicionarProd = new JButton("Adicionar Produtos");
		btnEditarProd = new JButton("Editar Produtos");
		btnExcluirProd = new JButton("Excluir Produtos");

		btnListarProd.setEnabled(false);
	}

	private void defineFrame() {

		this.setTitle("Controle de Produtos");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(menuLateral, BorderLayout.WEST);
		this.add(formListar);

		this.setVisible(true);
	}

	public MenuPrincipal() {

		instanciarButtons();
		adicionarListener();
		instanciarMenuLateral();
		instarciarForms();
		defineFrame();

	}

	private void adicionarListener() {

		btnListarProd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				defineButtons("Listar");
				removeConteudo();
				adicionaConteudo("Listar");

			}
		});

		btnAdicionarProd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				defineButtons("Adicionar");
				removeConteudo();
				adicionaConteudo("Adicionar");

			}
		});

		btnEditarProd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				defineButtons("Editar");
				removeConteudo();
				adicionaConteudo("Editar");

			}
		});

		btnExcluirProd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				defineButtons("Excluir");
				removeConteudo();
				adicionaConteudo("Excluir");

			}
		});

	}

	private void removeConteudo() {

		if (formAtivo == "Listar") {
			this.remove(formListar);
			formListar.setVisible(false);
		} else if (formAtivo == "Adicionar") {
			this.remove(formAdicionar);
			formAdicionar.setVisible(false);
		} else if (formAtivo == "Editar") {
			this.remove(formEditar);
			formEditar.setVisible(false);
		} else if (formAtivo == "Excluir") {
			this.remove(formExcluir);
			formExcluir.setVisible(false);
		}

	}

	private void adicionaConteudo(String bt) {

		formAtivo = bt;

		if (bt == "Listar") {
			this.add(formListar);
			formListar.listar();
			formListar.setVisible(true);
		} else if (bt == "Adicionar") {
			this.add(formAdicionar);
			formAdicionar.setVisible(true);
		} else if (bt == "Editar") {
			this.add(formEditar);
			formEditar.setVisible(true);
		} else if (bt == "Excluir") {
			this.add(formExcluir);
			formExcluir.setVisible(true);
		}

		revalidate();
	}

	private void defineButtons(String bt) {

		switch (bt) {
		case "Listar":
			btnListarProd.setEnabled(false);
			btnAdicionarProd.setEnabled(true);
			btnEditarProd.setEnabled(true);
			btnExcluirProd.setEnabled(true);
			break;
		case "Adicionar":
			btnListarProd.setEnabled(true);
			btnAdicionarProd.setEnabled(false);
			btnEditarProd.setEnabled(true);
			btnExcluirProd.setEnabled(true);
			break;
		case "Editar":
			btnListarProd.setEnabled(true);
			btnAdicionarProd.setEnabled(true);
			btnEditarProd.setEnabled(false);
			btnExcluirProd.setEnabled(true);
			break;
		case "Excluir":
			btnListarProd.setEnabled(true);
			btnAdicionarProd.setEnabled(true);
			btnEditarProd.setEnabled(true);
			btnExcluirProd.setEnabled(false);
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {
		new MenuPrincipal();
	}
}
