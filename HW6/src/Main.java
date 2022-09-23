import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client first = new Client("Josh",34,708907);
        Client second = new Client("Bill",17,908772);
        Client third = new Client("Mark",25,645293);
        Scanner in = new Scanner(System.in);
        Account acc1 = new Account(9887);
        Account acc2 = new Account(5428);
        Account acc3 = new Account(9887);
        first.addAccount(9887);
        second.addAccount(5428);
        third.addAccount(8452);
        third.addAccount(9023);

        Map<Account,Client> cl = new HashMap<>();
        cl.put(acc1,first);
        cl.put(acc2,second);
        cl.put(acc3,third);
        System.out.println("Введите номер счета для получения клиента: ");
        int searchAccId = in.nextInt();
        Account searchAcc = new Account(searchAccId);
        System.out.println(cl.get(searchAcc).toString());

        Map<Client, Client> cl2 = new HashMap<>();
        cl2.put(first,first);
        cl2.put(second,second);
        cl2.put(third,third);
        System.out.println("Введите Id клиента для получения его счетов: ");
        int id = in.nextInt();
        System.out.println("Введите возраст клиента для получения его счетов: ");
        int age = in.nextInt();
        System.out.println("Введите имя клиента для получения его счетов: ");
        String name = in.next();
        Client searchClient = new Client(name,age,id);
        System.out.println(cl2.get(searchClient).toString());
    }
}