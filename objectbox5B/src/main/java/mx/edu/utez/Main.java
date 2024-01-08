package mx.edu.utez;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import mx.edu.utez.model.MyObjectBox;
import mx.edu.utez.model.User;

public class Main {
    public static void main(String[] args) {
        // Referencia a la base de datps
        BoxStore boxStore = MyObjectBox.builder()
                .name("usuarios")
                .build();
        // Referencia a la colección o clase
        Box<User> userBox = boxStore.boxFor(User.class);

        // Inserción
        User user = new User();
        user.id = 0;
        user.name = "Charlie";
        userBox.put(user);

        // Recuperación por Id
        User recuperado = userBox.get(1);
        System.out.println(recuperado);


    }
}