package com.garm.dto;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LogCustomFieldDto {

    private String app_name;
    private String app_version;
    private String app_port;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
