package primeira;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SegundaClasse extends JFrame implements ActionListener{
		// Aqui vamos declarar os objetos que v�o ser constru�dos dentro do M�todo Construtor.
	
		JButton bSair, bLimpar;
		JTextField tfNome, tfEndereco;
		JLabel lNome, lEndereco, lSexo;
		ButtonGroup bgSexo;
		JRadioButton rbMasc, rbFem;
		
	public SegundaClasse() {
		/* Aqui temos o M�todo Construtor, mas muitas coisas podem ser colocadas direto no main.
		   A ordem que os objetos s�o adicionados � que definir� a ordem dentro da janela.	*/
		
		lNome = new JLabel("Nome:");											add(lNome);
		tfNome = new JTextField(15);											add(tfNome);
		lEndereco = new JLabel("Endere�o: ");									add(lEndereco);
		tfEndereco = new JTextField(15);										add(tfEndereco);
		
		lSexo = new JLabel("Sexo: ");											add(lSexo);
		rbMasc = new JRadioButton("Masculino");									add(rbMasc);
		rbFem = new JRadioButton("Feminino");									add(rbFem);
		bgSexo = new ButtonGroup();	
			bgSexo.add(rbMasc);	
			bgSexo.add(rbFem); 
		
		bLimpar = new JButton("Limpar");	bLimpar.addActionListener(this);	add(bLimpar);
		bSair = new JButton("Sair");		bSair.addActionListener(this);		add(bSair);
		
		// Essa parte logo abaixo pode ser feita aqui ou dentro do main:
		setVisible(true);	
			setTitle("Programa teste");		
				setLayout( new FlowLayout());//Quando voc� for testar, 'COLOCA ESSA LINHA E A LINHA 69' como coment�rio para voc� v� a diferen�a.
					setSize(250, 150);
			
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {	// o meu Evento se chama arg0, mas esse nome pode ser trocado por qualquer outro.
		
		/* Essa parte do C�digo s�o os eventos, os m�todos abstratos.
		   Quando se implementa ActionListener, o programa pede para criar os m�todos abstratos,
		   com isso, essa parte do c�digo � gerada pera propria IDE Eclipse. */
		   
		if (arg0.getSource() == bLimpar) {
			tfNome.setText("");
				tfEndereco.setText(""); 
		}
		if (arg0.getSource() == bSair)	System.exit(0);		
	}
	
	/* Primeiro, voc� declara os objetos;
	   Segundo, constroe eles dentro do M�todo Construtor;
	   Terceiro, adiciona eventos aos objetos que desejar dentro do actionPerformed;
	   Quarto, executa no main.	*/
	
	public static void main(String[] args) {
		
		SegundaClasse janela = new SegundaClasse();
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		// Essa parte abaixo tamb�m pode ser feita dentro do M�todo Construtor:
			
				janela.setLayout(new FlowLayout());		// ESSA � A LINHA 69	
					janela.setTitle("Programa teste");
						janela.setVisible(true);
							janela.setLocationRelativeTo(null);
								janela.setSize(250, 150);
	}
		
}
