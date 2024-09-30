package com.projetogabriel.userdept.reoisitories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.projetogabriel.userdept.entities.Pessoa;



public interface UserRepository extends JpaRepository<Pessoa, Long>
{
}
