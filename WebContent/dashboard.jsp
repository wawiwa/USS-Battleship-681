<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>BattleShip: Dashboard</title>
<meta name="description" content="">

<meta name="viewport" content="width=device-width">

<link rel="stylesheet" href="assets/css/bootstrap.css">
<link rel="stylesheet" href="assets/css/bootstrap-responsive.css">
<link rel="stylesheet" href="assets/css/jquery.fancybox.css">
<link rel="stylesheet" href="assets/css/style.css">

    <script src="assets/js/jquery.js"></script>
<script>

$(document).ready(function() {

    //on document load, set the body background to retina-wood.
    $('body').removeClass().addClass("retina-wood");


    $(".playButtonAction").click(function(e){
        console.log("Play button was pressed");
        console.log(e);

    });


});
</script>

</head>
<body>


<div class="topbar">
	<div class="container-fluid">
		<a href="dashboard.jsp" class='company'>BattleShip: Dashboard</a>

		<ul class='mini'>
			<li>
				<a href="login.jsp">
					<img src="assets/img/icons/fugue/control-power.png" alt="">
					Logout
				</a>
			</li>
		</ul>
	</div>
</div>

<div class="main">
	<div class="container-fluid">

	<div class="content">

        <style>

            #UserGameStats div.span4.stats {
                padding-top: 10px;
                padding-bottom: 10px;
                color: #3a87ad;
                background-color: #d9edf7;
                border-color: #bce8f1;
                border-radius: 4px;
                border: 2px solid #72ACF5;
            }
            #UserGameStats div.span4.stats .numbre {
                color: blue;
            }
            #UserGameStats div.span4.stats h3 {
                text-align: center;
            }

        </style>
		
			<div class="row-fluid" id="UserGameStats">
				<div class="span12">
					<div class="box">
						<div class="box-head">
							<h3>User Game Stats</h3>
						</div>
                        <br/>
                        <div class="box-content">

                            <div class="span4 stats">
                                <h3>Wins:
                                    <span class="numbre"> 20</span>
                                </h3>
                            </div>
                            <div class="span4 stats">
                                <h3>Losses:
                                    <span class="numbre"> 20</span>
                                </h3>
                            </div>
                            <div class="span4 stats">
                                <h3>Draws:
                                    <span class="numbre"> 20</span>
                                </h3>
                            </div>
						</div>
                        <br/>
					</div>
				</div>
			</div>

			<div class="row-fluid">
				<div class="span9">
					<div class="box">
						<div class="box-head">
							<h3>Prior Games</h3>
						</div>
						<div class="box-content">

                            <table class="table table-striped table-bordered">
                                <thead>
                                    <tr>
                                    <th>Date</th>
                                    <th>User 1</th>
                                    <th>User 2</th>
                                    <th>Winner</th>
                                    <th>etc</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                    <td>10/03/2014</td>
                                    <td>Jack</td>
                                    <td>Thierry</td>
                                    <td>Thierry</td>
                                    <td>NA</td>
                                    </tr>
                                </tbody>
                            </table>
							
							<s:url action="gotoGameBoard" var="goToGame"></s:url>
            				<a href="<s:property value='#goToGame'/>">GOTO GameBoard TEMP link</a>
							
							
						</div>
					</div>

				</div>
				<div class="span3">
					<div class="box">
						<div class="box-head">
							<h3>Players</h3>
						</div>
						<div class="box-content box-nomargin">
							<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>Username</th>
										<th>Status</th>
                                        <th>Action</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>jyoung</td>
										<td class='actions_two'>
											<div class="btn-group">
                                                <span class="label label-warning">In Game</span>
											</div>
										</td>
                                        <td></td>
									</tr>
									<tr>
										<td>Thierry</td>
										<td class='actions_two'>
											<div class="btn-group">
                                                <span class="label label-important">Offline</span>
											</div>
										</td>
                                        <td></td>
									</tr>
									<tr>
										<td>Wade</td>
										<td class='actions_two'>
                                            <span class="label label-success">Online</span>
										</td>
                                        <td>
                                            <button class="btn playButtonAction">Play</button>
                                        </td>
									</tr>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>	
	</div>
</div>	

<script src="assets/js/less.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.peity.js"></script>
<script src="assets/js/jquery.fancybox.js"></script>
<script src="assets/js/jquery.flot.js"></script>
<script src="assets/js/jquery.color.js"></script>
<script src="assets/js/jquery.flot.resize.js"></script>
<script src="assets/js/jquery.cookie.js"></script>
<script src="assets/js/jquery.cookie.js"></script>
<script src="assets/js/custom.js"></script><script src="js/demo.js"></script>
</body>
</html>