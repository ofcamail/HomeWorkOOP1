public class Automobile {
   public String brand;
   public String model;
   public double engineVolume;
   public String color;
   public int year;
   public String country;

   Automobile(String brand, String model, double engineVolume, String color, int year, String country) {
      this.brand = brand;
      if (brand == null||brand.isEmpty()) {
         this.brand = "default";
      }
      this.model = model;
      if (model == null||model.isEmpty()) {
         this.model = "default";
      }
      this.year = year;
      if(year <=0){
         this.year =2000;
      }
      this.color = color;
      if (color==null || color.isEmpty()) {
         this.color = "Белый";
      }
      this.engineVolume = engineVolume;
      if(engineVolume<=0){
         this.engineVolume = 1.5;
      }
      this.country = country;
      if (country==null||country.isEmpty()){
         this.country = "default";
      }

   }

   public void showInformationAboutCar (Automobile automobile){
      System.out.println(automobile);
   }

   @Override
   public String toString() {
      return " Марка автомобиля: " + brand + "\n" +
              " Модель: " + model  + "\n" +
              " Объем двигателя: " + engineVolume + " л" + "\n" +
              " Цвет: " + color + "\n" +
              " Год выпуска: " + year + "\n" +
              " Страна сборки: " + country + "\n";
   }
}
