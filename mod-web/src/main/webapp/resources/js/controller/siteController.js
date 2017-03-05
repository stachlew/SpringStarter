angular.module('app')
    .controller('siteController',siteController);

siteController.$inject=['$scope','$log'];

function siteController($scope,$log){
    $log.info("siteController");
}

