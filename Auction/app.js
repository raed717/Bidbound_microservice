const express = require('express');
const app = express(); 
const morgan = require('morgan');
const mongoose = require('mongoose');
const cors = require('cors');
const authJwt = require('./helpers/jwt');
const errorHandler = require('./helpers/error-handler');
 require('dotenv/config');
const api = process.env.API_URL;

const eureka = require('eureka-js-client').Eureka;

const eurekaClient = new eureka({
  instance: {
    app: 'AuctionMicroservice',  
    hostName: 'localhost',
    ipAddr: '127.0.0.0',
    port: {
      '$': 3000,  
      '@enabled': true,
    },
    vipAddress: 'AuctionService',  
    dataCenterInfo: {
      '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
      name: 'MyOwn',
    },
  },
  eureka: {
    host: 'localhost', 
    port: 8761,  
    servicePath: '/eureka/apps/',
    fetchRegistry: true,
    registerWithEureka: true,
  },
});

eurekaClient.logger.level('debug');  

eurekaClient.start((error) => {
  if (error) {
    console.log('Error in registering with Eureka: ', error);
  } else {
    console.log('Registered with Eureka successfully');
  }
});
module.exports = eureka;

  
 
app.use(cors({
  origin: 'localhost:8761',
}));
app.options('*',cors ());
app.use(express.json()); 
app.use(morgan('tiny'));
app.use(authJwt());
app.use(errorHandler);

const Router = require('./routers/auctionRouter');

//Routes
app.use(`${api}/auction`, Router);


 
 mongoose.connect(process.env.CONNECTION_STRING, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
    dbName: 'auction-database',
  })
    .then(() => {
      console.log('Database Connection is ready...')
    })
    .catch((err) => {
      console.log(err);
    })
  
  app.listen(3000, () => {
    console.log('Server is running http://localhost:3000');
  });
  
module.exports = app;
 