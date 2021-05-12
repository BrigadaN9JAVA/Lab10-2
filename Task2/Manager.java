package Task2;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Goods> goods;

    public Manager(){
        goods = new ArrayList<>();
    }

    public void addConsumerGoods(ConsumerGoods g){
        try {
            if (g.getId() <= 0) throw new IllegalArgumentException("Id is not correct");
            if (g.getPrice() <= 0) throw new IllegalArgumentException("Price is not correct");
            if (g.getWeight() <= 0) throw new IllegalArgumentException("Weight is not correct");
            goods.add(g);
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    public void display(){
        for (int i = 0; i < goods.size(); i++) {
            System.out.println(goods.get(i));
        }
    }

}
