function Anagramv2(str1,str2){
    if(str1.length!==str2.length){
        return false;
    }
    let lookup = {};
    for(let val of str1){
        lookup[val]=(lookup[val] || 0)+1;
    }

    for(let i=0;i<str2.length;i++){
        let letter = str2[i];
        if(!(lookup[letter])){
            return false;
        }else{
            lookup[letter]-= 1;
        }
    }
    return true;
}