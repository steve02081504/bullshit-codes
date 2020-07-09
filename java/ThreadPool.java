import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Ruler
 * @date 2020/7/9 20:55
 */
public class ThreadPool {

    public static void main(String[] args) {

//        公司服务器每天固定时间就CPU爆炸，但是那时间也没什么人访问，知道我看见了这个

//        创建一个线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(1);

//        执行任务。。。。。

//        任务完毕
        threadPool.shutdown();
        while (true) {
            if (threadPool.isTerminated()) {
                break;
            }
        }
    }
}
