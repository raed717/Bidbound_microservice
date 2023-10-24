const eureka = require('eureka-js-client').Eureka;

const eurekaClient = new eureka({
  instance: {
    app: 'AuctionMicroservice',  
    hostName: 'localhost',
    ipAddr: '127.0.0.1',
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
