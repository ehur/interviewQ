var _ = require('underscore')

function find2Max(someNumbers) {
    var sorted = someNumbers.sort().reverse();
    return [sorted[0],sorted[1]];
//  console.log('Hello, World');
}
function maxOf(arr2,num) {
    if (arr2[0] < num) {
        arr2[1] = arr2[0];
        arr2[0] = num;
    } else {
        if (arr2[1] < num) {arr2[1] = num;}
    }
    return arr2;
}

//alternative, using reduce!
function alt(someNumbers) {
    var biggest = Math.max(someNumbers[0],someNumbers[1]);
    var next = Math.min(someNumbers[0],someNumbers[1]);
    var result = _.reduce(someNumbers.splice(2),maxOf,[biggest,next]);
    return result;
}

function findTwoMax(someNumbers) {
    var biggest = (someNumbers[0] - someNumbers[1] >= 0) ? someNumbers[0] : someNumbers[1];
    var next = (someNumbers[0] - someNumbers[1] >= 0) ?
        someNumbers[1] : someNumbers[0];
    var thePair = [biggest,next];
    for (var i=2;i<someNumbers.length;i++){
        console.log("........iteration " + i);
        thePair = maxOf(thePair,someNumbers[i]);
    }
    return thePair;
}

function recurs(nums,arr2) {
    var res = arr2;
    var i;
    for (i=0;i<nums.length;i++) {
        res = maxOf(arr2,nums[i]);
        recurs(nums.splice(2),res);
    }
    return res;
}

function findTwoMaxR(someNumbers) {
    if (someNumbers.length < 3) {
        var biggest = Math.max(someNumbers[0],someNumbers[1]);
        var next = Math.min(someNumbers[0],someNumbers[1]);
        return [biggest,next];
    } else {
        var biggest = Math.max(someNumbers[0],someNumbers[1]);
        var next = Math.min(someNumbers[0],someNumbers[1]);
        var thePair = [biggest,next];
        return recurs(someNumbers.splice(2),thePair);
    }
}

//var actual=find2Max([2,66,3,88,4,5,6]);
//var expected=[88,66];

//var actual=findTwoMax([2,9,9,2]);
//var expected=[9,9];

var actual=findTwoMax([1,5,3,7]);
var expected=[7,5];


console.log("GOT: " + actual + " EXPECTED: " + expected);