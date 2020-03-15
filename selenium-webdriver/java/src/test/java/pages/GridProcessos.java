package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import support.DriverQA;

public class GridProcessos {

    private DriverQA driver;

    public GridProcessos(DriverQA driverQA) {
        driver = driverQA;
    }

    public void clickNovoProcesso() {
        driver.click("btn-novo");
    }

    public boolean existeTexto(String message) {
        return driver.getTextAllPage(message);

    }
    public void deletarElemento(String id) {
        driver.click("btn-delete_"+id, "id");
    }
}
