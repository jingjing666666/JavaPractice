package designMode;

/**
 * Created by jingjing on 2018/1/11.
 */

/**
 * 单例模式
 */
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private static SimpleSingleton getInstance() {
        if (instance==null){
            instance = new SimpleSingleton();
        }
        return instance;
    }

    private SimpleSingleton() {
    }
}
