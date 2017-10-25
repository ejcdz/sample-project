package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Registry {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "extension_id", unique = true, nullable = false )
    private int registryId;

    private String firstname;

    private String middlename;

    private String lastname;

    private int age;

    public int getRegistryId() {
        return registryId;
    }

    public void setRegistryId( int registryId ) {
        this.registryId = registryId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname( String firstname ) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename( String middlename ) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname( String lastname ) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

}
