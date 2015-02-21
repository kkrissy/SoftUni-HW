function isPrime(number){
	var prime = true;
	for (var i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0){
				console.log('false');
				prime = false;
				break;
			}
		};
		if(prime == true){
			console.log('true');
			}
};
isPrime(7);
isPrime(254);
isPrime(587);
