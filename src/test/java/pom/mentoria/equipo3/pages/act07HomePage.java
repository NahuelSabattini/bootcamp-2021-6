package pom.mentoria.equipo3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.mentoria.equipo3.base.SeleniumBase;

public class act07HomePage extends SeleniumBase {

    public act07HomePage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait espera= new WebDriverWait(driver, 8000);

    private String URL = "https://www.viajesfalabella.cl/";

    String aeropuerto = "Aeropuerto Desierto de Atacama, Copiapo, Chile";
    String hotel = "Hampton by Hilton Antofagasta - Avenida Edmundo Pérez Zujovic, Antofagasta, Chile";
    String diaArribo = "25";
    String horaArribo = "12:00";

    By traslados = By.xpath("//label[.='Traslados']");
    By calendario = By.xpath("//*[@class='datepicker-transfers sbox-v4-components']");
    By desdeElAeropuerto = By.xpath("//*[@class='radio-circle sbox-radio-circle']");
    By inputAeropuerto = By.xpath("//*[@class='sbox-place-container -mb4-s']//input[@placeholder='Ingresa un aeropuerto']");
    By inputHotel = By.xpath("//*[@class='sbox-second-place-container']//span[@class='input-gradient']/..//input");
    By inputFecha = By.xpath("//*[@id=\"searchbox\"]//input[@placeholder='Arribo']");
    By spanDia = By.xpath("//*[@class='datepicker-transfers sbox-v4-components']//span[@class='_dpmg2--date _dpmg2--available']//span[.='" + diaArribo + "']");
    By buscar = By.xpath("//em[@class='btn-text']");
    By recomendaciones_aeropuerto = By.xpath("//ul[@class='ac-group-items']");
    By recomendaciones_hotel = By.xpath("//*[@class='ac-wrapper -desktop -facet -show']//ul");
    By span_hora = By.xpath("//span[.='hora']/..//select");

    public void act07_TrasladosFamiliaDesde(){

        obtenerUrl(URL);
        clickear(traslados);
        clickear(desdeElAeropuerto);
        type("Aeropuerto Desierto de Atacama, Copiapo, Chile",inputAeropuerto);
        espera(recomendaciones_aeropuerto,inputAeropuerto);
        type("Hampton by Hilton Antofagasta - Avenida Edmundo Pérez Zujovic, Antofagasta, Chile",inputHotel);
        espera(recomendaciones_hotel,inputHotel);
        clickear(inputFecha);
        clickear(spanDia);
        select_dia_hora(span_hora, horaArribo);
        clickear(buscar);


    }





}
