package com.example.Adapter;

public class PaypalAdapter  implements ProcesadorPagos{

    private PaypalApi paypalApi;

    public PaypalAdapter(PaypalApi paypalApi) {
        this.paypalApi = paypalApi;
    }

    @Override
    public void procesarPago(double cantidad) {
        paypalApi.realizarPagoPaypal(cantidad);
    }
}
