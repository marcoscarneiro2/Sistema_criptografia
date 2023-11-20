package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CriptografiaServico extends Remote {
    String criptografarTexto(String texto) throws RemoteException;
    String descriptografarTexto(String textoCifrado) throws RemoteException;
}
