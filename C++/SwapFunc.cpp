//以值传递的方式实现交换接口，并不能达到交换效果
void Swap(int a,int b)
{
    int nTemp = a;
    a = b;
    b = temp;
}

int main()
{
    int a = 1,b = 2;
    //a依然是1，b依然是2
    Swap(a,b); 
}