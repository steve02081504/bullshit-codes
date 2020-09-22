代码片段
经过一定简化
class Obj{
    public int total{get;set;}       //total就是rows的行数
    public List<string> rows{get;set;}=new List<string>();                                                                                                     
}
……
其中某函数中：
Obj obj=new Obj();      //演示，简化过

//……obj初始化……
//通过ORM从数据库中拿数据

int have_i=0;
int count=obj.rows.total;
for (int i = 0; i < count; i++)
{
	if (i >= obj.rows.Length)
	{
		break;
	}
	if(obj.rows[i]!=null /*&& 其他条件*/){
        have_i++;
        //……一些操作……
    }
}
设置总数量的函数(have_i);

//防御性编程，我直呼内行