import models.Auto;
import models.User;
import services.AutoService;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        // ������� ������ UserService
        UserService userService = new UserService();

        //������� ��� ��������� ������ User � ��������� �� � ��
        User user1 = new User("David", 19);
        userService.saveUser(user1);
        System.out.println("Save user " + user1);

        User user2 = new User("Ivan", 24);
        userService.saveUser(user2);
        System.out.println("Save user " + user2);

        // ���� ������������ �� Id � ��
        var foundedUser = userService.findUser(2);
        System.out.println("Founded user " + foundedUser);


        System.out.println("*******************************");


        // ������� ������ AutoService
        AutoService autoService = new AutoService();

        // ������� 3 ���������� Auto � ��������� �� � ��
        Auto auto1 = new Auto("Tesla Model S", "Red");
        auto1.setUser(user1);
        autoService.saveAuto(auto1);
        System.out.println("Save Auto " + auto1);

        Auto auto2 = new Auto("KIA Optima", "Dark blue");
        auto2.setUser(user2);
        autoService.saveAuto(auto2);
        System.out.println("Save Auto " + auto2);

        Auto auto3 = new Auto("Porsche Cayenne", "Black");
        auto3.setUser(user2);
        autoService.saveAuto(auto3);
        System.out.println("Save Auto " + auto3);

        // ���� ���� �� Id � ��
        var foundedAuto = autoService.findAuto(1);
        System.out.println("Founded auto " + foundedAuto);

        // �������� ������������ �� id ����
        int auto_id = 3;
        var foundedAutoUser = autoService.findOwnerByAutoId(auto_id);
        System.out.println("Founded user owning auto with id="+ auto_id +": " + foundedAutoUser);

    }
}
