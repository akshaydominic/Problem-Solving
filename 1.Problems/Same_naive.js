// function Same(arr1,arr2){
//     let result=[];
//     for(let i=0;i<arr1.length;i++){
//         if(!arr2.includes(arr1[i]*arr1[i]) && result.includes(arr1[i]*arr1[i])){  
//             return false;
//         }
//         result.push(arr1[i]*arr1[i]);
        
//     }
//     return true;
// }


function Same_naive(arr1,arr2){
    if(arr1.length!==arr2.length){
        return false;
    }
    for(let i=0;i<arr1.length;i++){
        let position = arr2.indexOf(arr1[i]**2);
        if(position === -1){
            return false;
        }
        arr2.splice(position,1);
    }
    return true;
}
