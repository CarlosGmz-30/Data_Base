package mx.edu.utez;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import mx.edu.utez.model.MyObjectBox;
import mx.edu.utez.model.User;

import java.util.List;

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

        // Recuperar un usuario por ID
        User userToUpdate = userBox.get(1);
        if (userToUpdate != null) {
            userToUpdate.setName("NuevoNombre");
            userBox.put(userToUpdate);
            System.out.println("Usuario actualizado: " + userToUpdate);
        } else {
            System.out.println("Usuario no encontrado.");
        }

        // Recuperar un usuario por ID
        User userToDelete = userBox.get(1);
        if (userToDelete != null) {
            userBox.remove(userToDelete);
            System.out.println("Usuario eliminado: " + userToDelete);
        } else {
            System.out.println("Usuario no encontrado.");
        }

        // Get General
        // Obtener todos los usuarios de la base de datos
        List<User> allUsers = userBox.getAll();

        // Imprimir la información de todos los usuarios
        System.out.println("Lista de todos los usuarios:");

        for (User users : allUsers) {
            System.out.println(users);
        }
    }
}