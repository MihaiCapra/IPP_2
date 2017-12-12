package composite;

public class Main {
    public static void main(String[] args){
        PostMan CEO  = new PostMan("Bob", "CEO POSTMAN", 2000);
        PostMan HeadSales = new PostMan("Judy", "HEAD SALES", 2001);
        PostMan SalesExecutive = new PostMan("Mary", "sales", 2004);

        PostMan Marketing = new PostMan("Jane", "marketing", 2000);
        PostMan HeadDelivery = new PostMan("John", "HEAD DELIVERY", 2000);
        PostMan DeliveryExecutive = new PostMan("Mike", "delivery", 2001);

        CEO.add(HeadSales);
        CEO.add(HeadDelivery);

        HeadSales.add(SalesExecutive);
        HeadSales.add(Marketing);

        HeadDelivery.add(DeliveryExecutive);

        //print general scheme
        System.out.println(CEO);

        for(PostMan p : CEO.getPostManList()){
            System.out.println("->" + p);

            for(PostMan p1 : p.getPostManList()){
                System.out.println("-->" + p1);
            }
        }
     }
}
