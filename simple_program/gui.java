import javax.swing.JOptionPane;

class gui{
	public static void main(String args[]){
		String fn = JOptionPane.showInputDialog("Enter First Number!");
		int num1 = Integer.parseInt(fn);

		num1 += 5;

		JOptionPane.showMessageDialog(null, "The answer is " +num1);
	}
}
