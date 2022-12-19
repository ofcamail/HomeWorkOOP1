public class Main {

    public static void main(String[] args) {
        //task1();
        task2();
        task3();
    }
    /*
    public static void task1() {
    System.out.println("Задание 1");
        Automobile lada = new Automobile();
        Automobile audi = new Automobile();
        Automobile bmw = new Automobile();
        Automobile kia = new Automobile();
        Automobile hyundai = new Automobile();

        lada.brand = "Lada";
        lada.year = 2015;
        lada.country = "Россия";
        lada.color = "Желтый";
        lada.engineVolume = 1.7;
        lada.model = "Granta";
        audi.brand = "Audi";
        audi.model = "A8 50L TDI quattro";
        audi.year = 2020;
        audi.country = "Германия";
        audi.color = "Черный";
        audi.engineVolume = 3.0;
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.country = "Германия";
        bmw.year = 2021;
        bmw.color = "Черный";
        bmw.engineVolume = 3.0;
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.year = 2018;
        kia.country = "Южная корея";
        kia.color = "Красный";
        kia.engineVolume = 2.4;
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.country = "Южная Корея";
        hyundai.color = "Оранжевый";
        hyundai.engineVolume = 1.6;
        hyundai.year = 2016;
        lada.showInformationAboutCar(lada);
        audi.showInformationAboutCar(audi);
        bmw.showInformationAboutCar(bmw);
        kia.showInformationAboutCar(kia);
        hyundai.showInformationAboutCar(hyundai);
    }*/
    public static void task2() {
        System.out.println("Задание 2");
        Automobile lada = new Automobile("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Automobile audi = new Automobile("Audi", "A8 50 L quattro", 3.0, "Черный", 2020, "Германия");
        Automobile bmw = new Automobile("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Automobile kia = new Automobile("KIA", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        Automobile hyundai = new Automobile("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        lada.showInformationAboutCar(lada);
        audi.showInformationAboutCar(audi);
        bmw.showInformationAboutCar(bmw);
        kia.showInformationAboutCar(kia);
        hyundai.showInformationAboutCar(hyundai);

    }
    public static void task3(){
        System.out.println("Задание 3");
        Automobile lada = new Automobile("Lada", "Granta", 1.7, "Желтый", 2015, "");
        Automobile audi = new Automobile("Audi", "A8 50 L quattro", 0, "Черный", 2020, "Германия");
        Automobile bmw = new Automobile("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Automobile kia = new Automobile("KIA", "", 2.4, "Красный", 2018, "Южная Корея");
        Automobile hyundai = new Automobile("Hyundai", "Avante", 1.6, null, 2016, "Южная Корея");

        lada.showInformationAboutCar(lada);
        audi.showInformationAboutCar(audi);
        bmw.showInformationAboutCar(bmw);
        kia.showInformationAboutCar(kia);
        hyundai.showInformationAboutCar(hyundai);
    }
}