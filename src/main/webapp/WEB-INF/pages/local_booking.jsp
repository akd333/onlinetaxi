<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<title>Online Taxi</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="jsvalidation/jquery.validate.js"></script>
<script type="text/javascript" src="jsvalidation/jquery.validate.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<style>
#errmsg1 {
	color: red;
}

#errmsg2 {
	color: red;
}

#errmsg3 {
	color: red;
}

#errmsg4 {
	color: red;
}

.error {
	color: #ff0000;;
}

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
	width: 100%;
	height: 100%;
}

.form-signin .btn {
	font-size: 15px;
	font-weight:bold;
	border-radius: 50px;
	padding: 10px;
	margin:0px 25px 25px 0px;
	float:right;
	transition: all 0.2s;
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


(
var
(-

 

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


(
var
(-

 

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
	<form class="form-signin" action="save" method="POST" name="myform"
		id="myform">
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

					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="fromairport">From Airport</label></b> <select
									class="form-control" name="fromairport">
									<option value="">Select Airport</option>
									<option value="Bhubaneswar">Bhubaneswar</option>
								</select>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Toairport">To City</label></b> <select
									class="form-control" name="tocity">
									<option value="">Select City</option>
									<option value="Bhubaneswar">Bhubaneswar</option>
								</select>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="contact">Contact</label></b> <input type="text"
									name="mobileNumber" class="form-control"
									placeholder="Enter mobile no" id="mobileNumber" maxlength="10">
								<span id="errmsg1"></span>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b><label for="Emailid">Email Id</label></b> <input type="email"
									name="emailId" class="form-control"
									placeholder="Enter Email Id">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Booking Date">Pickup Date</label></b> <input
									type="date" name="bookingDate" class="form-control"
									placeholder="Booking Date" id="txtdate">
							</div>
						</div>


						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="booking time">Pickup Time</label></b> <input
									type="time" name="bookingTime" class="form-control"
									placeholder="Enter time" name="bookingTime" id="bookingTime"
									value="now">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="name">Name</label></b> <input type="text"
									name="customerName" class="form-control"
									placeholder="Enter name">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Address">User Address</label></b>
								<textarea name="address" rows="1" cols="20" class="form-control"
									placeholder="Enter address"></textarea>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Area">Destination Area(Bhubaneswar)</label></b>
								<select class="form-control" name="area" id="area">

									<option value="">Select Area</option>
									<c:forEach var="area" items="${area}">
										<option value="${area.area}">${area.area}</option>
									</c:forEach>
								</select>
							</div>
						</div>


					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="other cities">Other Cities</label></b> <select
									class="form-control" name="">
									<option value="">Not Available</option>
								</select>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="numberofpax">No. Of Passengers</label></b> <input
									type="text" name="numberOfPax" class="form-control"
									placeholder="Enter no. of passengers" id="numberOfPax">
							</div>
							<span id="errmsg2"></span>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="numberofbaggage">Baggage Count</label></b> <input
									type="text" name="numberOfBag" class="form-control"
									placeholder="Enter no. of baggages" id="numberOfBag">
							</div>
							<span id="errmsg4"></span>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="Vehicle">Vehicle</label></b> <select
									class="form-control" name="vehicletype" id="vehicletype">
									<option value="">Select Vehicle</option>
								</select>

							</div>
						</div>



						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="numberofvehicle">Number Of Vehicle</label></b> <input
									type="text" name="numberOfVehicle" class="form-control"
									placeholder="Enter no.of vehicles" id="numberOfVehicle">
							</div>
							<span id="errmsg3"></span>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<b> <label for="price">Price</label></b> <input type="text"
									name="price" class="form-control" placeholder="Enter price"
									readonly="readonly" id="price">
							</div>
						</div>
					</div>
				</div>
				<div id="accordion">
					<div class="card">
						<div class="card-header" class="collapsed card-link"
							data-toggle="collapse" href="#collapseOne"
							style="cursor: pointer;">

							<font size="5px" color="blue"> Optional</font>

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
					<br>
					<div class="row">
						<div class="col-md-3"></div>
						<div class="col-md-3"></div>
						<div class="col-md-3"></div>
						<div class="col-md-3">
							<Button type="submit" id="btnn" class="btn btn-primary"
								id="submit">Confirm</Button>

						</div>
					</div>

				</div>



			</div>

		</div>

	</form>

	<script>
			 $(function(){
             	$('#area').on('click', function(){
             		debugger;
             		var  area = $('#area option:selected').val();
             	
             		
             		debugger;
             		 $.ajax({
             	            type: "GET",
             	            contentType: "application/json; charset=utf-8",
             	         	  datatype: "json",
             	            url: "${pageContext.request.contextPath}/vehicleAndArea/"+area+"",
             	            
             	            success: function (result) {
             	            	debugger;
             	            	var vehicle="";
             	            	vehicle+="<option value="+result[i]+">Select Vehicle</option>"
             	            	debugger;
           	                  for(var i=0;i<result.length;i++){ 
           	                	vehicle+="<option value="+result[i]+">"+result[i]+"</option>"
           	                	 $('#vehicletype').html(vehicle);
           	                	debugger;
           	                }
           	                  
             	              
             	            	
             	            },
             	            });
             	            })
             	            })
             		 
			 $(function(){
             	$('#vehicletype').on('click', function(){
             		debugger;
             		var  area = $('#area option:selected').val();
             		var  vehicletype = $('#vehicletype option:selected').val();
             	
             		
             		debugger;
             		 $.ajax({
             	            type: "GET",
             	            contentType: "application/json; charset=utf-8",
             	         	  datatype: "json",
             	            url: "${pageContext.request.contextPath}/vehicleAndAreaPrice/"+area+","+vehicletype+"",
             	            
             	            success: function (result) {
             	            	debugger;
             	             
             	                 $('#price').val(result);
             	            	debugger; 
             	            },
             	           });
      	            })
      	            })
      	            
      	            
      	            
      	            
			</script>




	<!--           --------------                  -->

	<script>
$(function() {
  
  $("form[name='myform']").validate({
   
    rules: {
      
      bookingDate: "required",
	  fromairport:"required",
      tocity: "required",
      mobileNumber: "required",
      emailId: "required",
	  bookingTime: "required",
	  customerName: "required",
	  address: "required",
	  area: "required",
	  othercities: "required",
	  numberOfPax: "required",
	  vehicletype: "required",
	  numberOfVehicle: "required",
	  price1: "required",
	  flightdetails: "required",
	  flightdate: "required",
	  flighttime: "required",
	  bgcount: "required",
	  emailId: {
        required: true,
        
        
      },
	  fromairport:{
	  required:true,
	  },
      password: {
        required: true,
        minlength: 5
      }
    },
   
    messages: {
      bookingDate: "Please enter your BookingDate",
	   tocity: "Please enter  city",
	   mobileNumber: "Please enter your mobileNumber",
	    emailId: "Please enter valid emailid",
		  bookingTime: "Please enter your BookingTime",
		  customerName: "Please enter your Name",
		    address: "Please enter your address",
			 area: "Please enter your area",
			  othercities: "Please enter othercities",
			   pax: "Please no.of passengers",
			   vehicletype: "Please enter vehicletype",
			    numberOfVehicle: "Please enter vehicleno",
				  price1: "Please enter price",
				   flightdetails: "Please enter your flightdetails",
				    flighttime: "Please enter your flighttime",
					flightdate: "Please enter flightDate",
					bgcount:"Please enter your bgcount",
					fromairport:"Please enter your airport",
      
      password: {
        required: "Please provide a password",
        minlength: "Your password must be at least 5 characters long"
      },
      
    },
    
    submitHandler: function(form) {
      form.submit();
    }
  });
});

</script>
	<script>
$(function(){     
  var d = new Date(),        
      h = d.getHours(),
      m = d.getMinutes();
  if(h < 10) h = '0' + h; 
  if(m < 10) m = '0' + m; 
  $('input[type="time"][value="now"]').each(function(){ 
    $(this).attr({'value': h + ':' + m});
  });
});
</script>
	<script>
function setInputDate(_id){
          var _dat = document.querySelector(_id);
          var hoy = new Date(),
              d = hoy.getDate(),
              m = hoy.getMonth() + 1,
              y = hoy.getFullYear(),
              data;

          if (d < 10) {
              d = "0" + d;
          };
          if (m < 10) {
              m = "0" + m;
          };

          data = y + "-" + m + "-" + d;
          //console.log(data);
          _dat.value = data;
      };

      setInputDate("#txtdate");
</script>
	<script type="text/javascript">
        function populateDropDown() {

            /* Clear the entire subjects drop down*/
            document.getElementById("pattern").options.length = 0;

            /* adding a Default "Select" option in Subjects Menu*/
            var optn = document.createElement("OPTION");
            optn.text = "Select";
            pattern.options.add(optn);

            /* This can be changed according to the rest of the code instead of hard coded values*/
            var selectedIndexVal = document.getElementById("vehvehicletypeicle").selectedIndex;
            var subjectValList = document.getElementById("vehicletype").options[selectedIndexVal].value;
            var subjectValArray = subjectValList.split(",");
            for (var j = 0; j < subjectValArray.length; j++) {
                var optn = document.createElement("OPTION");
                optn.text = subjectValArray[j];
                optn.value = subjectValArray[j];
                pattern.options.add(optn);
            }

        }
    </script>

	<script type="text/javascript">
$(document).ready(function(){
    $("select").change(function(){
        $(this).find("option:selected").each(function(){
            var optionValue = $(this).attr("value");
            if(optionValue){
                $(".add").not("." + optionValue).hide();
                $("." + optionValue).show();
            } else{
                $(".add").hide();
            }
        });
    }).change();
});

</script>
	<script>
$(document).ready(function () {
  //called when key is pressed in textbox
  $("#mobileNumber").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsg1").html("Digits Only").show().fadeOut("slow");
               return false;
    }
   });
});
</script>

	<script>
$(document).ready(function () {
  //called when key is pressed in textbox
  $("#numberOfPax").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsg2").html("Digits Only").show().fadeOut("slow");
               return false;
    }
   });
});
</script>

	<script>
$(document).ready(function () {
  //called when key is pressed in textbox
  $("#numberOfBag").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsg4").html("Digits Only").show().fadeOut("slow");
               return false;
    }
   });
});
</script>


	<script>
$(document).ready(function () {
  //called when key is pressed in textbox
  $("#numberOfVehicle").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsg3").html("Digits Only").show().fadeOut("slow");
               return false;
    }
   });
});
</script>




</body>
</html>