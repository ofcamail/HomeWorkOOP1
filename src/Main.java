public class Main {
    public static void main(String[] args) {
        Automobile lada = new Automobile();
        Automobile audi = new Automobile();
        Automobile bmw = new Automobile();
        Automobile kia = new Automobile();
        Automobile hyundai = new Automobile();

        lada.brand = "Lada";
        lada.year = 2015;
        lada.country = "Россия";
        lada.color = "Желтый";
        lada.engineVolume = "1,7 л";
        lada.model = "Granta";
        audi.brand = "Audi";
        audi.model = "A8 50L TDI quattro";
        audi.year = 2020;
        audi.country = "Германия";
        audi.color = "Черный";
        audi.engineVolume = "3,0 л";
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.country = "Германия";
        bmw.year = 2021;
        bmw.color = "Черный";
        bmw.engineVolume = "3,0 л";
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.year = 2018;
        kia.country = "Южная корея";
        kia.color = "Красный";
        kia.engineVolume = "2,4 л";
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.country = "Южная Корея";
        hyundai.color = "Оранжевый";
        hyundai.engineVolume = "1,6 л";
        hyundai.year = 2016;
        lada.showInformationAboutCar(lada);
        audi.showInformationAboutCar(audi);
        bmw.showInformationAboutCar(bmw);
        kia.showInformationAboutCar(kia);
        hyundai.showInformationAboutCar(hyundai);


    }
}