var fun1 = function(name) {
	print('Hi there from Javascript, ' + name);
	return "greetings from javascript";
};

var fun2 = function(object) {
	print("JS Class Definition: " + Object.prototype.toString.call(object));
};

var fun3 = function() {
	print('Hi this is int , ' + 0);
	return 0;
};

var fun4 = function(name) {
	var MyJavaClass = Java.type('com.example.xke.Nashorn');
	var result = MyJavaClass.fun1(name);
	print(result);
};
