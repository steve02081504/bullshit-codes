// 偶然发现的一段神奇的订单状态判断代码
var order = getOrderById(order_id);
if(order.status !=0 || order.status!=1){
    System.out.println("订单状态异常");
}
// 第一眼 我确实没看出问题在哪。。。