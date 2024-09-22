package com.adso.servicios.web.Servicios;

public class AdminResponse {

    private boolean success;

    public AdminResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
