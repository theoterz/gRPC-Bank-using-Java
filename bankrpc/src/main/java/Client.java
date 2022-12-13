import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.bank.transactionsGrpc;
import com.bank.Transactions.Data;
import com.bank.Transactions.Empty;
import com.bank.Transactions.LoginReply;
import com.bank.Transactions.LoginRequest;
import com.bank.Transactions.Reply;
import com.bank.transactionsGrpc.transactionsBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client
{
    static Scanner usr = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 4321).usePlaintext().build();

        //stub generation
        transactionsBlockingStub transactionStub =  transactionsGrpc.newBlockingStub(channel);
        //

        LoginReply loginReply;
        String login="";
        int id=0;
        
        while(!login.equals("Success"))
        {
            System.out.println("Username:");
            String username = usr.nextLine();
            System.out.println("Password:");
            String password = usr.nextLine();
            LoginRequest request = LoginRequest.newBuilder().setUsername(username).setPassword(password).build();

            loginReply = transactionStub.login(request);
            login = loginReply.getResponce();
            id = loginReply.getId();
            if(login.equals("Failure")) System.out.println("Wrong username or password! Try again.");
        }

        Protocol protocol = new Protocol();
        Data data;
        double amm = 0;
        Reply reply;
        Empty emp;

        protocol.printMenu();
        int input = protocol.getInput();

        while(input!=4)
		{
			switch(input)
        	{
            case(1):
                System.out.println("\nEnter Ammount");
                amm = usr.nextDouble();
                data = Data.newBuilder().setAmmount(amm).setId(id).build();
                reply = transactionStub.withdrawal(data);
                System.out.println(reply.getResponce());
				break;
            case(2):
                System.out.println("\nEnter Ammount");
                amm = usr.nextDouble();
                data = Data.newBuilder().setAmmount(amm).setId(id).build();
                reply = transactionStub.deposit(data);
                System.out.println(reply.getResponce());
				break;
            case(3):
                emp = Empty.newBuilder().setId(id).build();
                reply = transactionStub.showBalance(emp);
                System.out.println(reply.getResponce());
				break;
            default:
                break;
        	}

			protocol.printMenu();
			input = protocol.getInput();

		}

        System.out.println("Connection closed.");
        channel.shutdown().awaitTermination(5, TimeUnit.NANOSECONDS);
    }
    
}
