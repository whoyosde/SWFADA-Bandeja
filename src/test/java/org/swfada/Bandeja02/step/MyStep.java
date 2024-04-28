package org.swfada.Bandeja02.step;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.swfada.Bandeja02.page.MyPage;


public class MyStep extends MyPage {

    @Steps(shared = true)
    MyStep Bandeja02Step;

    @Step ("Click en el botón Aceptar de la pantalla de obligaciones")
    public void clckBotonAceptarObligaciones(){
        btnAceptarObligaciones.click();
    }

    @Step ("Seleccionar puesto de trabajo")
    public void seleccionarPuestoTrabajoLista (int cantidad){
        for (int i=0; i<cantidad; i++){
            Actions act = new Actions (getDriver());
            act.click (opcionPuestoTrabajo.get(i)).perform();
        }
    }

    @Step ("Click en icono de nueva comunicación")
    public void clickIconoNuevaComunicacion () {
    iconoNuevaComunicacion.click();
    }

    @Step ("Ingresar asunto")
    public void ingresarAsunto (String asunto) {
    txt_asunto.sendKeys(asunto);
    }

    @Step ("Ingresar código de expediente relacionado")
    public void ingresarCodigoExpedienteRelacionado (String codigoExpediente){
    txt_codigoExpedienteRelacionado.sendKeys(codigoExpediente);
    }

    @Step ("Seleccionar archivo para documentación")
    public void seleccionarArchivo (String nombreArchivo) {
    }

    @Step ("Ingresar mensaje")
    public void ingresarMensaje (String mensaje) {
        txt_mensaje.sendKeys(mensaje);
    }

    @Step ("Seleccionar destinos de la comunicación")
    public void seleccionarDestinosComunicacion (int cantidad) {
        for (int i=0; i<cantidad; i++) {
            Actions act = new Actions(getDriver());
            act.click(destinosComunicacion.get(i)).perform();
        }
    }

    @Step ("Indicar si requiere o no requiere solicitar respuesta a destinatarios")
    public void solicitarRespuestaDestinatario () {
        btnCheckbox.isDisabled() ;
    }

    @Step ("Presionar el botón Enviar a Portafirmas")
    public void presionarBotonPortafirmas (){
        btnEnviarPortafirmas.click();
    }

    @Step ("Seleccionar el documento a firmar")
    public void seleccionarDocumentoFirmar () {
        btnCheck.isDisabled();
    }





    }
