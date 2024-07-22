package org.example.base;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-22T18:15:35+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
public class PersonMapStructImpl implements PersonMapStruct {

    @Override
    public Person personDtoToPerson(PersonDto personDto) {
        if ( personDto == null ) {
            return null;
        }

        Person person = new Person();

        person.setFullName( personDto.getName() );
        person.setYear( personDto.getAge() );
        person.setAddress( personDto.getAddress() );
        person.setEmail( personDto.getEmail() );
        person.setGender( personDto.getGender() );
        person.setNationality( personDto.getNationality() );
        person.setEducation( personDto.getEducation() );

        return person;
    }
}
