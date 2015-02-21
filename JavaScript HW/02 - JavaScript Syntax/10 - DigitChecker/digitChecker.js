function checkDigit(number) {
	while(number > 1000){
		var checkBit = ((number >> 3) & 1) == 1;

    return checkBit;	
	}
};
console.log(checkDigit(1235));
console.log(checkDigit(25368));
console.log(checkDigit(123456));