import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args){
	
		banco b = new banco();
	
		String op = JOptionPane.showInputDialog("Insira a op��o desejada:\n\n [1] Ver saldo");
		int a = Integer.parseInt(op);
		
		if(a == 1){
			b.verSaldo();
		} else {
			JOptionPane.showMessageDialog(null, "Op��o inexistente...");
		}
	}
}
