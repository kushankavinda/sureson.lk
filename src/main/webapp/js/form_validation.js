var password = document.getElementById("password");
var confirm_password = document.getElementById("confirm_password");

function validatePassword() {
	if (password.value != confirm_password.value) {
		confirm_password.setCustomValidity("Passwords Don't Match");
	} else {
		confirm_password.setCustomValidity("Passwords Match");
		//document.getElementById("form_id").action = "index.jsp"; // Setting form action
		/*$( "#target" ).click(function() {
			alert( "Handler for .click() called." );
			// call validate password
			// call validate form
			// on submit ajax (url java function) // XHR validate in the java
		});*/
	}
}

/*$( "#target" ).click(function() {
	alert( "Handler for .click() called." );
	// call validate password
	// call validate form
	// on submit ajax (url java function) // XHR validate in the java
});*/
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
}*/

confirm_password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;
