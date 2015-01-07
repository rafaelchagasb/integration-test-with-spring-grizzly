var app = angular.module("myapp",[]); 

//creating route

app.config(function($routeProvider,$httpProvider,$locationProvider){

       $routeProvider.

       when("/produtos",{templateUrl:"produtos/produtos.html"});

});

