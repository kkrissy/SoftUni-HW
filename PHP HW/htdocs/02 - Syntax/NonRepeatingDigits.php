<?php
 function findDigits($n) {
 	#variable = $n;
 	if ($n < 100) {
		echo 'no';
		return;
	}
 	for ($i= 102; $i <= $n; $i++) { 
		 echo $i . ',' . " ";		 
	 }
 }
 findDigits(1234);
 echo PHP_EOL;
 findDigits(145); 
  echo PHP_EOL;
 findDigits(15);
   echo PHP_EOL;
 findDigits(247);
?>
