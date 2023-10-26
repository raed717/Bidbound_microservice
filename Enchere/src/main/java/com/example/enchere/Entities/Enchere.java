package com.example.enchere.Entities
import jakarta.persistence.*;
import jakarta.ws.rs.DefaultValue;
import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Enchere implements Serializable {
private Long id;
private String product;
private String seller;
private Date startDate;
private Date endDate;

public int getId() {
        return id;
        }

public Date getEndDate() {
        return endDate;
        }

public void setEndDate(Date endDate) {
        this.endDate = endDate;
        }

public Date getStartDate() {
        return startDate;
        }
public void setStartDate(Date StartDate){
        this.startDate=StartDate;
        } }
