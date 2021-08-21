function AveragePair(array,average){
    let first = 0;
    let end = array.length-1;
    while(first<end){
        tempAvg = (array[first]+array[end])/2;
        if(tempAvg === average){
            return true;
        }else if(tempAvg < average){
            first++;
        }
        else{
            end--;
        }
    }
    return false;
}