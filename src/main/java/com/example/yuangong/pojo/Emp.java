package com.example.yuangong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author 25686
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

    public Integer id        ;
    public String username   ;
    public String password   ;
    public String name       ;
    public short gender     ;
    public String image      ;
    public short job        ;
    public LocalDate entrydate  ;
    public Integer deptId ;
    public LocalDateTime createTime;
    public LocalDateTime updateTime;

}
