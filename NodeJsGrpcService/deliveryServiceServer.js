const grpc = require("grpc");
const protoLoader = require("@grpc/proto-loader");
var uuid = require('uuid-random');

const packageDef = protoLoader.loadSync("./protos/delivery.proto", {});
const grpcObject = grpc.loadPackageDefinition(packageDef);
const deliveryPackage = grpcObject.deliveryPackage;



// Create the server 
const server = new grpc.Server();
server.bind("0.0.0.0:9003", grpc.ServerCredentials.createInsecure());
server.addService(deliveryPackage.DeliveryService.service, {
    "createDelivery": createDelivery
});
server.start();
console.log("Server started on port: 9003")



const scheduledDeliveryList = []
function createDelivery(call, callback) {
    console.log(call.request.van)

    const van = call.request.van
    scheduledDeliveryList.push(van);

    callback(null, { "van": scheduledDeliveryList });
}


