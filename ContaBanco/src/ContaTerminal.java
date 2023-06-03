import java.util.Locale;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

public class ContaTerminal {
    public static void main(String[] args)  throws Exception {

        //TODO: Conhecer e importar a classe Scanner.
        //Exibir as mensagens para o nosso usuario.
        //Obter pela scanner os valores digitados no terminal.
        //Exibir a mensagem conta criada.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ITALY);

        var cliente = ("Douglas Liandi");
        var saldo = (237.48);        

        System.out.println("Por favor, digite o numero da Agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da conta com o digito:");
        String conta = scanner.next();

        System.out.println("Ola"+ " " + cliente + ", seja bem vindo!" + " " +"Seu saldo atual é: R$ " + saldo);
        System.out.println("Digite 'Avancar' para menu de transacoes ou 'Sair'");
 }
    
}

