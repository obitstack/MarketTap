package markettap.api_exchange;

public class StaticMethods {

    /* 
        change method accepts 2 double variables,
        and returns an array with differenc between old and new price
        change[0] == factor
        change[1] == percentage

    */
    public static Double[] change(Double oldPrice, Double newPrice) {
        Double change[]= {-1.0,-1.0};
        change[0] = (newPrice-oldPrice)/oldPrice;
        change[1] = change[0]*100;

        return change;

    }


    
}
