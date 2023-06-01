package DefiningClassesLab;


import java.sql.Struct;

class Car {

    // Полета -> Характеристиките на класа

    private String brand;
    private String model;
    private int horsePower;




    public Car() {


    }

    public Car(String brand, String model, int hp) {
        this.setBrand(brand);
        this.setModel(model);
        this.setHorsePower(hp);

    }

    public Car(String brand) {
        this.setBrand(brand);
        this.setModel("unknown");
        this.horsePower = -1;
    }

    // методи
    // getters -> методи които осигоряват достъпа до полетата
    // setters -> методи, чрез които задаваме стойност на полетата - VOID метод
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String toString() {
        return String.format("The car is: %s %s - %d HP."
                , this.getBrand(), this.getModel(), this.getHorsePower());


        // hashCode -> метод, който ни връща цифровата репрезентация на нашия обект
    }
}


