// function countUnique(arr){
//     let i=0;
//     let j=1;
//     for(let val of arr){
//         if(arr[i]===arr[j]){
//             j++;
//         }
//         else if(j<arr.length){
//             i++;
//             arr[i]=arr[j];
//             j++;
//         }
//     }
//     console.log(arr);
//     return i+1;
// }
// countUnique([1,2,3,4,4,4,7,7,12,12,13]);



function Count(arr){
    let i =0;
    for(let j=0;j<arr.length;j++){
        if(arr[i]!==arr[j]){
            i++;
            arr[i]=arr[j];
        }
    }
    return arr.length==0?0:i+1;
}

Count([1,2,3,4,4,4,7,7,12,12,13]);