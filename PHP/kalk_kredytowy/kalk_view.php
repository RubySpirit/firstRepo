<!DOCTYPE HTML>
<html lang="pl">
<head>
	<meta charset="utf-8" />
	<title> Kalkulator kredytowy</title>
</head>

<body>
	<h1> Kalkulator </h1>
	<form action="kalk.php" method="post">
		Kwota kredytu:<br>
			<input type="text" name="kwota" value=" <?php 
			if(isset($kwota))
				print($kwota);
			else
				print(" ");	?>" />
		<br>
		
		Ilość miesięcy: <br>
		<input type="text" name="miesiace"  value=" <?php 
			if(isset($ilosc))
				print($ilosc);
			else
				print(" ");	?>" /> <br>
		Oprocentowanie: <br>
		<input type="text" name="oprocentowanie"	 value=" <?php 
			if(isset($oprocentowanie))
			   print($oprocentowanie);
			else
				print(" ");	?>" /> <br>
		<input type="submit" value ="Oblicz"/>
		</form>
		
		
		
		
	<?php if (isset($miesiecznaRata)){ ?>
	<div style="margin: 20px; padding: 10px; border-radius: 5px;
	background-color: #ff0; width:300px;">
	<?php echo 'Miesieczna Rata: '.$miesiecznaRata; ?>
</div>
<?php } ?>
</body>
</html>