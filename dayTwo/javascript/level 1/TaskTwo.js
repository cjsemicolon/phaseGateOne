const prompt = require("prompt-sync")()

let userAge = +prompt("What is your age: ")

let futureAge = userAge + 5

console.log("In five years you will be " + futureAge)
