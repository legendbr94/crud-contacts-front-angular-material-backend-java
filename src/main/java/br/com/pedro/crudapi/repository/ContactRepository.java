package br.com.pedro.crudapi.repository;

import br.com.pedro.crudapi.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository  extends JpaRepository<Contact, Long> {
}
