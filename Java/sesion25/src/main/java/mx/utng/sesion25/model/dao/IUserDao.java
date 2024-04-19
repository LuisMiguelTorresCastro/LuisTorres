package mx.utng.sesion25.model.dao;

import org.hibernate.mapping.List;

public interface IUserDao {
    
    //Lista usuario
    List<User> list();

    //Guardar un usuario
    void save(User user);

    //Obetener un usuario a partir del id
    User getById(long id);

    //Eliminar un usuario por el id
    void delete(long id);

}
