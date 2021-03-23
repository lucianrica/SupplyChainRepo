// we create an express instance
// and we pull in the the function to create an gRPC client we defined before
var express = require('express');
const axios = require('axios');
const createClient = require('../client');



// use express
var app = express();



// this is on our localmachine
// hence we know for sure where what location this process has.
const serviceDefinition = {
  name: 'databaseServicee',
  ipv4: '127.0.0.1',
  port: 3000
};


// just a example response that our db could return
const dbArray = {
  products: [
    { "name": "aa" }
  ],
  rawMaterials: [
    { "name": "aaaa" },
    {
      "rawMaterialId": 1,
      "rawMaterialName": "iron",
      "rawMaterialsInStock": 3,
      "rawMaterialsVolume": 40,
      "rawMaterialsPrice": 5.00,
    }
  ]
}



// first start the server and
// then register at the discovery service
app.get('/db', (req, res) => {
  res.send(dbArray)
})

app.listen(serviceDefinition.port, () => {
  console.log(`${serviceDefinition.name} listens on ${serviceDefinition.port}`)
});

const registerService = async () => {
  const client = await createClient();
  const response = await client.register(serviceDefinition);
}

registerService();
