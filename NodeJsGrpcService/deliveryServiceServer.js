const grpc = require('grpc');
var uuid = require('uuid-random');
const protoLoader = require('@grpc/proto-loader');
const PROTO_PATH = __dirname + '/protos/delivery.proto';


const packageDefinition = protoLoader.loadSync(
    PROTO_PATH,
    {
        keepCase: true,
        longs: String,
        enums: String,
        defaults: true,
        oneofs: true
    });
var protoDescriptor = grpc.loadPackageDefinition(packageDefinition);
var grpcDelivery = protoDescriptor.delivery;
var clients = new Map();



const scheduledDeliveryList = []
function createDelivery(call, callback) {
    console.log("Recieved request")
    const van = call.request.van 
    van.vanId = uuid()
    tt = JSON.parse(van.itemId)
    // console.log(tt)
    // // newArray = tt.split(",")
    van.itemId = tt
    // newVan = van
    // newVan.itemId = tt
    scheduledDeliveryList.push(van)
    
    callback(null, {van: van}); 

    console.log("Sending", {van: van})
}



// Create the server 
const server = new grpc.Server();
server.addService(grpcDelivery.DeliveryService.service, {
    createDelivery: createDelivery
});

server.bind("0.0.0.0:9003",
    grpc.ServerCredentials.createInsecure());
server.start();

console.log("Server started on port: 9003")
