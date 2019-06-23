package primeira;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SegundaClasse extends JFrame implements ActionListener{
		// Aqui vamos declarar os objetos que vão ser construídos dentro do Método Construtor.
	
		JButton bSair, bLimpar;
		JTextField tfNome, tfEndereco;
		JLabel lNome, lEndereco, lSexo;
		ButtonGroup bgSexo;
		JRadioButton rbMasc, rbFem;
		
	public SegundaClasse() {
		/* Aqui temos o Método Construtor, mas muitas coisas podem ser colocadas direto no main.
		   A ordem que os objetos são adicionados é que definirá a ordem dentro da janela.	*/
		
		lNome = new JLabel("Nome:");											add(lNome);
		tfNome = new JTextField(15);											add(tfNome);
		lEndereco = new JLabel("Endereço: ");									add(lEndereco);
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
				setLayout( new FlowLayout());//Quando você for testar, 'COLOCA ESSA LINHA E A LINHA 69' como comentário para você vê a diferença.
					setSize(250, 150);
			
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {	// o meu Evento se chama arg0, mas esse nome pode ser trocado por qualquer outro.
		
		/* Essa parte do Código são os eventos, os métodos abstratos.
		   Quando se implementa ActionListener, o programa pede para criar os métodos abstratos,
		   com isso, essa parte do código é gerada pera propria IDE Eclipse. */
		   
		if (arg0.getSource() == bLimpar) {
			tfNome.setText("");
				tfEndereco.setText(""); 
		}
		if (arg0.getSource() == bSair)	System.exit(0);		
	}
	
	/* Primeiro, você declara os objetos;
	   Segundo, constroe eles dentro do Método Construtor;
	   Terceiro, adiciona eventos aos objetos que desejar dentro do actionPerformed;
	   Quarto, executa no main.	*/
	
	public static void main(String[] args) {
		
		SegundaClasse janela = new SegundaClasse();
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		// Essa parte abaixo também pode ser feita dentro do Método Construtor:
			
				janela.setLayout(new FlowLayout());		// ESSA É A LINHA 69	
					janela.setTitle("Programa teste");
						janela.setVisible(true);
							janela.setLocationRelativeTo(null);
								janela.setSize(250, 150);
	}
		
}
