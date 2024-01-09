package mx.edu.utez;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import mx.edu.utez.model.MyObjectBox;
import mx.edu.utez.model.User;
import mx.edu.utez.model.User_;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Referencia a la base de datps
        BoxStore boxStore = MyObjectBox.builder()
                .name("usuarios")
                .build();
        // Referencia a la colección o clase
        Box<User> userBox = boxStore.boxFor(User.class);

        /* Inserción
        User user = new User();
        user.id = 0;
        user.name = "Hugo";
        userBox.put(user);
        */

        /* Recuperación por Id
        User recuperado = userBox.get(1);
        System.out.println(recuperado);
        */


        /* Actualización
        User userToUpdate = userBox.get(1);
        if (userToUpdate != null) {
            userToUpdate.setName("Daniela");
            userBox.put(userToUpdate);
            System.out.println("Usuario actualizado: " + userToUpdate);
        } else {
            System.out.println("Usuario no encontrado.");
        }*/

        /* Borrado directo
        userBox.remove(1);
        // Buscar registro y después se borra
        recuperado = userBox.get(1);
        userBox.remove(recuperado.getId());*/

        /* Borrado con comprobación
        User userToDelete = userBox.get(1);
        if (userToDelete != null) {
            userBox.remove(userToDelete);
            System.out.println("Usuario eliminado: " + userToDelete);
        } else {
            System.out.println("Usuario no encontrado.");
        }*/

        /* Recuperar todos los registros
        List<User> allUsers = userBox.getAll();
        System.out.println("Lista de todos los usuarios:");
        for (User users : allUsers) {
            System.out.println(users);
        }
        */

        Query<User> query = userBox
                .query(User_.name.equal("Charlie"))
                //.order(User_.name)
                .build();
        List<User> results = query.find();
        query.close();
        for (User user : results) {
            System.out.println(user);
        }


    }
}