package com.luv2code.curddemo.dao;

import com.luv2code.curddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOCase1 implements StudentDAO{

    // Define field for entity manager
    private EntityManager entityManager;

    // Inject entity manager object
    @Autowired
    public StudentDAOCase1(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    // save data to database
    @Override
    @Transactional
    public void save(Student theStudent) {
        this.entityManager.persist(theStudent);
    }

    @Override
    public Student findStudent(int id) {
        Student student = this.entityManager.find(Student.class, id);
        return student;
    }

    @Override
    public List<Student> findAllStudent() {
        Query typedQuery = this.entityManager.createQuery("SELECT s FROM Student s", Student.class);
        List<Student> allStudentList = typedQuery.getResultList();
        return allStudentList;
    }

    @Override
    public List<Student> findByFirstName( String someFirstName ) {
        Query typedQuery = this.entityManager.createQuery("SELECT s FROM Student s WHERE " +
                                                            "firstName=:firstNamePlaceholder", Student.class);
        typedQuery.setParameter("firstNamePlaceholder", someFirstName);

        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateStudentFirstName(int id, String newFirstName){
        Student student = this.entityManager.find(Student.class, id);
        student.setFirstName(newFirstName);
        this.entityManager.merge(student);
    }

    @Override
    @Transactional
    public int updateMultiStudentLastName(String FirstName, String newLastName){
        Query query = entityManager.createQuery(
                "UPDATE Student stu " +
                        "SET stu.lastName =:newLastNamePlaceholder " +
                        "WHERE stu.firstName=:firstNamePlaceholder");
        query.setParameter("newLastNamePlaceholder",newLastName);
        query.setParameter("firstNamePlaceholder",FirstName);
        int numsRowUpdated =query.executeUpdate();
        return numsRowUpdated;
    }

    @Override
    @Transactional
    public int deleteOneStudent(int id) {
        Query query = entityManager.createQuery(
                "DELETE FROM Student stu WHERE stu.id=?1");
        query.setParameter(1, id);
        return query.executeUpdate();
    }

}


