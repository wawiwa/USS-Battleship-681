<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>BattleShip: GameBoard</title>
    <meta name="description" content="">

    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/bootstrap-responsive.css">
    <link rel="stylesheet" href="assets/css/jquery.fancybox.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <script src="assets/js/jquery.js"></script>
    
    
    <link rel="stylesheet" href="assets/css/GameStyle.css">

    <script src="assets/js/jquery.countdown.min.js"></script>
    
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
        <a href="dashboard.html" class='company'>BattleShip: Dashboard</a>

        <ul class='mini'>
            <li>
                <a href="index.html">
                    <img src="../assets/img/icons/fugue/control-power.png" alt="">
                    Logout
                </a>
            </li>
        </ul>
    </div>
</div>

<div class="main">
    <div class="container-fluid">

        <div class="content">

            <div class="row-fluid">
                <div class="span12">

                    <h2>Count Clock goes here</h2>
<div class="example-base">
    <div id="clock"></div>
</div>

<button id="startTimer">Start Timer</button>
<script type="text/javascript">

function minutes_to_milliseconds(mins) {
    var MINUTE = 60000;
    if (!mins || mins < 1) {
        return;
    }

    return parseInt(MINUTE * mins);
}

function startClock() {
    var duration = new Date().valueOf() + minutes_to_milliseconds(2);

    $('#clock').countdown(duration).on('update.countdown', function(event){
        $(this).html(event.strftime('%M min %S sec'));
    }).on('finish.countdown', function(event){
        $(this).html('Time has Expired!');
    });
}

$("#startTimer").click(function() {
    startClock();
});


</script>
                </div>
            </div>

            <div class="row-fluid">
                <div class="span12">
                    <div class="box">
                        <div class="box-head">
                            <h3>Target Grid</h3>
                        </div>
                        <div class="box-content">

                        </div>
                    </div>
                </div>
            </div>

            <div class="row-fluid">
                <div class="span12">
                    <div class="box">
                        <div class="box-head">
                            <h3>Ocean Grid</h3>
                        </div>
                        <div class="box-content">

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