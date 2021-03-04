
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {
    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.LoginResponse> responseObserver) {

        System.out.println("Inside Login");

        String username = request.getUsername();
        String password = request.getPassword();

        User.LoginResponse.Builder response = User.LoginResponse.newBuilder();
        if (username.equals(password)) {

            response.setResponseCode("0").setResponseMessage("SUCCESS");
        } else {
            response.setResponseCode("100").setResponseMessage("FAIL");
        }


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void logout(User.Empty request, StreamObserver<User.LoginResponse> responseObserver) {
        super.logout(request, responseObserver);
    }
}
