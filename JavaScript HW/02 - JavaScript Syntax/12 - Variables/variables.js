function variablesTypes(arr) {
	var name = arr[0];
	var age = arr[1];
	var isMale = arr[2];
	var foods = arr[3];

	console.log("My name is:" + name + " // type is " + typeof(name) + "\n" +
		"My age:" + age + " // type is " + typeof(age) + "\n" +
		"I am male:" + isMale + " // type is " + typeof(isMale) + "\n" +
		"My favorite foods are:" + foods + " // type is " + typeof(foods))
};
variablesTypes(['Pesho', 22, true, ['fries', 'banana', 'cake']])