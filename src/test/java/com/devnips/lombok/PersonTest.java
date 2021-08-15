package com.devnips.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    public void data_annotation() {
        Person person = new Person();
        person.setName("David Hoff");
        person.setAge(25);

        Assertions.assertEquals("David Hoff", person.getName());
        Assertions.assertEquals(25, person.getAge());
    }
}