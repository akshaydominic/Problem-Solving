function findMax(x,y){
    let factorsY = findFactors(y);
    let MaxValue = -Infinity;
    for(let i=0;i<=x;i++){
        let factorsI = findFactors(i);
        if(x%i==0 && isCoprime(factorsY,factorsI)){
            MaxValue = Math.max(MaxValue,i);
        }
    }
    return MaxValue;

}
function findFactors(num){
    let isfactors = [];
    for(let i=2;i<num;i++){
        if(num % i==0){
            isfactors.push(i);
        }
    }
    return isfactors;
}
function isCoprime(arr1,arr2){
    for(let i=0;i<arr1.length;i++){
        if(arr2.indexOf(arr1[i])!=-1){
            return false;
        }
    }
    return true;
}

findMax(30,12);