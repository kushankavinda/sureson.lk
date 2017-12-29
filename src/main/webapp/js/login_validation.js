var login_uname= document.getElementById("login_uname");
var login_psw= document.getElementById("login_psw");

function login_req() {	
		var http = new XMLHttpRequest();
		var url = "Login";
		var params = "login_uname=" + login_uname.value+"&login_psw="+login_psw.value;
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
// calling backend using ajax when register button onclick
login_button.onclick = login_req;