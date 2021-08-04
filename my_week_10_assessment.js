function mySpinalTap(str){
    return str.split(/\s|_|(?=[A-Z])/).join("-").toLowerCase();
}

console.log(mySpinalTap("Me na strong chelsea fan"))