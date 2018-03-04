<!DOCTYPE HTML>
<html lang="pl">
<head>
	<meta charset="utf-8"/>
	<title> Kalkulator kredytowy - obliczenie</title>
	</head>
	
	<body>
	<?php
	$kwota = $_POST['kwota'];
	$ilosc = $_POST['miesiace'];
	$oprocentowanie = $_POST['oprocentowanie'];
	
	//echo "<h2> $kwota <br> $ilosc <br> $oprocentowanie <br> </h2>";
	
	$miesiecznaRata=($kwota*($ilosc/12)*(1+$oprocentowanie/100)/$ilosc);
	//echo $miesiecznaRata;
	
	
	include 'kalk_view.php';
	
	?>
		</body>
	</html>