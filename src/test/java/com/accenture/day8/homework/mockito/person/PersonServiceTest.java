package com.accenture.day8.homework.mockito.person;

import com.accenture.day8.homework.mockito.contract.ContractService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Test
    public void givenStringPersonName_WhenFindByNameInvoked_ThenReturnListOfPersonsWithInputName() {
        var personRepoMock = Mockito.mock(PersonRepository.class);
        var contractServiceMock = Mockito.mock(ContractService.class);
        var reqName = "Gigi";
        var expected = List.of(
                new Person(1, "Gigi", 21),
                new Person(2, "Gigi", 22));

        Mockito.when(personRepoMock.findByName(reqName))
                .thenReturn(expected);

        PersonService personService = new PersonService(personRepoMock, contractServiceMock);
        var actual = personService.findByName(reqName);
        assertEquals(expected, actual);
    }

    @Test
    public void whenFindAllEmployedPersonsInvoked_ThenReturnListOfEmployedPersons() {
        var personRepoMock = Mockito.mock(PersonRepository.class);
        var contractServiceMock = Mockito.mock(ContractService.class);

        Mockito.when(personRepoMock.findAll())
                .thenReturn(List.of(
                        new Person(1, "Gigi", 21),
                        new Person(2, "Gigi", 22),
                        new Person(3, "Gigi", 23)
                ));

        Mockito.when(contractServiceMock.isEmployed(1))
                .thenReturn(true);
        Mockito.when(contractServiceMock.isEmployed(2))
                .thenReturn(true);
        Mockito.when(contractServiceMock.isEmployed(3))
                .thenReturn(false);

        PersonService personService = new PersonService(personRepoMock, contractServiceMock);

        var expected = List.of(
                new Person(1, "Gigi", 21),
                new Person(2, "Gigi", 22));

        var actual = personService.findAllEmployedPersons();

        assertEquals(expected, actual);
    }

    @Test
    public void whenFindAllEmployedPersonsMoreEfficientlyInvoked_ThenReturnListOfEmployedPersons() {
        var personRepoMock = Mockito.mock(PersonRepository.class);
        var contractServiceMock = Mockito.mock(ContractService.class);
        List<Integer> personIds = List.of(1, 2, 3, 4);

        var expected = List.of(
                new Person(1, "Gigi", 21),
                new Person(2, "Gigi", 22),
                new Person(3, "Gigi", 22),
                new Person(4, "Gigi", 22));

        Mockito.when(personRepoMock.findPersonsWhereIdIn(personIds))
                .thenReturn(expected);
        Mockito.when(contractServiceMock.getContractIdsWhereExpirationDateBiggerThen(Mockito.any(LocalDateTime.class)))
                .thenReturn(personIds);
        var personService = new PersonService(personRepoMock, contractServiceMock);
        List<Person> actual = personService.findAllEmployedPersonsMoreEfficiently();
        assertEquals(expected, actual);
    }

    @Test
    public void whenFindAllEmployedPersonsMoreEfficientlyInvoked_ThenReturnListOfEmployedPersonsByCallingMethodOnce() {
        var personRepoMock = Mockito.mock(PersonRepository.class);
        var contractServiceMock = Mockito.mock(ContractService.class);
        List<Integer> personIds = List.of(1, 2, 3, 4);

        var expected = List.of(
                new Person(1, "Gigi", 21),
                new Person(2, "Gigi", 22),
                new Person(3, "Gigi", 22),
                new Person(4, "Gigi", 22));

        Mockito.when(personRepoMock.findPersonsWhereIdIn(personIds))
                .thenReturn(expected);
        Mockito.when(contractServiceMock.getContractIdsWhereExpirationDateBiggerThen(Mockito.any(LocalDateTime.class)))
                .thenReturn(personIds);
        var personService = new PersonService(personRepoMock, contractServiceMock);
        List<Person> actual = personService.findAllEmployedPersonsMoreEfficiently();
        assertEquals(expected, actual);
        Mockito.verify(personRepoMock, Mockito.times(1)).findPersonsWhereIdIn(Mockito.anyList());
    }

    @Test
    public void testFindPersonsWhereIdInGetExpectedParams() {
        var personRepoMock = Mockito.mock(PersonRepository.class);
        var contractServiceMock = Mockito.mock(ContractService.class);
        var personIds = List.of(1, 2, 3, 4);

        var expected = List.of(
                new Person(1, "Gigi", 21),
                new Person(2, "Gigi", 22),
                new Person(3, "Gigi", 22),
                new Person(4, "Gigi", 22));

        Mockito.when(personRepoMock.findPersonsWhereIdIn(personIds))
                .thenReturn(expected);
        Mockito.when(contractServiceMock.getContractIdsWhereExpirationDateBiggerThen(Mockito.any(LocalDateTime.class)))
                .thenReturn(personIds);
        var personService = new PersonService(personRepoMock, contractServiceMock);
        List<Person> actual = personService.findAllEmployedPersonsMoreEfficiently();
        assertEquals(expected, actual);
        ArgumentCaptor<List<Integer>> personIdsCaptor = ArgumentCaptor.forClass(List.class);
        Mockito.verify(personRepoMock, Mockito.times(1)).findPersonsWhereIdIn(personIdsCaptor.capture());
        assertEquals(personIds, personIdsCaptor.getValue());
    }
}
