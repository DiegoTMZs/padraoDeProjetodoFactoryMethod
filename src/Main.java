import models.EmailFactory;
import models.NotificacaoFactory;
import models.PushFactory;
import models.SMSFactory;

public class Main {
    public static void main(String[] args) {

        NotificacaoFactory fabrica = new SMSFactory();

        fabrica.notificarUsuario("Código de verificação: 123456.");

        System.out.println("-------------------------------------------------");

        fabrica = new PushFactory();
        fabrica.notificarUsuario("Você tem uma nova mensagem.");

        System.out.println("-------------------------------------------------");

        fabrica = new EmailFactory();
        fabrica.notificarUsuario("Você ganhou uma viagem para Disney. Clique aqui!");
    }
}