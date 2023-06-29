import javax.swing.JOptionPane;

public class banco {

	private double saldo;
	
	public void verSaldo(){
		JOptionPane.showMessageDialog(null, "Saldo: R$" + this.saldo);
	}
	
}
