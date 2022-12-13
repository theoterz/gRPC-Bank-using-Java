package com.bank;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.sql.SQLException;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: transactions.proto")
public final class transactionsGrpc {

  private transactionsGrpc() {}

  public static final String SERVICE_NAME = "transactions";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bank.Transactions.LoginRequest,
      com.bank.Transactions.LoginReply> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.bank.Transactions.LoginRequest.class,
      responseType = com.bank.Transactions.LoginReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bank.Transactions.LoginRequest,
      com.bank.Transactions.LoginReply> getLoginMethod() {
    io.grpc.MethodDescriptor<com.bank.Transactions.LoginRequest, com.bank.Transactions.LoginReply> getLoginMethod;
    if ((getLoginMethod = transactionsGrpc.getLoginMethod) == null) {
      synchronized (transactionsGrpc.class) {
        if ((getLoginMethod = transactionsGrpc.getLoginMethod) == null) {
          transactionsGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.bank.Transactions.LoginRequest, com.bank.Transactions.LoginReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.LoginReply.getDefaultInstance()))
                  .setSchemaDescriptor(new transactionsMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bank.Transactions.Data,
      com.bank.Transactions.Reply> getWithdrawalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "withdrawal",
      requestType = com.bank.Transactions.Data.class,
      responseType = com.bank.Transactions.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bank.Transactions.Data,
      com.bank.Transactions.Reply> getWithdrawalMethod() {
    io.grpc.MethodDescriptor<com.bank.Transactions.Data, com.bank.Transactions.Reply> getWithdrawalMethod;
    if ((getWithdrawalMethod = transactionsGrpc.getWithdrawalMethod) == null) {
      synchronized (transactionsGrpc.class) {
        if ((getWithdrawalMethod = transactionsGrpc.getWithdrawalMethod) == null) {
          transactionsGrpc.getWithdrawalMethod = getWithdrawalMethod = 
              io.grpc.MethodDescriptor.<com.bank.Transactions.Data, com.bank.Transactions.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions", "withdrawal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new transactionsMethodDescriptorSupplier("withdrawal"))
                  .build();
          }
        }
     }
     return getWithdrawalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bank.Transactions.Data,
      com.bank.Transactions.Reply> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deposit",
      requestType = com.bank.Transactions.Data.class,
      responseType = com.bank.Transactions.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bank.Transactions.Data,
      com.bank.Transactions.Reply> getDepositMethod() {
    io.grpc.MethodDescriptor<com.bank.Transactions.Data, com.bank.Transactions.Reply> getDepositMethod;
    if ((getDepositMethod = transactionsGrpc.getDepositMethod) == null) {
      synchronized (transactionsGrpc.class) {
        if ((getDepositMethod = transactionsGrpc.getDepositMethod) == null) {
          transactionsGrpc.getDepositMethod = getDepositMethod = 
              io.grpc.MethodDescriptor.<com.bank.Transactions.Data, com.bank.Transactions.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions", "deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new transactionsMethodDescriptorSupplier("deposit"))
                  .build();
          }
        }
     }
     return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bank.Transactions.Empty,
      com.bank.Transactions.Reply> getShowBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showBalance",
      requestType = com.bank.Transactions.Empty.class,
      responseType = com.bank.Transactions.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bank.Transactions.Empty,
      com.bank.Transactions.Reply> getShowBalanceMethod() {
    io.grpc.MethodDescriptor<com.bank.Transactions.Empty, com.bank.Transactions.Reply> getShowBalanceMethod;
    if ((getShowBalanceMethod = transactionsGrpc.getShowBalanceMethod) == null) {
      synchronized (transactionsGrpc.class) {
        if ((getShowBalanceMethod = transactionsGrpc.getShowBalanceMethod) == null) {
          transactionsGrpc.getShowBalanceMethod = getShowBalanceMethod = 
              io.grpc.MethodDescriptor.<com.bank.Transactions.Empty, com.bank.Transactions.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions", "showBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bank.Transactions.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new transactionsMethodDescriptorSupplier("showBalance"))
                  .build();
          }
        }
     }
     return getShowBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static transactionsStub newStub(io.grpc.Channel channel) {
    return new transactionsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static transactionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new transactionsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static transactionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new transactionsFutureStub(channel);
  }

  /**
   */
  public static abstract class transactionsImplBase implements io.grpc.BindableService {

    /**
     * @throws SQLException
     */
    public void login(com.bank.Transactions.LoginRequest request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.LoginReply> responseObserver) throws SQLException {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * @throws SQLException
     */
    public void withdrawal(com.bank.Transactions.Data request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.Reply> responseObserver) throws SQLException {
      asyncUnimplementedUnaryCall(getWithdrawalMethod(), responseObserver);
    }

    /**
     * @throws SQLException
     */
    public void deposit(com.bank.Transactions.Data request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.Reply> responseObserver) throws SQLException {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * @throws SQLException
     */
    public void showBalance(com.bank.Transactions.Empty request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.Reply> responseObserver) throws SQLException {
      asyncUnimplementedUnaryCall(getShowBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bank.Transactions.LoginRequest,
                com.bank.Transactions.LoginReply>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getWithdrawalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bank.Transactions.Data,
                com.bank.Transactions.Reply>(
                  this, METHODID_WITHDRAWAL)))
          .addMethod(
            getDepositMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bank.Transactions.Data,
                com.bank.Transactions.Reply>(
                  this, METHODID_DEPOSIT)))
          .addMethod(
            getShowBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bank.Transactions.Empty,
                com.bank.Transactions.Reply>(
                  this, METHODID_SHOW_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class transactionsStub extends io.grpc.stub.AbstractStub<transactionsStub> {
    private transactionsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionsStub(channel, callOptions);
    }

    /**
     */
    public void login(com.bank.Transactions.LoginRequest request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.LoginReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawal(com.bank.Transactions.Data request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deposit(com.bank.Transactions.Data request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showBalance(com.bank.Transactions.Empty request,
        io.grpc.stub.StreamObserver<com.bank.Transactions.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class transactionsBlockingStub extends io.grpc.stub.AbstractStub<transactionsBlockingStub> {
    private transactionsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bank.Transactions.LoginReply login(com.bank.Transactions.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bank.Transactions.Reply withdrawal(com.bank.Transactions.Data request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bank.Transactions.Reply deposit(com.bank.Transactions.Data request) {
      return blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bank.Transactions.Reply showBalance(com.bank.Transactions.Empty request) {
      return blockingUnaryCall(
          getChannel(), getShowBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class transactionsFutureStub extends io.grpc.stub.AbstractStub<transactionsFutureStub> {
    private transactionsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private transactionsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected transactionsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new transactionsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bank.Transactions.LoginReply> login(
        com.bank.Transactions.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bank.Transactions.Reply> withdrawal(
        com.bank.Transactions.Data request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bank.Transactions.Reply> deposit(
        com.bank.Transactions.Data request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bank.Transactions.Reply> showBalance(
        com.bank.Transactions.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getShowBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_WITHDRAWAL = 1;
  private static final int METHODID_DEPOSIT = 2;
  private static final int METHODID_SHOW_BALANCE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final transactionsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(transactionsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          try {
            serviceImpl.login((com.bank.Transactions.LoginRequest) request,
                (io.grpc.stub.StreamObserver<com.bank.Transactions.LoginReply>) responseObserver);
          } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          break;
        case METHODID_WITHDRAWAL:
          try {
            serviceImpl.withdrawal((com.bank.Transactions.Data) request,
                (io.grpc.stub.StreamObserver<com.bank.Transactions.Reply>) responseObserver);
          } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          break;
        case METHODID_DEPOSIT:
          try {
            serviceImpl.deposit((com.bank.Transactions.Data) request,
                (io.grpc.stub.StreamObserver<com.bank.Transactions.Reply>) responseObserver);
          } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          break;
        case METHODID_SHOW_BALANCE:
          try {
            serviceImpl.showBalance((com.bank.Transactions.Empty) request,
                (io.grpc.stub.StreamObserver<com.bank.Transactions.Reply>) responseObserver);
          } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class transactionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    transactionsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bank.Transactions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("transactions");
    }
  }

  private static final class transactionsFileDescriptorSupplier
      extends transactionsBaseDescriptorSupplier {
    transactionsFileDescriptorSupplier() {}
  }

  private static final class transactionsMethodDescriptorSupplier
      extends transactionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    transactionsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (transactionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new transactionsFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getWithdrawalMethod())
              .addMethod(getDepositMethod())
              .addMethod(getShowBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
