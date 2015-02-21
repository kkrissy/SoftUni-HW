<?php
function sumNumbers($first,$second) {
	$firstNumber = $first;
	$secondNumber = $second;
	$sum = $firstNumber + $secondNumber;
	$sum = number_format($sum, 2);
	echo '$firstNumber + $secondNumber = ' . "$firstNumber + $secondNumber = " . $sum;
}
sumNumbers(2,5);
  echo PHP_EOL;
sumNumbers(1.567808,0.356); 
  echo PHP_EOL;
sumNumbers(1234.5678,333); 
?>