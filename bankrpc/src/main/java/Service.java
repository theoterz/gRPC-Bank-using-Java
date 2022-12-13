import java.sql.SQLException;

import com.bank.Transactions.Data;
import com.bank.Transactions.Empty;
import com.bank.Transactions.LoginReply;
import com.bank.Transactions.LoginRequest;
import com.bank.Transactions.Reply;
import com.bank.transactionsGrpc.transactionsImplBase;

import io.grpc.stub.StreamObserver;

public class Service extends transactionsImplBase 
{

    DbCon connection = new DbCon();

    public Service()
    {
        connection.doConnection();
    }

    @Override
    public void deposit(Data request, StreamObserver<Reply> responseObserver) throws SQLException {
        
        Reply.Builder responce = Reply.newBuilder();;

        responce.setResponce(connection.deposit(request.getAmmount(), request.getId()));

        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }

    @Override
    public void login(LoginRequest request, StreamObserver<LoginReply> responseObserver) throws SQLException {
        
        LoginReply.Builder responce = LoginReply.newBuilder();

        if (connection.authenticateUser(request.getUsername(), request.getPassword()))
        {
            responce.setResponce("Success");
            responce.setId(connection.getId(request.getUsername(), request.getPassword()));
        }
        else 
        {
            responce.setResponce("Failure");
            responce.setId(-1);
        }
        
        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }

    @Override
    public void showBalance(Empty request, StreamObserver<Reply> responseObserver) throws SQLException {
        
        Reply.Builder responce = Reply.newBuilder();

        responce.setResponce(connection.showBalance(request.getId()));

        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }

    @Override
    public void withdrawal(Data request, StreamObserver<Reply> responseObserver) throws SQLException {
        
        Reply.Builder responce = Reply.newBuilder();

        responce.setResponce(connection.withdrawal(request.getAmmount(), request.getId()));

        responseObserver.onNext(responce.build());
        responseObserver.onCompleted();
    }
    
}
