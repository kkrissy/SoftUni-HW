var now = new Date();
var hour = now.getHours();
var min = now.getMinutes();
	
if (min < 10) {
    min = "0" + min;
}
console.log(hour + ":" + min);
