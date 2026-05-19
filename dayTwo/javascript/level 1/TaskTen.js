const prompt = require("prompt-sync")()

let first_number = +prompt("Enter first number: ")

let second_number = +prompt("Enter second number: ")

let third_number = +prompt("Enter third number: ")

let addition = first_number + second_number + third_number

let average = addition/3

console.log(average)
