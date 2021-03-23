// load the things we need
var express = require('express');
const axios = require('axios');
const createClient = require('../client');



// use express
var app = express();



// set the view engine to ejs
app.set('view engine', 'ejs');



// very same thing as in databaseService.js
const serviceDefinition = {
  name: 'DeliveryService',
  ipv4: '127.0.0.1',
  port: 3001
};






// create a new map to store the locations we care about
const serviceLocations = new Map();





// ### use res.render to load up an ejs view file
// index page
app.get('/', async (req, res) => {

  const dbService = serviceLocations.get('databaseService');
  const response = await axios.get(`http://${dbService.ipv4}:${dbService.port}/db`);

  // res.send(response.data);
  res.render('pages/index', { response: response.data });
});



// about page
app.get('/delivery', async (req, res) => {
  const response = await axios.get(`localhost:9002`);

  console.log(response)
  // res.send(response.data);
  res.render('pages/about', { response: response.data });
});



app.listen(serviceDefinition.port, () => {
  console.log(`${serviceDefinition.name} listens on port ${serviceDefinition.port}`)
});



const registerService = async () => {
  const client = await createClient();
  await client.register(serviceDefinition);

  const { registrations: [dbService] } = await client.fetchServiceLocation({
    registrations: [
      { name: 'databaseService' }
    ]
  });

  serviceLocations.set('databaseService', dbService);

}

registerService();
