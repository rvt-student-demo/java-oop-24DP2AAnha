package rvt.Online_shop;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class shop_cart {
    int cartprice = 0;
    Map<String, Shop_item> cartMap = new HashMap<>();

    public void add(String product, int price) {
        if (cartMap.containsKey(product)) {
            cartMap.get(product).increaseQuantity(); 
        } else { 

            Shop_item item = new Shop_item(product, 1, price);
            cartMap.put(product, item);

        }
        
        cartprice += price;  
    }

    public int price() {
        return cartprice;
    }

    public void print() {

        Collection<Shop_item> values = cartMap.values();
        String formatted = values.toString().replace("[", "").replace("]", "").replace(",", "\n");
        System.out.println(formatted);

    }
}