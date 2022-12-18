public class Automobile {
   public String brand;
   public String model;
   public String engineVolume;
   public String color;
   public int year;
   public String country;

   public void showInformationAboutCar (Automobile automobile){
      System.out.println(automobile);
   }

   @Override
   public String toString() {
      return " Марка автомобиля: " + brand + "\n" +
              " Модель: " + model  + "\n" +
              " Объем двигателя: " + engineVolume + "\n" +
              " Цвет: " + color + "\n" +
              " Год выпуска: " + year + "\n" +
              " Страна сборки: " + country + "\n";
   }
}
