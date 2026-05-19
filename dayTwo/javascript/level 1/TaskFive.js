const prompt = require("prompt-sync")()

let temperature_In_Celsius = +prompt("Enter the Temperature in celsius: ");

let temperature_In_Fahrenheit = (temperature_In_Celsius * 1.8) + 32;

console.log(temperature_In_Fahrenheit, "F");


