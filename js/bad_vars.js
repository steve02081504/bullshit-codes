//Q: 请使用for循环输出1-100的所有质数
//A: 好嘞您瞧好了：

function _(__){
    for(let ___=__-1;___>1;___--){
        if(__%___==0){
            return false;
        }
    }
    return true;
}
for(let ____=1;____<100;____++){
    if(____==1){
        console.log(____+"非质数非合数");
    }else{
        console.log(_(____)?____+"是质数":____+"是合数");
    }
}