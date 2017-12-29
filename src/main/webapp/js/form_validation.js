var uname= document.getElementById("u_name");
var emauil_us= document.getElementById("email");
var phone= document.getElementById("phone_nu");
var password = document.getElementById("password");
var confirm_password = document.getElementById("confirm_password");

function validateForm() {
	 /*var regex = /^[a-zA-Z]+$/;
	    if(regex.test(letters.uname.value) == true){
	    	uname.setCustomValidity("name is okay");
	    }*/
    //check all the validation here and all are correect check password and confirm password else go register.jsp page again-----------------
	
	if (password.value != confirm_password.value) {
		confirm_password.setCustomValidity("Passwords Don't Match");
	} else {
		confirm_password.setCustomValidity("Passwords Match");
		// pass values to backend using ajax
		var http = new XMLHttpRequest();
		var url = "GetRegisterUser";
		var params = "uname=" + uname.value+"&emauil_us="+emauil_us.value+"&phone="+phone.value+"&password="+password.value;
		http.open("POST", url, true);
		// Send the proper header information along with the request
		http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		http.onreadystatechange = function() {
			// Call a function when the state changes.
			if (http.readyState == 4 && http.status == 200) {
				// sucees message
			}
		}
		http.send(params);
	}
	    
}
// calling backend using ajax when register button onclick
submit.onclick = validateForm;