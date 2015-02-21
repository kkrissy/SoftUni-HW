function findMinMax(arr){
	var minNumber = Math.min.apply(Math,arr);
	var maxNumber = Math.max.apply(Math,arr);

	console.log("Min - > " + minNumber + '\n' + "Max - > " + maxNumber);	
};
findMinMax([1, 2, 1, 15, 20, 5, 7, 31]);
findMinMax([2,2,2,2,2]);
findMinMax([500, 1, -23, 0, -300, 28, 35, 12])