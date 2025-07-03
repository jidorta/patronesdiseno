package com.example.Adapter;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class PaypalAdapterTest {


    @Test
    void procesarPago_deberiaLlamarMetodoDePaypalApi(){

        //Creamos un mock de Paypal
        PaypalApi paypalApiMock = mock(PaypalApi.class);

        //Creamos el adapter con el mock
        ProcesadorPagos adapter = new PaypalAdapter(paypalApiMock);

        adapter.procesarPago(150.0);
        verify(paypalApiMock, times(1)).realizarPagoPaypal(150.0);
    }
}
