package servidor;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // Inicialize o registro RMI na porta padrão (1096)
            LocateRegistry.createRegistry(1099);

            // Crie uma instância do serviço e ligue-a ao registro RMI
            CriptografiaServico criptoServico = new CriptografiaServicoImpl();
            //Naming.rebind("rmi://localhost/CriptografiaServico", criptoServico);
            System.setProperty("java.rmi.server.useCodebaseOnly", "false");

            Naming.rebind("rmi://0.0.0.0:1099/CriptografiaServico", criptoServico);
            

            System.out.println("Servidor RMI pronto para receber chamadas...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
