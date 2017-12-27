<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Sureson.lk</title>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css"/>


<link rel='stylesheet prefetch'
	href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'/>


<link rel="stylesheet" href="css/style1.css"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="css/style1.css"/>
<link rel="stylesheet" href="css/login_form.css"/>
</head>
<body>

	<div id="main_container">
		<!-- The Modal -->
		<div id="myModal" class="modal">

			<!-- Modal content -->
			<div class="modal-content" style="width: 30%">

				<span class="close">&times;</span>

				<form action="#">


					<div class="container" style="width: 90%">
						<label><b>Username</b></label> <input type="text"
							placeholder="Enter Username" name="uname" required> <label><b>Password</b></label>
						<input type="password" placeholder="Enter Password" name="psw"
							required>

						<button type="submit">Login</button>
						<input type="checkbox" checked="checked"> Remember me
					</div>

					<div class="container" style="background-color: #f1f1f1">
						</b></label> <a href="register.jsp"><button type="button" class="cancelbtn">Create
								Account</button></a> <span class="psw">Forgot <a href="#">password?</a></span>
					</div>
				</form>


				<a href="#"><button class="loginBtn loginBtn--facebook">
						Login with Facebook</button></a>

				<button class="loginBtn loginBtn--google">Login with Google
				</button>

			</div>

		</div>
		<div id="header"></div>
		<div id="main_content">
			<div id="menu_tab">
				<ul class="menu">
					<li><a id="home" href="index.jsp" class="nav"> Home</a></li>
					<li class="divider"></li>
					<li><a href="allAdds.jsp" class="nav">All Adds</a></li>
					<li class="divider"></li>
					<li><a href="#" class="nav">Specials</a></li>
					<li class="divider"></li>
					<li><a href="addPost.jsp" class="nav">My Posts</a></li>
					<li class="divider"></li>
					<li><a href="contact.html" class="nav">Contact Us</a></li>
					<li class="divider"></li>
					<li><a href="details.html" class="nav">About Us</a></li>
					<li class="divider"></li>
					<li style="float: right; margin-right: -7px; margin-top: 0">
						<div class="title_box" id="myLoginBtn" style="color: red">Sign
							Up</div>
					</li>
				</ul>
			</div>
			<!-- end of menu tab -->
			<!-- <div class="crumb_navigation"> Navigation: <span class="current">Home Page</span> </div> -->
			<div class="left_content">
				<div class="title_box">Categories</div>
				<ul class="left_menu">
					<li class="even"><a href="viewCat.jsp?cat=Moblie Phones">Moblie
							Phones</a></li>
					<li class="odd"><a href="viewCat.jsp?cat=Vehicals">Vehicals</a></li>
					<li class="even"><a href="#">Lands</a></li>
					<li class="odd"><a href="#">Houses</a></li>
					<li class="even"><a href="#">Laptops</a></li>
					<li class="odd"><a href="#">Tabs</a></li>
					<li class="even"><a href="#">Clothes</a></li>
					<li class="odd"><a href="viewCat.jsp?cat=pillows">Pillows</a></li>
					<li class="even"><a href="#">Furnitures</a></li>
					<li class="odd"><a href="#">Tutions</a></li>
					<li class="even"><a href="#">Power Banks</a></li>
					<li class="odd"><a href="#">Others</a></li>
				</ul>
				<div class="title_box">Special Products</div>
				<div class="border_box">
					<div class="product_title">
						<a href="viewDetails2.jsp"></a>
					</div>
					<div class="product_img">
						<a href=""><img src="images/curtain.jpg" alt="" border="0"
							width="150" height="150" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="title_box">Newsletter</div>
				<div class="border_box">
					<input type="text" name="newsletter" class="newsletter_input"
						value="your email" /> <a href="#" class="join">subscribe</a>
				</div>
				<div class="banner_adds">
					<a href="addPost.jsp"><img src="images/putadd.jpg" width="160"
						height="224" alt="" border="0" /></a>
				</div>
			</div>
			<!-- end of left content -->
			<div class="center_content">

				<div class="" style="width: 100%">

					<form id="form_id" name="form"  method="post">
						<div class="container" style="width: 90%">
							<label><b>Username</b></label> <input type="text" placeholder="Enter Username" name="uname" id="u_name"  pattern="[a-z]{1,15}" title="Username should only contain lowercase letters. e.g. kamal" required/> 
							<label><b>Email</b></label> <input type="email" placeholder="Enter email" name="emauil_us" id="email" required  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title=" e.g. xxx@gmail.com" /> 
							<label><b>Phone Number</b></label> <input type="tel" placeholder="Enter Phone Number" name="phone" pattern="^\d{10}$" id="phone_nu"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title=" e.g. 071xxxxxxx"	required/>
							<label><b>Password</b></label> <input type="password" placeholder="Enter Password" name="psw" required   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"  id="password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" />
							<label><b>Confirm Password</b></label> <input type="password" placeholder="Confirm Password" name="psw1" required id="confirm_password"/>
						    </fieldset>											   
							<button type="submit" id="submit">Register</button> 
							<input	type="checkbox" checked="checked"/> Remember me 
						</div>
					</form> <!-- This form goes to form_validatgion.js -->
					<a href="#"><button class="loginBtn loginBtn--facebook">
							Login with Facebook</button></a>

					<button class="loginBtn loginBtn--google">Login with
						Google</button>

				</div>


			</div>
			<!-- end of center content -->
			<div class="right_content">
				<div class="title_box">Search</div>
				<div class="border_box">


					<form action="search.jsp" method="post" style="height: 100%">
						<input type="text" name="searchWord" placeholder="search here"
							style="height: 50%" /> <input style="height: 50%" type="submit"
							style="height:10px;font-size: 20px" />
					</form>



				</div>

				<div class="title_box">Areas</div>
				<ul class="left_menu">

					<li class="even"><a href="viewArea.jsp?area=western">Western
							Province</a></li>
					<li class="odd"><a href="viewArea.jsp?area=southern">Southren
							Province</a></li>

					<li class="even"><a href="#">North Wesaten Province</a></li>
					<li class="odd"><a href="#">Nortyh Province</a></li>
					<li class="even"><a href="#">other province</a></li>
					<li class="odd"><a href="#">other province</a></li>
					<li class="even"><a href="#">other province</a></li>
					<li class="odd"><a href="#">Central Province</a></li>
					<li class="even"><a href="#">other province</a></li>
				</ul>
				<div class="banner_adds">
					<a href="addPost.jsp"><img src="images/putadd.jpg"
						alt="no banner" width="160" height="224" border="0" /></a>
				</div>
				<!-- theere is call to advertise image also-->
			</div>
			<!-- end of right content -->
		</div>
		<!-- end of main content -->

		<div class="footer">

			<div class="left_footer">
				<img src="images/logo.png" alt="" width="89" height="35" />
			</div>
			<div class="center_footer">
				sureson.lk<br />
			</div>
			<div class="right_footer">
				<a href="#">home</a> <a href="#">about</a> <a href="#">sitemap</a> <a
					href="#">rss</a> <a href="#">contact us</a>
			</div>
		</div>
	</div>
	<!-- end of main_container -->
	<script>
		// var myIndex1 = 0;
		var myIndex = 0;
		carousel();
		function carousel() {
			var i;
			var x = document.getElementsByClassName("oferta_img");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 1500); // Change image every 2 seconds
			//next

		}
	</script>

    <script src="js/form_validation.js"></script>
    <script src='js/modal.js'></script>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

	<script src="js/index1.js"></script>

</body>
</html>
