package unidade5;
import javax.swing.JOptionPane;
public class TesteEntrada {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o sal�rio"));
        double salarioLiquido = salario * 0.89;
        String resultado = "Nome: " + nome + "\n" +
                "Sal�rio Bruto: R$ " + salario + "\n" +
                "Sal�rio L�quido: R$ " + salarioLiquido;        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
