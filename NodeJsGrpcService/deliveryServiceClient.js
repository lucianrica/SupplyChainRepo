const grpc = require("grpc");
const protoLoader = require("@grpc/proto-loader");
var uuid = require('uuid-random');

const packageDef = protoLoader.loadSync("./protos/delivery.proto", {});
// const rawMaterialDef = protoLoader.loadSync("./protos/rawMaterial.proto", {});

const grpcObject = grpc.loadPackageDefinition(packageDef);
// const grpcRawMaterialObject = grpc.loadPackageDefinition(rawMaterialDef);

const deliveryPackage = grpcObject.deliveryPackage;
// const grpcRawMaterialPackage = grpcRawMaterialObject.source;



const client = new deliveryPackage.DeliveryService(
    "localhost:9003",
    grpc.credentials.createInsecure()
);

// const client2 = new grpcRawMaterialPackage.RawMaterialService(
//     "localhost:9002",
//     grpc.credentials.createInsecure()
// );


// client2.GetAllRawMaterials(null, (err, res) => {

//     console.log(res)
//     res.forEach( r => {

//         console.log("recieved from JAVA server " + r)
//     })
// })


const x = uuid()
const xx = uuid()
const xxx = uuid()
const arr = []
arr.push(x)
arr.push(xx)
arr.push(xxx)

let van = {
    "drivers": 12,
    "volume": 200,
    "delivering": true,
    "fulfilled": false,
    "itemId": arr
}

client.createDelivery({
    "van": van


}, (err, res) => {
    console.log("recieved from server " + JSON.stringify(res))
})
















