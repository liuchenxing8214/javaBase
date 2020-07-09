package juc;

public class CompareAndSwap {
    private  int value;

    //获取内存值
    public synchronized int getValue() {
        return value;
    }

    //比较 (无论更新成功还是失败，都会返回旧的内存值)
    public synchronized int compareAndSwap(int expectedValue, int newValue) {
        int oldValue = value;
        //如果预估值和内存值相同,则将预估值赋值给内存值
        System.out.println("内存值value==="+value+"|"+"预估值为expectedValue==="+expectedValue);
        if (oldValue == expectedValue) {
            this.value = newValue;
        }
        return oldValue;
    }

    //判断更新是否成功，如果更新成功，旧的内存值会和预估值相等
    public synchronized Boolean compareAndSet(int expectedValue, int newValue) {
        return expectedValue == compareAndSwap(expectedValue, newValue);
    }


}
