package com.engeto.project2.project2_story.repositories;

import com.engeto.project2.project2_story.model.User;

import java.util.List;

public interface UserRepository {


//    založení nového uživatele
    int createUser(User user);


    //    informace o uživateli
    Object selectUserByID(Long ID, boolean detail);

    //    informace o všech uživatelích
    List<Object> selectAllUsers(boolean detail);


//    upravit informace o uživateli
    int updateUser(Object userObject);


//    smazat uživatele
    int deleteUserByID(Long ID);

    // najít uživatele podle jména
    List<User> findByNameContaining(String name, boolean detail);
}
