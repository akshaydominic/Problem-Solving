function MaxSubarraySliding(arr,n){
    let maxSum = 0;
    let tempSum =0;
    for(let i=0;i<n;i++){
        maxSum+=arr[i];
    }
    tempSum = maxSum;
    for(let i=n;i<arr.length;i++){
        tempSum = tempSum - arr[i-n]+arr[i];
        maxSum = Math.max(tempSum,maxSum);
    }
    return maxSum;
}



