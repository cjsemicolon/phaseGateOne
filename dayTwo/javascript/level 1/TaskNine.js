const prompt = require ("prompt-sync")()

let price = +prompt("Enter a number: ")

let tax = price * 0.10

let priceWithTax = tax + price

console.log(priceWithTax);

 
