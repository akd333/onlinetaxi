<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<style>
.card {
	border-radius: 1rem;
}

:root { -
	-input-padding-x: 1.5rem; -
	-input-padding-y: .75rem;
}

body {
	background: #007bff;
	background: linear-gradient(to right, #0062E6, #33AEFF);
}

.btn {
	margin-top: 10%;
	margin-left: 60%;
	border-radius: 5rem;
	letter-spacing: .1rem;
	font-weight: bold;
	padding: 1rem;
	transition: all 0.2s;
	margin-bottom: 5%;
}

.card-signin {
	border: 0;
	border-radius: 1rem;
	box-shadow: 0 0.5rem 1rem 0 rgba(0, 0, 0, 0.1);
	height: 90%;
}

.card-signin .card-title {
	margin-bottom: 2rem;
	font-weight: 300;
	font-size: 1.5rem;
}

.card-signin .card-body {
	padding: 2rem;
}

.form-signin {
	width: auto;
}

.form-signin .btn {
	font-size: 80%;
	border-radius: 5rem;
	letter-spacing: .1rem;
	font-weight: bold;
	padding: 1rem;
	transition: all 0.2s;
	margin-bottom: -30px;
}

.form-label-group {
	position: relative;
	margin-bottom: 1rem;
}

.form-label-group input {
	height: auto;
	border-radius: 2rem;
}

.form-label-group>input, .form-label-group>label {
	padding: var(- -input-padding-y) var(- -input-padding-x);
}

.form-label-group>label {
	position: absolute;
	top: 0;
	left: 0;
	display: block;
	width: 100%;
	margin-bottom: 0;
	/* Override default `<label>` margin */
	line-height: 1.5;
	color: #495057;
	border: 1px solid transparent;
	border-radius: .25rem;
	transition: all .1s ease-in-out;
}

.form-label-group input::-webkit-input-placeholder {
	color: transparent;
}

.form-label-group input:-ms-input-placeholder {
	color: transparent;
}

.form-label-group input::-ms-input-placeholder {
	color: transparent;
}

.form-label-group input::-moz-placeholder {
	color: transparent;
}

.form-label-group input::placeholder {
	color: transparent;
}

.form-label-group
 
input
:not
 
(
:placeholder-shown
 
)
{
padding-top
:
 
calc
(var(-
 
-input-padding-y
)
+
var
(-
 
-input-padding-y
)
*
 
(2/3));
padding-bottom
:
 
calc
(var(-
 
-input-padding-y
)/3);


}
.form-label-group input:not (:placeholder-shown )~label {
	padding-top: calc(var(- -input-padding-y)/3);
	padding-bottom: calc(var(- -input-padding-y)/3);
	font-size: 12px;
	color: #777;
}

body {
	width: 100%
}

a {
	text-decoration: none;
	display: inline-block;
	padding: 8px 16px;
}

::-webkit-scrollbar {
	display: none;
}
</style>
</head>
<body>
	<div class="container">
		<div class="card card-signin my-5">
			<div class="card-body">
				<div class="row">
					<div class="col-md-4">
						<img src="images/logo.jpg" width="200" height="100" />
					</div>
					<div class="col-md-4">
						<h5 class="card-title text-center" style="color: red">
							<b>Online Taxi</b>
						</h5>
					</div>
					<div class="col-md-4"></div>
				</div>
				<form class="form-signin" action="/save" method="post"> 
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="fromairport">From Airport</label></b> <select
									class="form-control">
									<option>Select Airport</option>
									<option>Bhubaneswar</option>									
								</select>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Toairport">To City</label></b> <select
									class="form-control">
									<option>Select City</option>
								</select>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="contact">Contact</label></b> <input type="text"
									name="mobileNumber" class="form-control"
									placeholder="Enter mobile no">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b><label for="Emailid">Email Id</label></b> <input type="text"
									name="emailId" class="form-control"
									placeholder="Enter Email Id">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Booking Date">Booking Date</label></b> <input
									type="date" name="bookingDate" class="form-control"
									placeholder="Booking Date">
							</div>
						</div>


						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="booking time">Booking Time</label></b> <input
									type="time" name="bookingTime" class="form-control"
									placeholder="Enter time">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="name">Name</label></b> <input type="text"
									name="customerName" class="form-control" placeholder="Enter name">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Address">Address</label></b>
								<textarea name="address" rows="1" cols="20" class="form-control"
									placeholder="Enter address"></textarea>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Area">Area(Bhubaneswar)</label></b> <select
									class="form-control">
									<option>Select Area</option>
								</select>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="other cities">Other Cities</label></b> <select
									class="form-control">
									<option>Select City</option>
								</select>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="numberofpax">No. Of Passengers</label></b> <input
									type="text" name="numberOfPax" class="form-control"
									placeholder="Enter no. of passengers">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="numberofbaggage">Baggage Count</label></b> <input
									type="text" name="numberOfBag" class="form-control"
									placeholder="Enter no. of baggages">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Vehicle">Vehicle</label></b> <select
									class="form-control">
									<option>Select Vehicle</option>
								</select>

							</div>
						</div>



						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="numberofvehicle">Number Of Vehicle</label></b> <input
									type="text" name="numberOfVehice" class="form-control"
									placeholder="Enter no.of vehicles">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="price">Price</label></b> <input type="text"
									name="price" class="form-control" placeholder="Enter price">
							</div>
						</div>
					</div>
			</div>
			<div id="accordion">
				<div class="card">
					<div class="card-header" class="collapsed card-link"
						data-toggle="collapse" href="#collapseOne"
						style="cursor: pointer;">

						<font size="5px" color="blue">  Optional</font>

					</div>
					<div id="collapseOne" class="collapse " data-parent="#accordion">
						<div class="card-body">
							<div class="cardpanel">
								<div class="row">
									<div class="col-md-4">
										<div class="form-group">
											<b><label for="flightdetails">Flight Details</label></b> <input
												type="text" class="form-control" id=""
												placeholder="Enter Flight Details">
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<b><label for="Flight date">Flight Date</label></b> <input
												type="date" name="Flight date" class="form-control"
												placeholder="Enter Flight Date">
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<b><label for="Flight time">Flight Time</label></b> <input
												type="time" name="Flight time" class="form-control"
												placeholder="Enter Flight time">
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<button type="submit" id="btnn" class="btn btn-primary">Confirm</button>
				</div>
			</div>
			</form>
		</div>
	</div>
	</div>



</body>
</html>