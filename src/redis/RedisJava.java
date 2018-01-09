package redis;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by jingjing on 2018/1/9.
 */
public class RedisJava {
    public static void main(String[] args) {
//        connectRedis();
//        redisStringJava();
        redisListJava();
    }
    /**
     * 连接redis
     */
    public static void connectRedis(){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
    }

    /**
     * Redis Java String(字符串) 实例
     */
    public static void redisStringJava(){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("yuanKey", "www.jingjing.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("yuanKey"));
    }
    /**
     * Redis Java List(列表) 实例
     */
    public static void redisListJava(){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //存储数据到列表中
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0 ,2);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
    }
}