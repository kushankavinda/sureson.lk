var password = document.getElementById("password");
var confirm_password = document.getElementById("confirm_password");

function validatePassword() {
	if (password.value != confirm_password.value) {
		confirm_password.setCustomValidity("Passwords Don't Match");
	} else {
		confirm_password.setCustomValidity("Passwords Match");
		/*$( "#target" ).click(function() {
			alert( "Handler for .click() called." );
			// call validate password
			// call validate form
			// on submit ajax (url java function) // XHR validate in the java
		});*/
		/* var xhr = new XMLHttpRequest();
		    xhr.onreadystatechange = function() {
		        if (xhr.readyState == 4) {
		            var data = xhr.responseText;
		            alert(data);
		        }
		    }
		    xhr.open('POST', 'GetRegisterUser', true);
		    xhr.send("password");*/
		var http = new XMLHttpRequest();
		var url = "GetRegisterUser";
		var params = "uname="+password.value;
		http.open("POST", url, true);

		//Send the proper header information along with the request
		http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

		http.onreadystatechange = function() {//Call a function when the state changes.
		    if(http.readyState == 4 && http.status == 200) {
		       //sucees message
		    }
		}
		http.send(params);
	}
}

//$( "#target" ).click(function() {
//	alert( "Handler for .click() called." );
//	// call validate password
//	// call validate form
//	// on submit ajax (url java function) // XHR validate in the java
//});
//document.getElementById("form_id").submit();    // Submit the form
/*$.'#submit'.on('click'){
	$.ajax({
        type: 'GET',
        url: localhost:8080/,
        dataType: "json",
        success: function(data){
            if (data) {
            	// redirect to index
            }
            else {
            	// alert error
            }
        }
    });
}
*/
confirm_password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;
