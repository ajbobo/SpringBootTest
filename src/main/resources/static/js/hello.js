var testingApp = angular.module('TestingApp', []);

testingApp.controller('HelloCtrl', function Hello($scope, $interval, $http) {
    $http.get('http://rest-service.guides.spring.io/greeting')
        .success(function (data) {
            $scope.greeting = data;
        })
        .error(function () {
            $scope.greeting = {
                id: -1,
                content: "Something went wrong"
            };
        });
});