package com.busycoder.session2.ex5;
import java.util.Optional;
// ------------------------------------------
// Real-world example:
// Person -> Car -> Insurance -> Company Name
// ------------------------------------------

class Person {
    // A person may or may not have a car
    private Optional<Car> car;
    public Optional<Car> getCar() {
        return car;
    }
    public void setCar(Optional<Car> car) {
        this.car = car;
    }
}

class Car {
    // A car may or may not have insurance
    private Optional<Insurance> insurance;
    public Optional<Insurance> getInsurance() {
        return insurance;
    }
    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }
}

class Insurance {
    private String companyName;
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
class UserNotFoundEx extends RuntimeException {
}
class InsuranceNotFound extends RuntimeException {
}
public class DemoOptionalRealWorld {
    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();
        Insurance insurance = null;
        Optional<Person> personOpt = Optional.ofNullable(person);

        Optional<Car> carOpt = Optional.ofNullable(car);

        Optional<Insurance> insuranceOpt = Optional.ofNullable(insurance);

        person.setCar(carOpt);
        car.setInsurance(insuranceOpt);

        String companyName =
                getInsuranceCompanyName(personOpt);

        System.out.println(companyName);

        String name = "raja";

        Optional<String> nameOpt = Optional.ofNullable(name);

        System.out.println(nameOpt.orElseThrow(UserNotFoundEx::new));
    }

    public static String getInsuranceCompanyName(Optional<Person> personOpt) {
        return personOpt
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getCompanyName)
                .orElse("not found");
    }
}

