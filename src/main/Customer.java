package main;

public class Customer extends Person {

    public Customer(String name, int money) {
        super(name, money);
    }

    public void orderCoffee(Barista barista, Cashier cashier, Menu coffee, String temperature) throws Exception {
        cashier.calculate(this, barista, coffee, temperature);
    }

    public boolean payMoney(int price) throws Exception {
        int money = getMoney() - price;
        changeMoney(money);

        if (money < 0) {
            System.out.println("잔액이 부족합니다.");
            throw new Exception("잔액이 부족합니다.");
        }

        System.out.println("==결제 완료==");
        System.out.println(getName() + "님의 잔액 : " + getMoney());
        return true;
    }

}
