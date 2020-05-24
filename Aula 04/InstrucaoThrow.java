import javax.swing.JOptionPane;

public class InstrucaoThrow {
    public static void main(String args[]) {
	    float nota = Float.parseFloat(JOptionPane.showInputDialog("Forne�a um valor num�rico entre 0 e 10"));
        try {              
                if (nota < 0 || nota > 10) {
                    throw new Exception("Fora da faixa permitida (0 e 10)");
                }
                // continua a execu��o normalmente
            }
            catch (Exception erro) {
                JOptionPane.showMessageDialog(null, erro.toString());
            }
        System.exit(0);
    }
}