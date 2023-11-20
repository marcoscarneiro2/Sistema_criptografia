package cliente;
import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            // Localize o serviço remoto no registro RMI
            //CriptografiaServico criptoServico = (CriptografiaServico) Naming.lookup("rmi://localhost/CriptografiaServico");

        	CriptografiaServico criptoServico = (CriptografiaServico) Naming.lookup("rmi://0.0.0.0:1099/CriptografiaServico");

            // Use os métodos remotos conforme necessário
            String textoCifrado = criptoServico.criptografarTexto("Texto a ser criptografado");
            System.out.println("Texto Criptografado: " + textoCifrado);

            String textoOriginal = criptoServico.descriptografarTexto(textoCifrado);
            System.out.println("Texto Descriptografado: " + textoOriginal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
