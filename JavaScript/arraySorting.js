const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the elements of the array (separated by space): ', (input) => {
    let arr = input.split(' ').map(Number);
    arr.sort((a, b) => b - a);
    console.log("Sorted array in descending order:", arr);
    rl.close();
});
