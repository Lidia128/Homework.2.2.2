public class Main {
    public static void main(String[] args) {

        Flower roza = new Flower(null, "Голландия", 35.59);
        Flower hrizantema = new Flower(null, null, 15);
        hrizantema.lifeSpan = 5;
        Flower pion = new Flower(null, "Англия", 69.9);
        pion.lifeSpan = 1;
        Flower gipsofila = new Flower(null, "Турция", 19.5);
        gipsofila.lifeSpan = 10;

        printInfo(roza);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(gipsofila);

        System.out.println();
        ptintCostOfFlower(
                roza,roza,roza,
                hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,
                gipsofila );
            }
    private static void printInfo(Flower flower) {
        System.out.println("Цвет: " +flower.getFlowerColor()+ ", страна: " + flower.getCountry() +
                ", стоимость за штуку: " + flower.getCost() + ", срок стояния цыетка: " + flower.lifeSpan);
    }
    private static void ptintCostOfFlower (Flower...flowers)   {
    double totalCost = 0;
    int mimLifeSpan = Integer.MAX_VALUE;
    for (Flower flower: flowers) {
        if (flower.lifeSpan<mimLifeSpan){
            mimLifeSpan = flower.lifeSpan;
        }
        totalCost+= flower.getCost();
        printInfo(flower);
    }
    totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + mimLifeSpan);
}
}
