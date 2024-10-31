package org.example.finalworkapi.Application.DTOs;

import java.util.Date;

public class AddMaintenanceAdminDTO {
    private int vehicleId;
    private int administratorId;
    private int typeMaintenanceId;
    private int failureReportId;
    private Date dateMaintenance;
    private String descriptions;

    public AddMaintenanceAdminDTO(int vehicleId, int administratorId, int typeMaintenanceId, int failureReportId, Date dateMaintenance, String descriptions) {
        this.vehicleId = vehicleId;
        this.administratorId = administratorId;
        this.typeMaintenanceId = typeMaintenanceId;
        this.failureReportId = failureReportId;
        this.dateMaintenance = dateMaintenance;
        this.descriptions = descriptions;
    }

    public AddMaintenanceAdminDTO() {}

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public int getTypeMaintenanceId() {
        return typeMaintenanceId;
    }

    public void setTypeMaintenanceId(int typeMaintenanceId) {
        this.typeMaintenanceId = typeMaintenanceId;
    }

    public int getFailureReportId() {
        return failureReportId;
    }

    public void setFailureReportId(int failureReportId) {
        this.failureReportId = failureReportId;
    }

    public Date getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(Date dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}