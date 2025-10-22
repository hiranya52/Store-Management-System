package model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerInfoDTO {

    private String cusID;
    private String title;
    private String name;
    private String dob;
    private double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;

}

