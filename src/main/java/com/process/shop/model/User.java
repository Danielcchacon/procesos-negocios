package com.process.shop.model;

import java.util.Date;
import java.util.List;

import com.process.shop.model.enums.DocumenType;
import lombok.Builder;
import lombok.Data;  //Dependencia de @Data


//@Getter0
//@Setter
//@RequiredArgsConstructor

@Data  //Forma rapida de crear Setter Getters y constructores, nos evitamos las 3 anteriores lineas
@Builder
public class User {


    private  String fullName;
    private String document;
    private DocumenType documentType;
    private Date birthDay;
    private String phoneNumber;
    private String email;
    private String password;
    private List<Address> address;




}
