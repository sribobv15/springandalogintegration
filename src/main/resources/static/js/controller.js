app.controller('usersController', function ($scope) {
    $('#mainPagediv').hide();
    $scope.getHostUrl = function () {
        var str = window.location.href.split('\/');
        return str[0] + '//' + str[2];
    }
    var reqUrl = $scope.getHostUrl() + '/api/patients/';
    $.ajax({
        type: "GET",
        url: reqUrl,
        success: function (data) {
            $scope.allpatients = data;
        }
    });
    $scope.approveData = function (postdata) {
        var x = {
            "id": postdata.id,
            "sampleid": postdata.sampleid,
            "date": postdata.date,
            "patientid": postdata.patientid,
            "age": postdata.age,
            "doctorname": postdata.doctorname,
            "neocolbm1": postdata.neocolbm1,
            "neocolbm2": postdata.neocolbm2,
            "neocolbm3": postdata.neocolbm3,
            "neocolbm4": postdata.neocolbm4,
            "neocolbm5": postdata.neocolbm5,
            "neocolbm6": postdata.neocolbm6,
            "approved": true,
            "remarks": postdata.remarks
        };
        $.ajax({
            url: $scope.getHostUrl() + '/api/patients/' + postdata.id,
            type: 'PUT',
            data: JSON.stringify(x),
            dataType: "json",
            contentType: "application/json",
            success: function (data) {
                $('#serverresponse').html("<span style='color: green;'><b>Approved patient record with id: " + data + " <br>Note:please save the id for future reference</b></span>");            }
        });
    }
});

app.controller('doctorController', function ($scope) {
    $('#mainPagediv').hide();
    $scope.calculateNeoCol = function () {
        var gender = $scope.gender;
    }
});

app.controller('homeController', function ($scope, $http) {
    $('#mainPagediv').hide();
    $scope.getHostUrl = function () {
        var str = window.location.href.split('\/');
        return str[0] + '//' + str[2];
    }

    $scope.convertDate = function (inputFormat) {
        function pad(s) {
            return (s < 10) ? '0' + s : s;
        }

        var d = new Date(inputFormat);
        return [pad(d.getDate()), pad(d.getMonth() + 1), d.getFullYear()].join('/');
    }

    $scope.searchData = function () {
        var reqUrl = $scope.getHostUrl() + '/api/patients/' + $scope.patient.uniqueid;
        $.ajax({
            type: "GET",
            url: reqUrl,
            success: function (data) {
                $scope.patient = data;
            }
        });
    }

    $scope.updateData = function (id) {
        var postdata = $scope.patient;
        var x = {
            "id":id,
            "sampleid": postdata.sampleid,
            "date": postdata.date,
            "patientid": postdata.patientid,
            "age": postdata.age,
            "doctorname": postdata.doctorname,
            "neocolbm1": postdata.neocolbm1,
            "neocolbm2": postdata.neocolbm2,
            "neocolbm3": postdata.neocolbm3,
            "neocolbm4": postdata.neocolbm4,
            "neocolbm5": postdata.neocolbm5,
            "neocolbm6": postdata.neocolbm6,
            "approved": true,
            "remarks": postdata.remarks
        };
       var url = $scope.getHostUrl() + '/api/patients/' +id;
        $.ajax({
            url: url,
            type: 'PUT',
            data: JSON.stringify(x),
            dataType: "json",
            contentType: "application/json",
            success: function (data) {
                $('#serverresponse').html("<span style='color: green;'><b>Updated patient record with id: " + data + " <br>Note:please save the id for future reference</b></span>");
            }
        });
    }

    $scope.saveNewData = function () {
        var reqUrl = $scope.getHostUrl() + '/api/patients';
        var postdata = $scope.patient;
        reqUrl = reqUrl + '?age=' + postdata.age + '&approved=false&date=' + postdata.date + '&doctorname=' + postdata.doctorname + '&id=123&neocolbm1=' + postdata.neocolbm1 + '&neocolbm2=' + postdata.neocolbm2 + '&neocolbm3=' + postdata.neocolbm3 + '&neocolbm4=' + postdata.neocolbm4 + '&neocolbm5=' + postdata.neocolbm5 + '&neocolbm6=' + postdata.neocolbm6 + '&patientid=' + postdata.patientid + '&remarks=' + postdata.remarks + '&sampleid=' + postdata.sampleid;
        postdata.approved = false;
        $.ajax({
            type: "POST",
            url: reqUrl,
            success: function (data) {
                $('#serverresponse').html("<span style='color: green;'><b>Created a new unique patient record with id: " + data + " <br>Note:please save the id for future reference</b></span>");
            }
        });
    }
});

app.controller('loginController', function ($scope, $location) {
    $scope.checkRedirectLogin = function () {
        if ($scope.logintype.indexOf('Physician') > -1) {
            // load physician page
            window.location.href = window.location.href + "doctor";
        } else if ($scope.logintype.indexOf('Approver') > -1) {
            //load approver page
            window.location.href = window.location.href + "users";
        } else {
            //load technician page
            window.location.href = window.location.href + "home";
        }
        document.getElementById('id01').style.display = 'none';
    };
});