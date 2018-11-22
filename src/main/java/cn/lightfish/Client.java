package cn.lightfish;

import java.util.function.Consumer;

public interface Client {
   void step(Msg msg);
   void handle(Consumer<Msg> callback);

   public static void main(String[] args) {

   }
}
