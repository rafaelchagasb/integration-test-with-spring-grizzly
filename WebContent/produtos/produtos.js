
app.controller("ProdutosController", function($scope, $http) {
	
	$http.get('/myapp/myresource/list').
    
    success(function(data, status, headers, config) {
      $scope.produtos = data;
    }).

    error(function(data, status, headers, config) {
      // log error
    });

});	