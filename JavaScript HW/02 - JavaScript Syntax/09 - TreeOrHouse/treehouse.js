function treeHouseCompare(arr) {
	var a = arr[0];
	var b = arr[1];
	var circleRadius = (b / 3) * 2;
	// houseVolume is a combination of Square and Triangle areas
	var houseVolume = (a*a) + 0.5 * a * b;
    // treeVolume is a combination of Circle and Rectangle areas
	var treeVolume = b * (b / 3) + Math.PI * (circleRadius * circleRadius);

	if( houseVolume > treeVolume){
		console.log("house /" + houseVolume.toFixed(2));
	}
	else {
		console.log("tree /" + treeVolume.toFixed(2));
	}	
};
treeHouseCompare([3, 2]);
treeHouseCompare([3, 3]);
treeHouseCompare([4, 5]);