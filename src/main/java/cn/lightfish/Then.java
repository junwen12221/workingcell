package cn.lightfish;


import java.util.function.BiFunction;

public interface Then<T> {
    <R> void then(BiFunction<Exception, T, Then<R>> then);
}
