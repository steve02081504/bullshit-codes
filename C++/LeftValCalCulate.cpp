﻿bool TestFunc()
{
    //条件运算时，将作为左值变量放在右边避免出错
    int nVal = 20;
    //编译通过，但会始终返回false
    if(30 = nVal)
        return false;
    return true;
}