import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		float peso,estatura,imc;
		peso= Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu peso (em Kg): ","Peso", JOptionPane.INFORMATION_MESSAGE));
		estatura= Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua estatura (em m): ","Estatura", JOptionPane.INFORMATION_MESSAGE));
		imc= peso/(estatura*estatura);
		JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + " Kg/m²",
				"IMC", JOptionPane.INFORMATION_MESSAGE);
	}
	public float calculaIMC(float p, float est) {
		return ( p / (est*est) );
		
	}

}
